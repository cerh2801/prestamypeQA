package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Google {
    public static void main(String[] args) throws IOException, InterruptedException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\resources\\configfiles\\config.properties");
        properties.load(fis);

        System.setProperty("webdriver.chrome.driver", properties.getProperty("chromeDriverPath"));

        ChromeOptions co = new ChromeOptions();
        co.setBinary(properties.getProperty("BinaryPath"));

        WebDriver driver = new ChromeDriver(co);
        driver.get(properties.getProperty("testurl"));
        Thread.sleep(4000);
        driver.manage().window().maximize();

        driver.quit();
    }
}
