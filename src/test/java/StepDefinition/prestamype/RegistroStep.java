package StepDefinition.prestamype;


import io.cucumber.java.es.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RegistroStep {

    private ChromeDriver driver;
    private Properties properties;

    @Dado("que he ingresado al browser")
    public void queheingresadoalbrowser() throws IOException, InterruptedException {

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

    @Cuando("realizar click en registro")
    public void realizarclickenregistro() throws InterruptedException {
        Thread.sleep(1000);
        WebElement register = driver.findElement(By.xpath(properties.getProperty("registrate")));
        register.click();

    }

    @Entonces("Ingresar el documento {string}")
    public void ingresar_el_documento(String numdoc) {
        WebElement numdocument = driver.findElement(By.xpath(properties.getProperty("documentodni")));
        numdocument.sendKeys(numdoc);
    }

    @Entonces("Ingresar telefono {string}")
    public void ingresar_telefono(String fono) {

        WebElement phone = driver.findElement(By.xpath(properties.getProperty("fono")));
        phone.sendKeys(fono);

    }
    @Entonces("ingresar mail {string}")
    public void ingresar_mail(String mail) {

        WebElement correo = driver.findElement(By.xpath(properties.getProperty("email")));
        correo.sendKeys(mail);

    }
    @Entonces("ingresar pass  {string}")
    public void ingresar_pass(String contra) {
        WebElement pass = driver.findElement(By.xpath(properties.getProperty("pass")));
        pass.sendKeys(contra);

    }
    @Entonces("ingresar repass {string}")
    public void ingresar_repass(String recontra) {
        WebElement repassn= driver.findElement(By.xpath(properties.getProperty("repass")));
        repassn.sendKeys(recontra);

    }

    @Entonces("acepta terminos y condiciones")
    public void acepta_terminos_y_condiciones() {

        WebElement acepto = driver.findElement(By.xpath(properties.getProperty("aceptarcondiciones")));
        acepto.click();

    }
    @Entonces("click boton registrate")
    public void click_boton_registrate() {

        WebElement btnregister = driver.findElement(By.xpath(properties.getProperty("btnregistrame")));
        btnregister.click();

    }
    @Entonces("ingresar nueva pestaña yopmail")
    public void ingresar_nueva_pestaña_yopmail() {

        String yopmailURL = "http://www.yopmail.com/en/";
        ((JavascriptExecutor) driver).executeScript("window.open(arguments[0]);", yopmailURL);

    }

    @Entonces("ingresar email {string}")
    public void ingresar_email(String mail) throws InterruptedException {
        Thread.sleep(100);
        WebElement email = driver.findElement(By.xpath("//div[@class='tooltip click']"));
        email.sendKeys(mail);

    }

    @Entonces("seleccionar el tipo de documento ce")
    public void seleccionar_el_tipo_de_documento_ce() throws InterruptedException {
        Thread.sleep(1000);
        WebElement tipodoc = driver.findElement(By.xpath("//select[@class='input input-select']"));
        tipodoc.click();
    }
    @Entonces("seleccionar ce")
    public void seleccionar_ce() throws InterruptedException {
        Thread.sleep(1000);
        WebElement ce = driver.findElement(By.xpath("//option[@value='ce']"));
        ce.click();


    }
    @Entonces("usuario ingresa el número de documento registrado {string}")
    public void usuario_ingresa_el_número_de_documento_registrado(String numdoc) throws InterruptedException {
        Thread.sleep(1000);
        WebElement numce = driver.findElement(By.xpath("//input[@id='document']"));
        numce.sendKeys(numdoc);


    }


}
