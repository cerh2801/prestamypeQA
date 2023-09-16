package StepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
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
import java.io.IOException;
import java.util.Properties;

public class BrokerStep {

    private ChromeDriver driver;
    private Properties properties;

    @Dado("que he ingresado al navegador registro de broker")
    public void que_he_ingresado_al_navegador_registro_de_broker() throws IOException, InterruptedException {

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
    @Cuando("hago clic en conviertete en broker")
    public void hago_clic_en_conviertete_en_broker() throws InterruptedException {
        Thread.sleep(3000);
        WebElement conocemas = driver.findElement(By.xpath("//a[normalize-space()='Conoce más']"));
        conocemas.click();
        WebElement broker = driver.findElement(By.xpath("//a[normalize-space()='Conviértete en broker']"));
        broker.click();

    }

    @Cuando("tomar screen")
    public void tomar_screen() {
        try {

            Robot robot = new Robot();


            Rectangle captura = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage capturaPantalla = robot.createScreenCapture(captura);
            File carpetaDestino = new File("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\java\\imgbroker");
            carpetaDestino.mkdirs();

            String nombreArchivo = "screenshot_" + System.currentTimeMillis() + ".png";

            File archivoDestino = new File("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\java\\imgbroker", "broker.png");

            ImageIO.write(capturaPantalla, "png", archivoDestino);

            System.out.println("Captura de pantalla guardada en: " + archivoDestino.getAbsolutePath());
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }
    }

    @Cuando("ingresar name {string}")
    public void ingresar_name(String name) {

        WebElement nombre = driver.findElement(By.xpath("//input[@data-qa='name']"));
        nombre.sendKeys(name);

    }
    @Cuando("ingresar lastname {string}")
    public void ingresar_lastname(String lastname) {

        WebElement apellido = driver.findElement(By.xpath("//input[@data-qa='lastname']"));
        apellido.sendKeys(lastname);

    }
    @Cuando("ingresar dni {string}")
    public void ingresar_dni(String dni) throws InterruptedException {
        Thread.sleep(8000);
        WebElement id = driver.findElement(By.xpath("//input[@data-qa='dni']"));
        id.sendKeys(dni);

    }
    @Cuando("ingresar phone {string}")
    public void ingresar_phone(String phone) {
        WebElement fono = driver.findElement(By.xpath("//input[@data-qa='phone']"));
        fono.sendKeys(phone);


    }
    @Cuando("ingresar correo {string}")
    public void ingresar_correo(String mail) {

        WebElement correo = driver.findElement(By.xpath("//input[@data-qa='email']"));
        correo.sendKeys(mail);
        WebElement mails = driver.findElement(By.xpath("//div[9]//div[1]//label[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", mails);

    }
    @Cuando("acepto terminos broker")
    public void acepto_terminos_broker() throws InterruptedException {


        WebElement acptar = driver.findElement(By.xpath("//input[@data-qa='aceptTerms']"));
        acptar.click();

        try {

            Robot robot = new Robot();


            Rectangle captura = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage capturaPantalla = robot.createScreenCapture(captura);
            File carpetaDestino = new File("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\java\\imgbroker");
            carpetaDestino.mkdirs();

            String nombreArchivo = "screenshot_" + System.currentTimeMillis() + ".png";

            File archivoDestino = new File("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\java\\imgbroker", "brokertermino.png");

            ImageIO.write(capturaPantalla, "png", archivoDestino);

            System.out.println("Captura de pantalla guardada en: " + archivoDestino.getAbsolutePath());
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }
    }
    @Cuando("boton enviar broker")
    public void boton_enviar_broker() throws InterruptedException {

        WebElement btnenviar = driver.findElement(By.xpath("(//button)[1]"));
        btnenviar.click();

        try {
            Thread.sleep(1000);

            Robot robot = new Robot();


            Rectangle captura = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage capturaPantalla = robot.createScreenCapture(captura);
            File carpetaDestino = new File("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\java\\imgbroker");
            carpetaDestino.mkdirs();

            String nombreArchivo = "screenshot_" + System.currentTimeMillis() + ".png";

            File archivoDestino = new File("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\java\\imgbroker", "brokerguardar.png");

            ImageIO.write(capturaPantalla, "png", archivoDestino);

            System.out.println("Captura de pantalla guardada en: " + archivoDestino.getAbsolutePath());
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }

    }




}
