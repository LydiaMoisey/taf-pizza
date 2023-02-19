package moiseenkolydia;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TerraPizzaTest {
    WebDriver driver;
    Actions actions;

    @BeforeEach
    public void setupBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(TerraPizzaPage.URL);
        actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    @Test
    public void testCheckPizzaInCart() {
        WebElement CLOSE_COOKIE = driver.findElement(By.xpath(TerraPizzaPage.COOKIES));
        CLOSE_COOKIE.click();
        WebElement MENU_BTN = driver.findElement(By.xpath(TerraPizzaPage.MENU));
        MENU_BTN.click();

        WebElement PIZZA_BTN = driver.findElement(By.xpath(TerraPizzaPage.PIZZA));
        PIZZA_BTN.click();

        WebElement ADD_TO_CART_BTN = driver.findElement(By.xpath(TerraPizzaPage.ADD_TO_CART));
        ADD_TO_CART_BTN.click();

        WebElement CART_BTN = driver.findElement(By.xpath(TerraPizzaPage.CART));
        CART_BTN.click();
        List<WebElement> PRODUCTS_IN_CART_LIST = driver.findElements(By.xpath(TerraPizzaPage.ITEM_IN_CART));
        Assertions.assertTrue(PRODUCTS_IN_CART_LIST.get(0).getText().contains("Пицца Маргарита"));
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}