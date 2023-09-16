package StepDefinition.prestamype;

import Base.BaseTest;
import io.cucumber.java.es.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AdminTest extends BaseTest {

    private ChromeDriver driver;
    private Properties properties;


  @Test(priority = 1)
    @Dado("que he ingresado al browser admin")
    public void queheingresadoalbrowseradmin() throws IOException, InterruptedException {

        properties = new Properties();
        FileInputStream input = new FileInputStream("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\resources\\configfiles\\config.properties");
        properties.load(input);

        System.setProperty("webdriver.chrome.driver", properties.getProperty("chromeDriverPath"));
        ChromeOptions co = new ChromeOptions();
        co.setBinary(properties.getProperty("BinaryPath"));
        driver = new ChromeDriver(co);
        driver.get(properties.getProperty("url.prestamype.admin"));
        driver.manage().window().maximize();
        Thread.sleep(10);
    }
    @Test(priority = 2)
    @Cuando("usuario ingresa a inversionista {string} {string}")
    public void usuario_ingresa_a_inversionista(String usuadmin, String adminpassword) throws InterruptedException {
        Thread.sleep(3000);
        WebElement useradmin = driver.findElement(By.xpath("//div[@class='login-box-input']//div[1]//div[1]//input[1]"));
        useradmin.sendKeys(usuadmin);
        WebElement passadmin = driver.findElement(By.xpath("//input[@type='password']"));
        passadmin.sendKeys(adminpassword);
    }

    @Entonces("realizar click en comenzar")
    public void realizar_click_en_comenzar() throws InterruptedException {
        Thread.sleep(3000);
        WebElement btncomenzar = driver.findElement(By.xpath("//button[normalize-space()='Comenzar']"));
        btncomenzar.click();

    }

    @Entonces("al modulo facturas")
    public void al_modulo_facturas() throws InterruptedException {
      Thread.sleep(4000);
        WebElement factura = driver.findElement(By.xpath("//label[@data-qa='facturas']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", factura);
        factura.click();
    }
    @Entonces("realizar modulo depositos y retiros")
    public void realizar_modulo_depositos_y_retiros() throws InterruptedException {
      Thread.sleep(4000);
      WebElement depositos = driver.findElement(By.xpath("//a[@href='/factoring/depositos-retiros']"));
      depositos.click();

    }

    @Entonces("burcar email {string}")
    public void burcar_email(String mail) throws InterruptedException {
        Thread.sleep(4000);
        WebElement buscardeposito = driver.findElement(By.xpath("//input[@placeholder='Buscar']"));
        buscardeposito.sendKeys(mail);
        WebElement btnbuscar = driver.findElement(By.xpath("(//button)[1]"));
        btnbuscar.click();

    }

    @Entonces("procesar transferencia {string} {string}")
    public void procesar_transferencia(String comision, String codigodeoperacion) throws InterruptedException {
        Thread.sleep(4000);
        WebElement edicion = driver.findElement(By.xpath("(//span)[79]"));
        edicion.click();
        Thread.sleep(4000);
        WebElement cuentaescorrecta = driver.findElement(By.xpath("//span[normalize-space()='¿La cuenta es correcta?']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", cuentaescorrecta);
        Thread.sleep(4000);
        WebElement comis = driver.findElement(By.xpath("(//input)[19]"));
        comis.clear();
        comis.sendKeys(comision);
        Thread.sleep(4000);
        WebElement codigo = driver.findElement(By.xpath("//span[normalize-space()='Código de transferencia']"));
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", codigo);
        Thread.sleep(4000);
        WebElement codigodeoper= driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[5]/div/div[2]/div[2]/div[13]/div"));
        codigodeoper.sendKeys(codigodeoperacion);


    }




    @Entonces("al modulo inversionista")
    public void al_modulo_inversionista() throws InterruptedException {
        Thread.sleep(4000);
        WebElement inversion = driver.findElement(By.xpath("//label[@data-qa='inversionistas']"));
        inversion.click();
        if (driver.getCurrentUrl().contains("inversionistas")) {
            System.out.println("Se ingresó al módulo de inversionista correctamente.");
        } else {
            System.out.println("No se pudo ingresar al módulo de inversionista.");
        }

    }
    @Entonces("al modulo inversionista listado")
    public void al_modulo_inversionista_listado() throws InterruptedException {
      Thread.sleep(4000);
      WebElement listado = driver.findElement(By.xpath("//a[@href='/inversionistas']//span"));
      listado.click();


    }

    @Entonces("realizar la busqueda correspondiente {string}")
    public void realizar_la_busqueda_correspondiente(String ename) throws InterruptedException {
      Thread.sleep(4000);
      WebElement emails = driver.findElement(By.xpath("//input[@placeholder='Ingrese texto']"));
      emails.sendKeys(ename);
      WebElement btnbusqueda = driver.findElement(By.xpath("(//button)[1]"));
      btnbusqueda.click();

    }
    @Entonces("aprobar inversionista")
    public void aprobar_inversionista() throws InterruptedException {
      Thread.sleep(4000);
      WebElement editar = driver.findElement(By.xpath("(//span)[82]"));
      editar.click();

    }

    @Entonces("al modulo CMS")
    public void al_modulo_cms() throws InterruptedException {
      Thread.sleep(4000);
        WebElement cms = driver.findElement(By.xpath("(//span)[4]"));
        cms.click();
    }

    @Entonces("al modulo inversion en prestamos")
    public void al_modulo_inversion_en_prestamos() throws InterruptedException {
        Thread.sleep(1000);
        WebElement inverprestamo = driver.findElement(By.xpath("(//span)[27]"));
        inverprestamo.click();
    }

    @Entonces("ir al modulo perfil institucional")
    public void ir_al_modulo_perfil_institucional() throws InterruptedException {
        Thread.sleep(4000);
        WebElement perfil = driver.findElement(By.xpath("//a[@href='/inversionistas/perfiles-institucionales']//span"));
        perfil.click();
    }
    @Entonces("al modulo Inversion en prestamo")
    public void al_modulo_inversion_en_prestamo() throws InterruptedException {
        Thread.sleep(4000);
        WebElement inversionprestamo = driver.findElement(By.xpath("//label[@data-qa='inversión-en-préstamos']"));
        inversionprestamo.click();
    }
    @Entonces("creacion de perfil en prestamo")
    public void creacion_de_perfil_en_prestamo() throws InterruptedException {
      Thread.sleep(4000);
      WebElement perfilprestamo = driver.findElement(By.xpath("//a[@href='/inversiones/creacion']//span"));
      perfilprestamo.click();


    }
    @Entonces("registro de creacion de perfil")
    public void registro_de_creacion_de_perfil() throws InterruptedException {
      Thread.sleep(4000);
      WebElement createperfil = driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/button[1]"));
      createperfil.click();

    }

    @Entonces("click gestion de colocaciones")
    public void click_gestion_de_colocaciones() throws InterruptedException {
       Thread.sleep(4000);
       WebElement colocaciones = driver.findElement(By.xpath("//a[@href='/inversiones/oportunidades']//span"));
       colocaciones.click();
    }

    @Entonces("al modulo configuracion")
    public void al_modulo_configuracion() throws InterruptedException {
        Thread.sleep(4000);
        String script = "document.body.style.zoom='90%'";
        ((JavascriptExecutor) driver).executeScript(script);
        WebElement moduloconfiguracion = driver.findElement(By.xpath("//a[@href='/canales']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", moduloconfiguracion);
        Thread.sleep(6000);
        WebElement configuracion = driver.findElement(By.xpath("//label[@data-qa='configuración']//div"));
        configuracion.click();
    }

    @Entonces("realizar click sucursales")
    public void realizar_click_sucursales() throws InterruptedException {
        Thread.sleep(4000);
        WebElement crearsucursal = driver.findElement(By.xpath("//a[@href='/configuracion/sucursal']"));
        crearsucursal.click();

    }
    @Entonces("crear sucursal")
    public void crear_sucursal() throws InterruptedException {
        Thread.sleep(4000);

    }





}
