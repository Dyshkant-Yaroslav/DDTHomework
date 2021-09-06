package tests;

import business.BO;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;


public class BaseTest {
    WebDriver driver;

    @Before
    public void setTest() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.foxtrot.com.ua");
    }

    @After
    public void closeTest() {
        driver.close();
    }

    public BO getBo() {
        return new BO();
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(driver);
    }

    public ProductPage getProductPage() {
        return new ProductPage(driver);
    }
}
