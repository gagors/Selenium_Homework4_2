package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPage {


    private final WebDriver driver;

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAnyProduct() throws InterruptedException {
        Thread.sleep(2000);
        By shortSleeveShirtLocator = By.cssSelector("[title=\"Blouse\"]");
        driver.findElement(shortSleeveShirtLocator).click();
    }

    public void addToCart() throws InterruptedException {
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        By addToCartLocator = By.cssSelector("#add_to_cart > button");
        driver.findElement(addToCartLocator).click();

    }

    public void proceedToCheckout() throws InterruptedException {
        Thread.sleep(2000);
        By proceedToCheckout = By.cssSelector("[title=\"Proceed to checkout\"]");
        driver.findElement(proceedToCheckout).click();
    }


}
