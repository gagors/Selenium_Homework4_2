package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    private final WebDriver driver;

    @FindBy(css = ".sf-menu > li:nth-child(1)")
    WebElement womansCategory;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickWomensCategory() {
        womansCategory.click();

    }
}
