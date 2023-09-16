package StepDefinition.prestamype;

import io.cucumber.java.es.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class DepositoStep {

    private ChromeDriver driver;
    private Properties properties;


    @Dado("que he ingresado al navegador persona natural")
    public void que_he_ingresado_al_navegador_persona_natural() throws IOException, InterruptedException {
        properties = new Properties();
        FileInputStream input = new FileInputStream("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\resources\\configfiles\\config.properties");
        properties.load(input);

        System.setProperty("webdriver.chrome.driver", properties.getProperty("chromeDriverPath"));
        ChromeOptions co = new ChromeOptions();
        co.setBinary(properties.getProperty("BinaryPath"));
        driver = new ChromeDriver(co);
        driver.get(properties.getProperty("url.prestamype"));
        driver.manage().window().maximize();
        Thread.sleep(10);
    }
    @Cuando("hago clic en el enlace de inicio de sesión persona natural")
    public void hago_clic_en_el_enlace_de_inicio_de_sesión_persona_natural() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Ingresar inicio de sesion");
        WebElement iniciosesion = driver.findElement(By.xpath(properties.getProperty("iniciosesion")));
        iniciosesion.click();
        Thread.sleep(200);
    }
    @Cuando("ingreso el correo electrónico {string} persona natural")
    public void ingreso_el_correo_electrónico_persona_natural(String email) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Usuario ingresa username");
        WebElement user = driver.findElement(By.cssSelector(properties.getProperty("email")));
        user.sendKeys(email);
        System.out.println("El mail es : " + email);
    }
    @Cuando("ingreso la contraseña {string} persona natural")
    public void ingreso_la_contraseña_persona_natural(String pass) throws InterruptedException {
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.xpath(properties.getProperty("pass")));
        password.sendKeys(pass);
        System.out.println("El password es : " + pass);
    }
    @Cuando("hago clic en el botón de inicio de sesión persona natural")
    public void hago_clic_en_el_botón_de_inicio_de_sesión_persona_natural() throws InterruptedException {
        Thread.sleep(2000);
        WebElement btniniciosesion = driver.findElement(By.xpath(properties.getProperty("btniniciosesion")));
        btniniciosesion.click();
    }


    @Cuando("ingresar al modulo estado de cuenta")
    public void ingresar_al_modulo_estado_de_cuenta() throws InterruptedException {
        Thread.sleep(5000);
        WebElement estadocuenta = driver.findElement(By.xpath("//a[normalize-space()='Estados de Cuenta']"));
        estadocuenta.click();

    }



    @Cuando("click en deposito")
    public void click_en_deposito() throws InterruptedException {
        Thread.sleep(4000);
        WebElement depo = driver.findElement(By.xpath("//button[@data-qa='button-show-panel-deposit']"));
        depo.click();
    }
    @Cuando("realizar deposito")
    public void realizar_deposito() throws InterruptedException {
        Thread.sleep(4000);
        WebElement seleccuenta = driver.findElement(By.xpath("//select[@placeholder='Seleccionar cuenta']"));
        seleccuenta.click();
        WebElement cuenta = driver.findElement(By.xpath("//option[@value='636ef203ecabcedd5f4be4c6']"));
        cuenta.click();

    }

    @Cuando("ingresar noperacion {string}")
    public void ingresar_noperacion(String nnumero) throws InterruptedException {
       Thread.sleep(4000);
       WebElement deposite = driver.findElement(By.xpath("//input[@data-qa='nOperacion']"));
       deposite.sendKeys(nnumero);
       WebElement scroll = driver.findElement(By.xpath("(//div)[238]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scroll);

    }
    @Cuando("ingresar monto {string}")
    public void ingresar_monto(String nmonto) throws InterruptedException {
        Thread.sleep(4000);
        WebElement monto = driver.findElement(By.xpath("//input[@data-qa='monto']"));
        monto.sendKeys(nmonto);
    }

    @Cuando("activar firmar declaracion")
    public void activar_firmar_declaracion() throws InterruptedException {
       Thread.sleep(4000);
       WebElement firma = driver.findElement(By.id("aceptTerms"));
       firma.click();
    }

    @Cuando("subir voucher deposito")
    public void subir_voucher_deposito() throws InterruptedException {
        Thread.sleep(6000);
        WebElement subir = driver.findElement(By.xpath("(//div)[227]"));
        subir.click();
        String ruta = "C:\\Users\\cerh2\\OneDrive\\Escritorio\\picture\\logo.jpg";
       // subir.click();
        subir.sendKeys(ruta);
        subir.click();
        WebElement subirarchivo = driver.findElement(By.xpath("//input[@aria-label='Subir imagen']"));
        subirarchivo.click();



    }

}
