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
import java.util.Properties;

public class GestiondeFactutasStep {

    private ChromeDriver driver;
    private Properties properties;
    PrestamoStep prestamo;
    @Dado("que he ingresado al navegador gestion por facturas")
    public void que_he_ingresado_al_navegador_gestion_por_facturas() throws IOException, InterruptedException {
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
    @Cuando("hago clic en el enlace de inicio de sesión gestion de facturas")
    public void hago_clic_en_el_enlace_de_inicio_de_sesión_gestion_de_facturas() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Ingresar inicio de sesion");
        WebElement iniciosesion = driver.findElement(By.xpath(properties.getProperty("iniciosesion")));
        iniciosesion.click();
        Thread.sleep(200);
    }
    @Cuando("ingreso el correo electrónico {string} gestion de facturas")
    public void ingreso_el_correo_electrónico_gestion_de_facturas(String email) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Usuario ingresa username");
        WebElement user = driver.findElement(By.cssSelector(properties.getProperty("email")));
        user.sendKeys(email);
        System.out.println("El mail es : " + email);
    }
    @Cuando("ingreso la contraseña {string} gestion de facturas")
    public void ingreso_la_contraseña_gestion_de_facturas(String pass) throws InterruptedException {
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.xpath(properties.getProperty("pass")));
        password.sendKeys(pass);
        System.out.println("El password es : " + pass);
    }
    @Cuando("hago clic en el botón de inicio de sesión gestion de facturas")
    public void hago_clic_en_el_botón_de_inicio_de_sesión_gestion_de_facturas() throws InterruptedException {
        Thread.sleep(2000);
        WebElement btniniciosesion = driver.findElement(By.xpath(properties.getProperty("btniniciosesion")));
        btniniciosesion.click();
    }
    @Cuando("Dirigirte al modulo por cobrar de gestion por facturas")
    public void dirigirte_al_modulo_por_cobrar_de_gestion_por_facturas() throws InterruptedException {
        Thread.sleep(4000);
        WebElement gestiondefacturas = driver.findElement(By.xpath("(//div)[31]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", gestiondefacturas);
        WebElement gestioncobrar= driver.findElement(By.xpath("//a[normalize-space()='Por cobrar']"));
        gestioncobrar.click();
    }

    @Cuando("Registrar empresa")
    public void registrar_empresa() throws InterruptedException {
       Thread.sleep(4000);
       WebElement agregarfactura = driver.findElement(By.xpath("//body/div/div/div/div/main/div/div/div/section/div/a[1]"));
       agregarfactura.click();
    }


}
