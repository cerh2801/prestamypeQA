package StepDefinition.prestamype;

import io.cucumber.java.es.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class inversionistaStep {

    private ChromeDriver driver;
    private Properties properties;

    @Dado("que he ingresado al navegador inversionista public")
    public void que_he_ingresado_al_navegador_inversionista_public() throws InterruptedException, IOException {
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


//        Thread.sleep(4000);
//        WebElement inversiones = driver.findElement(By.xpath("//a[normalize-space()='Mis Inversiones']"));
//        inversiones.click();
    }
    @Cuando("hago clic en el enlace de inicio de sesión inversionista public")
    public void hago_clic_en_el_enlace_de_inicio_de_sesión_inversionista_public() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Ingresar inicio de sesion");
        WebElement iniciosesion = driver.findElement(By.xpath(properties.getProperty("iniciosesion")));
        iniciosesion.click();
        Thread.sleep(200);
    }
    @Cuando("ingreso el correo electrónico {string} inversionista public")
    public void ingreso_el_correo_electrónico_inversionista_public(String email) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Usuario ingresa username");
        WebElement user = driver.findElement(By.cssSelector(properties.getProperty("email")));
        user.sendKeys(email);
        System.out.println("El mail es : " + email);
    }
    @Cuando("ingreso la contraseña {string} inversionista public")
    public void ingreso_la_contraseña_inversionista_public(String pass) throws InterruptedException {
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.xpath(properties.getProperty("pass")));
        password.sendKeys(pass);
        System.out.println("El password es : " + pass);
    }
    @Cuando("hago clic en el botón de inicio de sesión inversionista public")
    public void hago_clic_en_el_botón_de_inicio_de_sesión_inversionista_public() throws InterruptedException {
        Thread.sleep(2000);
        WebElement btniniciosesion = driver.findElement(By.xpath(properties.getProperty("btniniciosesion")));
        btniniciosesion.click();
    }
    @Cuando("ingresar al modulo inversionista")
    public void ingresar_al_modulo_inversionista() throws InterruptedException {
        Thread.sleep(4000);
        WebElement inversiones = driver.findElement(By.xpath("//a[normalize-space()='Mis Inversiones']"));
        inversiones.click();
        Thread.sleep(4000);
        WebElement dowloand = driver.findElement(By.xpath("(//span)[5]"));
        dowloand.click();
    }

    @Cuando("buscar el codigo de subasta {string}")
    public void buscar_el_codigo_de_subasta(String subasta) throws InterruptedException {
        Thread.sleep(4000);
        WebElement code = driver.findElement(By.xpath("//input[@placeholder='Buscar']"));
        code.sendKeys(subasta);
        Thread.sleep(4000);
        WebElement estado = driver.findElement(By.xpath("(//div[@data-name='Estado'])[1]"));
        String textElemento = estado.getText();
        System.out.println("El estado es el siguiente :" +textElemento);
        Thread.sleep(4000);
        WebElement detalle = driver.findElement(By.xpath("(//a[contains(text(),'Ver detalle')])[1]"));
        detalle.click();
        Thread.sleep(6000);
        WebElement estado2 = driver.findElement(By.xpath("(//label)[4]"));
        String textElement2 = estado2.getText();
        System.out.println("El estado es el siguiente " +textElement2);



    }

    @Cuando("ir a mis pagos")
    public void ir_a_mis_pagos() throws InterruptedException {
        Thread.sleep(4000);
        WebElement pagos = driver.findElement(By.xpath("(//li)[15]"));
        pagos.click();
        Thread.sleep(5000);
        WebElement montpage = driver.findElement(By.xpath("(//*[name()='svg'])[3]"));
        montpage.click();

    }

    @Cuando("ingresar al modulo estado de cuenta filtro")
    public void ingresar_al_modulo_estado_de_cuenta_filtro() throws InterruptedException {
        Thread.sleep(4000);
        WebElement estadocuenta = driver.findElement(By.xpath("//a[normalize-space()='Estados de Cuenta']"));
        estadocuenta.click();
    }

    @Cuando("Seleccionar movimientos {string}")
    public void seleccionar_movimientos(String Todos) throws InterruptedException {
        Thread.sleep(6000);
        WebElement scrollmovi = driver.findElement(By.xpath("//*[@id=\"pagination\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scrollmovi);
        Thread.sleep(6000);
        WebElement selectElement = driver.findElement(By.xpath("//select[@data-qa='movimiento']"));
        Select select = new Select(selectElement);
        select.selectByValue("deposito");
//        WebElement dowloand = driver.findElement(By.xpath("//span[2]//span[1]//*[name()='svg']"));
//        dowloand.click();
        Thread.sleep(6000);
        WebElement selectElement1 = driver.findElement(By.xpath("//select[@data-qa='movimiento']"));
        Select select1 = new Select(selectElement1);
        select1.selectByValue("todos");
//        WebElement dowloand1 = driver.findElement(By.xpath("(//span)[15]"));

    }

    @Cuando("validar tooltip")
    public void validar_tooltip() throws InterruptedException {
        Thread.sleep(4000);
        WebElement tooltip = driver.findElement(By.xpath("(//span)[11]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(tooltip).perform();
        String actualTooltipText = tooltip.getText();
        System.out.println("El mensaje es : " +actualTooltipText);
    }

    @Cuando("validar mensaje de tooltip {string}")
    public void validar_mensaje_de_tooltip(String expectedTooltipText) {
        expectedTooltipText = "Descargar informe de movimiento";
        WebElement tooltipElement = driver.findElement(By.xpath("(//span)[11]")); // Ajusta el selector según tu HTML
        String actualTooltipText = tooltipElement.getText();
        assert actualTooltipText.equals(expectedTooltipText);

    }

    @Cuando("Dirigir a tab dolares")
    public void dirigir_a_tab_dolares() throws InterruptedException {
        Thread.sleep(4000);
        WebElement scrollestadocuenta = driver.findElement(By.xpath("(//h2)[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scrollestadocuenta);
        Thread.sleep(4000);
        WebElement tabdolares = driver.findElement(By.xpath("//a[@data-qa='dolares']//p[2]"));
        tabdolares.click();
    }








}
