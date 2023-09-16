package StepDefinition.prestamype;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfirmingStep {
    private ChromeDriver driver;
    private Properties properties;
    PrestamoStep prestamo;


    @Dado("que he ingresado al navegador confirming")
    public void queheingresadoalnavegadorconfirming() throws IOException, InterruptedException {

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

    @Cuando("hago clic en el enlace de inicio de sesión confirming")
    public void hagoclicenelenlacedeiniciodesesión() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Ingresar inicio de sesion");
        WebElement iniciosesion = driver.findElement(By.xpath(properties.getProperty("iniciosesion")));
        iniciosesion.click();
        Thread.sleep(200);

    }

    @Cuando("ingreso el correo electrónico {string} confirming")
    public void ingreso_el_correo_electrónico(String email) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Usuario ingresa username");
        WebElement user = driver.findElement(By.cssSelector(properties.getProperty("email")));
        user.sendKeys(email);
        System.out.println("El mail es : " + email);
    }

    @Cuando("ingreso la contraseña {string} confirming")
    public void ingresolacontraseña(String pass) throws InterruptedException {
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.xpath(properties.getProperty("pass")));
        password.sendKeys(pass);
        System.out.println("El password es : " + pass);

    }

    @Cuando("hago clic en el botón de inicio de sesión confirming")
    public void hagoclicenelbotóndeiniciodesesión() throws InterruptedException {
        Thread.sleep(2000);
        WebElement btniniciosesion = driver.findElement(By.xpath(properties.getProperty("btniniciosesion")));
        btniniciosesion.click();

    }
    @Cuando("Dirigirte al modulo confirming")
    public void dirigirte_al_modulo_confirming() throws InterruptedException {
        Thread.sleep(4000);
        WebElement confirming = driver.findElement(By.xpath("//aside//div//div[2]//ul[1]//li[1]"));
        confirming.click();

    }

    @Cuando("seleccionar tipo relacion empresa confirming")
    public void seleccionar_tipo_relacion_empresa() throws InterruptedException {
        Thread.sleep(3000);
        WebElement agregarempresa = driver.findElement(By.xpath(properties.getProperty("confirming")));
        agregarempresa.click();

    }

    @Cuando("select tipo de empresa  {string} confirming")
    public void select_tipo_de_empresa(String rucc) throws InterruptedException {
        Thread.sleep(4000);
        WebElement typebussiness = driver.findElement(By.xpath("//select[@placeholder='Selecciona el tipo']"));
        typebussiness.click();
        WebElement gerentegeneral = driver.findElement(By.xpath("//option[@value='5fbb2d636bb2106227967fa2']"));
        gerentegeneral.click();
        WebElement rucempresa = driver.findElement(By.xpath("//input[@data-qa='ruc']"));
        rucempresa.sendKeys(rucc);
    }

    @Cuando("ingresar razon social  {string} confirming")
    public void ingresar_razon_social(String rrz) throws InterruptedException {
        Thread.sleep(3000);
        WebElement razonsocial = driver.findElement(By.xpath("//input[@data-qa='businessName']"));
        razonsocial.sendKeys(rrz);

    }
    @Cuando("ingresar telefono  {string} confirming")
    public void ingresar_telefono(String phone) throws InterruptedException {
        Thread.sleep(300);
        WebElement telefono = driver.findElement(By.xpath("//input[@data-qa='phone']"));
        telefono.sendKeys(phone);

    }

    @Cuando("acepto terminos confirming")
    public void acepto_terminos_confirming() {
        WebElement moduloaceptocontrato = driver.findElement(By.xpath("//label[@for='terms_and_conditions']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", moduloaceptocontrato);
        WebElement aceptoterminos = driver.findElement(By.xpath("//input[@data-qa='terms_and_conditions']"));
        aceptoterminos.click();

    }
    @Cuando("guardar confirming")
    public void guardar_confirming() {
        WebElement guardar = driver.findElement(By.xpath("(//a)[20]"));
        guardar.click();
        WebElement popup = driver.findElement(By.xpath("(//div)[112]"));
        popup.getText();



    }

    @Cuando("select tipo de empresa confirming")
    public void select_tipo_de_empresa() throws InterruptedException {
        Thread.sleep(4000);
        WebElement typebussiness = driver.findElement(By.xpath("//select[@placeholder='Selecciona el tipo']"));
        typebussiness.click();
        WebElement gerentegeneral = driver.findElement(By.xpath("//option[@value='5fbb2d636bb2106227967fa2']"));
        gerentegeneral.click();
        WebElement rucempresa = driver.findElement(By.xpath("//input[@data-qa='ruc']"));
        rucempresa.click();

    }



}
