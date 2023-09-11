package StepDefinition;

import Base.BaseTest;
import io.cucumber.java.es.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class factoringStep extends BaseTest {

    private ChromeDriver driver;
    private Properties properties;

    @Dado("que he ingresado al navegador a invertir")
    public void que_he_ingresado_al_navegador_a_invertir() throws IOException, InterruptedException {

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
    @Cuando("hago clic en el enlace de inicio de session")
    public void hago_clic_en_el_enlace_de_inicio_de_session() throws InterruptedException {
        System.out.println("Ingresar inicio de sesion");
        WebElement iniciosesion = driver.findElement(By.xpath(properties.getProperty("iniciosesion")));
        iniciosesion.click();
        Thread.sleep(200);
    }
    @Cuando("ingreso el email {string}")
    public void ingreso_el_email(String email) {
        System.out.println("Usuario ingresa username");
        WebElement user = driver.findElement(By.cssSelector(".input#emailID"));
        user.sendKeys(email);
        System.out.println("El mail es : " + email);
    }
    @Cuando("ingreso el pass {string}")
    public void ingreso_el_pass(String pass) {
        WebElement password = driver.findElement(By.cssSelector(".input:nth-child(2)"));
        password.sendKeys(pass);
        System.out.println("El password es : " + pass);
    }
    @Cuando("realizar clic en el botón de inicio de sesión")
    public void realizar_clic_en_el_botón_de_inicio_de_sesión() throws InterruptedException {
        WebElement btniniciosesion = driver.findElementByXPath("//button[@name='button-login']");
        btniniciosesion.click();
        Thread.sleep(2000);
    }

    @Cuando("ir a oportunidades")
    public void ir_a_oportunidades() throws InterruptedException {
        Thread.sleep(2000);
        WebElement oportinities = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/aside/div[3]/div[1]/ul/li[1]"));
        oportinities.click();
//        String script = "document.body.style.zoom='80%'";
//        ((JavascriptExecutor) driver).executeScript(script);

    }

    @Cuando("ingresar empresa {string} {string} {string}")
    public void ingresar_empresa(String ruc, String rz, String phone) throws InterruptedException {
        Thread.sleep(4000);
        WebElement empresa = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]"));
        empresa.click();
        Thread.sleep(4000);
        WebElement selectrelacion = driver.findElement(By.xpath("//select[@placeholder='Selecciona el tipo']"));
        selectrelacion.click();
        Thread.sleep(4000);
        WebElement typerelacion = driver.findElement(By.xpath("//option[@value='5fbb2d636bb2106227967fa2']"));
        typerelacion.click();
        Thread.sleep(4000);
        WebElement rucs = driver.findElement(By.xpath("//input[@id='idRuc']"));
        rucs.sendKeys(ruc);
        Thread.sleep(4000);
        WebElement rza = driver.findElement(By.xpath("//input[@data-qa='businessName']"));
        rza.sendKeys(rz);
        Thread.sleep(4000);
        WebElement phones = driver.findElement(By.xpath("//input[@data-qa='phone']"));
        phones.sendKeys(phone);
        WebElement moduloaceptocontrato = driver.findElement(By.xpath("//label[@for='terms_and_conditions']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", moduloaceptocontrato);


    }

    @Cuando("ingresar cliente {string} {string} {string} {string} {string} {string}")
    public void ingresar_cliente(String rucli, String rzcli, String phonecli, String name, String emailcli, String phonecontact) throws InterruptedException {
        Thread.sleep(1000);
        WebElement ruclis = driver.findElement(By.id("idRuc"));
        ruclis.sendKeys(rucli);
    }

    @Cuando("ingresar empresa {string}")
    public void ingresar_empresa(String ruc) throws InterruptedException {

    }

    @Cuando("ingresar cliente")
    public void ingresar_cliente() throws InterruptedException {


    }
    @Cuando("realizar click en continuar")
    public void realizar_click_en_continuar() {
        WebElement continuar = driver.findElement(By.xpath("//input[@data-qa='terms_and_conditions']"));
        continuar.click();
        WebElement btncontinuar = driver.findElement(By.xpath("(//a)[20]"));
        btncontinuar.click();


    }


    @Cuando("click en invertir")
    public void click_en_invertir() throws InterruptedException {
        String script = "document.body.style.zoom='80%'";
        ((JavascriptExecutor) driver).executeScript(script);
        Thread.sleep(30000);
        WebElement invertir = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/main/div/div/div/section/div[1]/div[1]/div[2]/div[1]/div/div[1]/div/div[11]"));
        invertir.click();


    }



    @Cuando("monto a invertir")
    public void monto_a_invertir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("click realizar inversion")
    public void click_realizar_inversion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
