package StepDefinition.prestamype;

import io.cucumber.java.es.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AdminBroker {

    private ChromeDriver driver;
    private Properties properties;

    @Dado("que he ingresado admin modulo broker")
    public void que_he_ingresado_admin_modulo_broker() throws IOException, InterruptedException {
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
    @Cuando("usuario ingresa a inversionista {string} {string} broker")
    public void usuario_ingresa_a_inversionista_broker(String usuadmin, String adminpassword) throws InterruptedException {
        Thread.sleep(4000);
        WebElement useradmin = driver.findElement(By.xpath("//div[@class='login-box-input']//div[1]//div[1]//input[1]"));
        useradmin.sendKeys(usuadmin);
        WebElement passadmin = driver.findElement(By.xpath("//input[@type='password']"));
        passadmin.sendKeys(adminpassword);

    }
    @Entonces("realizar click en comenzar broker")
    public void realizar_click_en_comenzar_broker() throws InterruptedException {
        Thread.sleep(4000);
        WebElement btncomenzar = driver.findElement(By.xpath("//button[normalize-space()='Comenzar']"));
        btncomenzar.click();

    }

    @Entonces("dirigirse a broker")
    public void dirigirse_a_broker() throws InterruptedException {
        Thread.sleep(4000);

        WebElement campaña = driver.findElement(By.xpath("//label[@data-qa='facturas']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", campaña);

    }
    @Entonces("realizar click modulo broker")
    public void realizar_click_modulo_broker() throws InterruptedException {
        Thread.sleep(4000);

        WebElement broker = driver.findElement(By.xpath("//label[@data-qa='brokers']"));
        broker.click();

    }

    @Entonces("ingresar a solicitudes")
    public void ingresar_a_solicitudes() throws InterruptedException {
        Thread.sleep(4000);
        WebElement broker = driver.findElement(By.xpath("//a[@href='/brokers/solicitudes']"));
        broker.click();
    }

    @Entonces("ingresar texto {string}")
    public void ingresar_texto(String mail) throws InterruptedException {
        Thread.sleep(4000);
        WebElement correo = driver.findElement(By.xpath("//input[@placeholder='Ingrese texto']"));
        correo.sendKeys(mail);
        WebElement buttton = driver.findElement(By.xpath("(//button)[1]"));
        buttton.click();
    }

    @Entonces("habilitar switch")
    public void habilitar_switch() throws InterruptedException {
        Thread.sleep(4000);
        WebElement swith = driver.findElement(By.xpath("(//div)[176]"));
        swith.click();
    }
    @Entonces("button aceptar")
    public void button_aceptar() throws InterruptedException {
        Thread.sleep(1000);
        WebElement aceptar = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
        aceptar.click();
    }

    @Entonces("enviar url generado por el broker")
    public void enviar_url_generado_por_el_broker() throws InterruptedException {
        Thread.sleep(4000);
        WebElement urlborker = driver.findElement(By.xpath("(//span)[80]"));
        urlborker.click();
        try {
            Thread.sleep(1000);

            Robot robot = new Robot();


            Rectangle captura = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage capturaPantalla = robot.createScreenCapture(captura);
            File carpetaDestino = new File("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\java\\imgbrokeradmin");
            carpetaDestino.mkdirs();

            String nombreArchivo = "screenshot_" + System.currentTimeMillis() + ".png";

            File archivoDestino = new File("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\java\\imgbrokeradmin", "brokeradmin.png");

            ImageIO.write(capturaPantalla, "png", archivoDestino);

            System.out.println("Captura de pantalla guardada en: " + archivoDestino.getAbsolutePath());
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }

    }

    @Entonces("abrir correo yopmail {string}")
    public void abrir_correo_yopmail(String mail) throws InterruptedException {
        Thread.sleep(2000);
        String yopmailURL = "http://www.yopmail.com/en/";
        ((JavascriptExecutor) driver).executeScript("window.open(arguments[0]);", yopmailURL);

    }

    @Entonces("ingresar al urlbroker")
    public void ingresar_al_urlbroker() throws InterruptedException {
        Thread.sleep(2000);
        String urlbroker = "https://public.test.prestamype.com/solicitud/datos_personales_1?monto=50000&broker=65025679955e6e96745b6214";
        ((JavascriptExecutor) driver).executeScript("window.open(arguments[0]);", urlbroker);
    }









}
