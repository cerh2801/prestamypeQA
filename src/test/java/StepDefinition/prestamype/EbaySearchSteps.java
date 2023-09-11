package StepDefinition.prestamype;


import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class EbaySearchSteps extends BaseTest{

    private ChromeDriver driver;
    private Properties properties;

    @Given("the eBay website is open")
    public void openEbayWebsite() throws IOException {

            properties = new Properties();
            FileInputStream input = new FileInputStream("C:\\Users\\cerh2\\IdeaProjects\\prestamype\\src\\test\\resources\\configfiles\\config.properties");
            properties.load(input);

            System.setProperty("webdriver.chrome.driver", properties.getProperty("chromeDriverPath"));
            ChromeOptions co = new ChromeOptions();
            co.setBinary(properties.getProperty("BinaryPath"));
            driver = new ChromeDriver(co);

            driver.manage().window().maximize();
            driver.get(properties.getProperty("ebay.url"));
    }

    @When("I enter the search keyword")
    public void enterSearchKeyword() throws InterruptedException {
        WebElement searchBox = driver.findElement(By.name("_nkw"));
        searchBox.sendKeys(properties.getProperty("search.keyword"));
        Thread.sleep(200);
    }

    @When("I submit the search")
    public void submitSearch() throws InterruptedException {
        WebElement searchBox = driver.findElement(By.name("_nkw"));
        searchBox.submit();
        Thread.sleep(390);
    }

    @Then("I should see the search results")
    public void verifySearchResults() throws InterruptedException {
        WebElement resultCount = driver.findElement(By.className("srp-controls__count-heading"));
        System.out.println("Número de resultados: " + resultCount.getText());
        Thread.sleep(1390);

        // Add assertions or verifications here
    }

    @Then("order price descendent")
    public void order_price_descendent() throws InterruptedException {
        WebElement priceSort = driver.findElement(By.xpath("//div[@class='srp-controls__sort srp-controls__control']"));
        priceSort.click();
        Thread.sleep(1390);
    }
    @Then("show five first product in precy")
    public void show_five_first_product_in_precy() {
        List<WebElement> productElements = driver.findElements(By.className("s-item__info"));
        System.out.println("Primeros 5 productos con precios:");
        for (int i = 0; i < 5 && i < productElements.size(); i++) {
            WebElement product = productElements.get(i);
            String productName = product.findElement(By.className("s-item__title")).getText();
            String productPrice = product.findElement(By.className("s-item__price")).getText();
            System.out.println("Producto " + (i + 1) + ": " + productName + ": " + productPrice);
        }
    }

    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}