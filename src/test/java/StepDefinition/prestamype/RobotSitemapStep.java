package StepDefinition.prestamype;

import io.cucumber.java.es.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RobotSitemapStep {

    private ChromeDriver driver;
    private Properties properties;
    @Dado("que he ingresado al navegador web")
    public void que_he_ingresado_al_navegador_web() throws IOException, InterruptedException {
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
    @Cuando("validar si tiene acceso a link robot.txt")
    public void validar_si_tiene_acceso_a_link_robot_txt() {
       driver.get("https://public.test.prestamype.com/robots.txt");
    }
    @Entonces("validar si tiene acceso a sitemap.xml")
    public void validar_si_tiene_acceso_a_sitemap_xml() {
       driver.get("https://public.test.prestamype.com/sitemap.xml");
    }

    @Entonces("tomar srcreenshot {string}")
    public void tomar_srcreenshot(String path) {

        try {

            Robot robot = new Robot();


            Rectangle captura = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage capturaPantalla = robot.createScreenCapture(captura);
            File carpetaDestino = new File("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\java\\imagens");
            carpetaDestino.mkdirs();

            String nombreArchivo = "screenshot_" + System.currentTimeMillis() + ".png";

            File archivoDestino = new File("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\java\\imagens", "robot.png");

            ImageIO.write(capturaPantalla, "png", archivoDestino);

            System.out.println("Captura de pantalla guardada en: " + archivoDestino.getAbsolutePath());
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }

    }
    @Entonces("take a screenshot {string}")
    public void take_a_screenshot(String paths) {
        try {

            Robot robot = new Robot();


            Rectangle captura = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage capturaPantalla = robot.createScreenCapture(captura);
            File carpetaDestino = new File("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\java\\imagens");
            carpetaDestino.mkdirs();

            String nombreArchivo = "screenshot_" + System.currentTimeMillis() + ".png";

            File archivoDestino = new File("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\java\\imagens", "sitemap.png");

            ImageIO.write(capturaPantalla, "png", archivoDestino);

            System.out.println("Captura de pantalla guardada en: " + archivoDestino.getAbsolutePath());
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }


    }

    @Entonces("cerrar navegador")
    public void cerrar_navegador() {
       driver.quit();
    }



}
