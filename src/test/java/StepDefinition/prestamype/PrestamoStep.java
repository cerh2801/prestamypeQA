package StepDefinition.prestamype;

import Base.BaseTest;
import io.cucumber.java.es.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PrestamoStep extends BaseTest {
    private ChromeDriver driver;
    private Properties properties;
    private PrestamoStep prestamostep;
    private LoginStep login;

    @Dado("ingresado al navegador")
    public void ingresadoalnavegador() throws IOException, InterruptedException {

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



    @Cuando("clic en el enlace Préstamo")
    public void clicenelenlacepréstamo() throws InterruptedException {
            PrestamoStep prestamoStep = new PrestamoStep();
            System.out.println("Prestamo");
            Thread.sleep(4000);
            WebElement prestamo = driver.findElement(By.xpath("//a[normalize-space()='Préstamos']"));
            prestamo.click();
            WebDriverWait wait = new WebDriverWait(driver, 100);
            WebElement prestamoLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='Préstamos']")));
            prestamoLink.click();
    }



    @Entonces("clic en la opción Definir monto a solicitar")
    public void realizoclicenlaopcióndefinirmontoasolicitar() {

        WebElement definirmonto = driver.findElement(By.xpath("//span[@id='plus']"));
        definirmonto.click();
    }

    @Entonces("presiono el botón Precalificar")
    public void presiono_el_botón_precalificar() throws InterruptedException {

        WebElement precalifica = driver.findElement(By.xpath("//button[normalize-space()='Precalifica ahora']"));
        precalifica.click();
        Thread.sleep(100);

    }

    @Entonces("ingresar datos a completar {string}")
    public void ingresar_datos_a_completar(String dni) throws InterruptedException {
        Thread.sleep(1000);
        WebElement xdni = driver.findElement(By.cssSelector("#documentNumber"));
        xdni.sendKeys(dni);

    }

    @Entonces("ingresar email a completar {string}")
    public void ingresar_email_a_completar(String email) throws InterruptedException {
        Thread.sleep(1000);
        WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
        mail.sendKeys(email);
    }

    @Entonces("ingresar phone a completar {string}")
    public void ingresar_phone_a_completar(String phone) throws InterruptedException {
        Thread.sleep(1000);
        WebElement fone = driver.findElement(By.xpath("//input[@id='phone']"));
        fone.sendKeys(phone);

    }

    @Entonces("desplazarse acepto terminos")
    public void desplazarse_acepto_terminos() throws InterruptedException {
        Thread.sleep(1000);
        WebElement aceptoterminos = driver.findElement(By.xpath("//div[15]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", aceptoterminos);

    }
    @Entonces("ingresar otherphone a completar {string}")
    public void ingresar_otherphone_a_completar(String otherphone) throws InterruptedException {
        Thread.sleep(1000);
        WebElement others = driver.findElement(By.xpath("//input[@id='phone_alt']"));
        others.sendKeys(otherphone);
    }

    @Entonces("selecciono de la lista desplegable")
    public void selecciono_de_la_lista_desplegable() throws InterruptedException {
        Thread.sleep(1000);
        WebElement listadesplegable = driver.findElement(By.xpath("//select[@placeholder='Seleccionar motivo de préstamo']"));
        listadesplegable.click();
        //Select select = new Select(listadesplegable);
        //  select.selectByVisibleText(opcion);

    }
    @Entonces("Se seleccionado opcion")
    public void se_seleccionado_opcion() throws InterruptedException {
        Thread.sleep(1000);
        WebElement elementoSeleccionado = driver.findElement(By.xpath("//option[@value='62aaaf91ee722cfdb48a2aff']"));
        String textoSeleccionado = elementoSeleccionado.getText();
        elementoSeleccionado.click();

        //Assert.assertEquals(elementoSeleccionado, textoSeleccionado);
        //driver.quit();

    }
    @Entonces("si tienes propiedad")
    public void si_tienes_propiedad() throws InterruptedException {
        Thread.sleep(1000);
        WebElement siacepto = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div[1]/section[2]/div[2]/div[2]/div[14]/div[1]"));
        siacepto.click();


    }

    @Entonces("acepto terminos")
    public void acepto_terminos() throws InterruptedException {
        Thread.sleep(1000);
        WebElement aceptoterminos = driver.findElement(By.xpath("//input[@id='aceptTerms']"));
        aceptoterminos.click();

    }

    @Entonces("btn siguiente")
    public void btn_siguiente() throws InterruptedException {
        Thread.sleep(1000);
        WebElement btnsiguiente = driver.findElement(By.xpath("//button[normalize-space()='Siguiente']"));
        btnsiguiente.click();

    }

    @Entonces("scrool a el inmueble esta inscrito")
    public void scrool_a_el_inmueble_esta_inscrito() throws InterruptedException {
        Thread.sleep(6000);
        WebElement seencuentraendistrito = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > section:nth-child(1) > div:nth-child(1) > section:nth-child(3) > div:nth-child(2) > div:nth-child(10)"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",seencuentraendistrito);
    }


    @Entonces("tipo de inmueble casa")
    public void tipo_de_inmueble_casa() throws InterruptedException {
        Thread.sleep(2000);
        WebElement casa = driver.findElement(By.xpath("(//label[@class='i-radio'])[5]"));
        casa.click();

    }

    @Entonces("esta inscrito en sunarp")
    public void esta_inscrito_en_sunarp() throws InterruptedException {
        Thread.sleep(1000);
        WebElement sunarp = driver.findElement(By.xpath("//div[@class='col-12 col-md-12 i-radio-sunarp']//div[1]//label[1]"));
        sunarp.click();

    }

    @Entonces("scrool el tipo de propiedad")
    public void scrool_el_tipo_de_propiedad() throws InterruptedException {
        Thread.sleep(6000);
        WebElement tipodepropiedad = driver.findElement(By.xpath("//label[normalize-space()='¿Qué tipo de inmueble es?']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",tipodepropiedad);
    }

    @Entonces("seleccionar departamento")
    public void seleccionar_departamento() throws InterruptedException {
        Thread.sleep(1000);
        WebElement selectdepartment = driver.findElement(By.xpath("//select[@placeholder='Seleccione departamento']"));
        selectdepartment.click();
       }


    @Entonces("selecciono Lima")
    public void selecciono_lima() throws InterruptedException {
        Thread.sleep(1000);
        WebElement departmento = driver.findElement(By.xpath("//option[@value='15']"));
        departmento.click();
    }
    @Entonces("seleccionar provincia")
    public void seleccionar_provincia() throws InterruptedException {
        Thread.sleep(1000);
        WebElement selectprovince = driver.findElement(By.xpath("//select[@placeholder='Seleccione provincia']"));
        selectprovince.click();

    }
    @Entonces("seleccionar Lima provincia")
    public void seleccionar_lima() throws InterruptedException {
        Thread.sleep(1000);
        WebElement provincia = driver.findElement(By.xpath("//option[@value='128']"));
        provincia.click();

    }

    @Entonces("seleccionar distrito")
    public void seleccionar_distrito() throws InterruptedException {
       Thread.sleep(1000);
       WebElement distritte = driver.findElement(By.xpath("//select[@placeholder='Seleccione distrito']"));
       distritte.click();
    }
    @Entonces("seleccionar magdalena")
    public void seleccionar_magdalena() throws InterruptedException {

        Thread.sleep(1000);
        WebElement distritte = driver.findElement(By.xpath("//option[@value='1300']"));
        distritte.click();
    }

    @Entonces("area en metros {string}")
    public void area_en_metros(String aream) throws InterruptedException {
        Thread.sleep(1000);
        WebElement areametros = driver.findElement(By.xpath("//input[@placeholder='m²']"));
        areametros.sendKeys(aream);
    }

    @Entonces("Mostrar resultados")
    public void mostrar_resultados() throws InterruptedException {
        Thread.sleep(1000);
        WebElement metros2 = driver.findElement(By.xpath("//button[@id='send-data-final']"));
        metros2.click();
    }

    @Cuando("hago clic en el enlace de inicio de sesion")
    public void hago_clic_en_el_enlace_de_inicio_de_sesion() throws InterruptedException {
        System.out.println("Ingresar inicio de sesion");
        WebElement iniciosesion = driver.findElement(By.xpath(properties.getProperty("iniciosesion")));
        iniciosesion.click();
        Thread.sleep(200);
    }
    @Cuando("ingreso  correo electrónico {string}")
    public void ingreso_correo_electrónico(String email) {
        System.out.println("Usuario ingresa username");
        WebElement user = driver.findElement(By.cssSelector(".input#emailID"));
        user.sendKeys(email);
        System.out.println("El mail es : " + email);
    }
    @Cuando("ingreso  contraseña {string}")
    public void ingreso_contraseña(String pass) {
        WebElement password = driver.findElement(By.cssSelector(".input:nth-child(2)"));
        password.sendKeys(pass);
        System.out.println("El password es : " + pass);
    }
    @Cuando("hago clic en botón de inicio de sesión")
    public void hago_clic_en_botón_de_inicio_de_sesión() throws InterruptedException {
        WebElement btniniciosesion = driver.findElementByXPath("//button[@name='button-login']");
        btniniciosesion.click();
        Thread.sleep(2000);
    }

    @Cuando("seleccionar tab empresario")
    public void seleccionar_tab_empresario() throws InterruptedException {
        Thread.sleep(3000);
        WebElement empresario = driver.findElement(By.xpath("//a[normalize-space()='Empresario']"));
        empresario.click();
    }

    @Cuando("solicitar prestamo motive")
    public void solicitarprestamo() throws InterruptedException {
        Thread.sleep(1000);
        WebElement selectmotive = driver.findElement(By.xpath("//select[@placeholder='Seleccionar motivo de préstamo']"));
        selectmotive.click();

    }
    @Cuando("ir a modulo prestamo")
    public void ir_a_modulo_prestamo() throws InterruptedException {
        Thread.sleep(1000);
        WebElement moduloprestamo = driver.findElement(By.xpath("//a[@href='/app/empresario/solicitar']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", moduloprestamo);
        Thread.sleep(500);
        WebElement prestamo = driver.findElement(By.xpath("//a[@href='/app/empresario/solicitar']"));
        prestamo.click();
        Thread.sleep(500);
        WebElement entendido = driver.findElement(By.xpath("//a[normalize-space()='Entendido']"));
        entendido.click();
        Thread.sleep(500);
        WebElement siguiente = driver.findElement(By.xpath("//a[normalize-space()='Siguiente']"));
        siguiente.click();

    }
    @Cuando("seleccionar motive")
    public void seleccionarmotive() {

    }
    @Cuando("select inversion")
    public void selectinversion() {

    }
    @Cuando("tiene una propiedad")
    public void tieneunapropiedad() {

    }







}


