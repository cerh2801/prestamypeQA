package StepDefinition.prestamype;

import io.cucumber.java.es.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginStep {

    private ChromeDriver driver;
    private Properties properties;
    PrestamoStep prestamo;


    @Dado("que he ingresado al navegador")
    public void queheingresadoalnavegador() throws IOException, InterruptedException {

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

    @Cuando("hago clic en el enlace de inicio de sesión")
    public void hagoclicenelenlacedeiniciodesesión() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Ingresar inicio de sesion");
        WebElement iniciosesion = driver.findElement(By.xpath(properties.getProperty("iniciosesion")));
        iniciosesion.click();
        Thread.sleep(200);

    }

    @Cuando("ingreso el correo electrónico {string}")
    public void ingreso_el_correo_electrónico(String email) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Usuario ingresa username");
        WebElement user = driver.findElement(By.cssSelector(properties.getProperty("email")));
        user.sendKeys(email);
        System.out.println("El mail es : " + email);
    }

    @Cuando("ingreso la contraseña {string}")
    public void ingreso_la_contraseña(String pass) throws InterruptedException {
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.xpath(properties.getProperty("pass")));
        password.sendKeys(pass);
        System.out.println("El password es : " + pass);

    }

    @Cuando("hago clic en el botón de inicio de sesión")
    public void hago_clic_en_el_botón_de_inicio_de_sesión() throws InterruptedException {
        Thread.sleep(2000);
        WebElement btniniciosesion = driver.findElement(By.xpath(properties.getProperty("btniniciosesion")));
        btniniciosesion.click();



    }

    @Cuando("Realizar click en menu")
    public void realizar_click_en_menu() throws InterruptedException {
        Thread.sleep(4000);
        WebElement menu = driver.findElement(By.xpath("(//div)[10]"));
        menu.click();
    }
    @Cuando("Realizar gestionar perfil")
    public void realizar_gestionar_perfil() throws InterruptedException {
        Thread.sleep(4000);
        WebElement gestionarperfil = driver.findElement(By.xpath("//a[normalize-space()='Gestiona tu perfil']"));
        gestionarperfil.click();
    }
    @Cuando("Realizar click modulo cambiar correo")
    public void realizar_click_modulo_cambiar_correo() throws InterruptedException {
        Thread.sleep(3000);
        WebElement cambiarmail = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/aside/div[3]/div[2]/ul/li[4]"));
        cambiarmail.click();
    }



    @Entonces("se espera que el usuario inicie sesión con éxito")
    public void se_espera_que_el_usuario_inicie_sesión_con_éxito() {
        System.out.println("Ingreso exitoso");
        driver.quit();

    }

    @Cuando("ingresar a menu")
    public void ingresar_a_menu() {
        WebElement menu = driver.findElement(By.xpath("//div[@class='nav-bar']//img[@class='profile__arrow']"));
        menu.click();


    }


    @Cuando("ingreso el correo electrónico incorrecto {string}")
    public void ingreso_el_correo_electrónico_incorrecto(String email) {
        System.out.println("Usuario ingresa username");
        WebElement user = driver.findElement(By.cssSelector(".input#emailID"));
        user.sendKeys(email);
        System.out.println("El mail es : " + email);
    }

    @Entonces("El mensaje de alerta es el siguiente")
    public void el_mensaje_de_alerta_es_el_siguiente() {
        WebElement alertMessage = driver.findElement(By.xpath("(//div[contains(text(),'El correo no es valido.')])[1]"));
        String expectedAlert = "El correo no es valido.";
        String actualAlert = alertMessage.getText();
        System.out.println("el mensaje es : " +actualAlert);
        if (actualAlert.equals(expectedAlert)) {
            System.out.println("La prueba pasó: el mensaje de alerta es correcto.");
        } else {
            System.out.println("La prueba falló: el mensaje de alerta es incorrecto.");

        }

        driver.quit();


    }

    @Cuando("ingreso la contraseña {string} incorrecta")
    public void ingreso_la_contraseña_incorrecta(String pass) {

        WebElement password = driver.findElement(By.cssSelector(".input:nth-child(2)"));
        password.sendKeys(pass);
        System.out.println("El password es : " + pass);

    }
    @Entonces("El mensaje de alerta para pass es el siguiente")
    public void el_mensaje_de_alerta_para_pass_es_el_siguiente() {
        Alert alert = driver.switchTo().alert();
        String msjpass = alert.getText();
        alert.accept();

    }

    @Cuando("realizar click recuperar password")
    public void realizar_click_recuperar_password() throws InterruptedException {
        WebElement recuperarpass = driver.findElement(By.xpath("//a[normalize-space()='¿Olvidaste tu contraseña?']"));
        recuperarpass.click();
        Thread.sleep(100);

    }

    @Cuando("desplazarse hacia correo electronico")
    public void desplazarse_hacia_correo_electronico() throws InterruptedException {
        WebElement recuperarpass = driver.findElement(By.xpath("//button[@id='button-recovery']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", recuperarpass);

    }


}
