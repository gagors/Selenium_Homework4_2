package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonalInformationPage {
    private ChromeDriver driver;

    @FindBy(id ="uniform-id_gender1")
    WebElement mrRadio;

    @FindBy(id = "customer_firstname")
    WebElement newFirtName;

    @FindBy(id = "customer_lastname")
    WebElement newLastName;

    @FindBy(id = "passwd")
    WebElement newPassword;

    @FindBy(id = "days")
    WebElement newDayOfBirth;

    @FindBy(id = "months")
    WebElement newMonthOfBirth;

    @FindBy(id = "years")
    WebElement newYearOfBirth;

    @FindBy(id = "company")
    WebElement newCompany;

    @FindBy(id = "address1")
    WebElement newAddress1;

    @FindBy(id = "address2")
    WebElement newAddress2;

    @FindBy(id = "city")
    WebElement newCity;

    @FindBy(id = "id_state")
    WebElement newState;

    @FindBy(id = "postcode")
    WebElement newZipCode;

    @FindBy(id = "other")
    WebElement newAdditionalInfo;

    @FindBy(id = "phone")
    WebElement newHomePhone;

    @FindBy(id = "phone_mobile")
    WebElement newMobilePhone;

    @FindBy(id = "alias")
    WebElement newAliasAddress;

    @FindBy(id = "submitAccount")
    WebElement submitButtom;

    public PersonalInformationPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectMr() {
        mrRadio.click();
    }

    public void typeFirstName() {
        newFirtName.sendKeys("Gabe");
    }

    public void typeLastName() {
        newLastName.sendKeys("Janusz");
    }

    public void typePassword() {
        newPassword.sendKeys("12345");
    }

    public void typeDayOfBirth() {
        newDayOfBirth.sendKeys("31");
    }

    public void typeMonthOfBirth() {
        new Select(newMonthOfBirth).selectByValue("3");
    }

    public void typeYearOfBirth() {
        newYearOfBirth.sendKeys("1988");
    }

    public void typeCompany() {
        newCompany.sendKeys("Forte");
    }

    public void typeAddress1() {
        newAddress1.sendKeys("1234 N Main St");
    }

    public void typeAddress2() {
        newAddress2.sendKeys("APT 1");
    }

    public void typeCity() {
        newCity.sendKeys("Chicago");
    }

    public void typeState() {
        newState.sendKeys("Illinois");
    }

    public void typeZipCode() {
        newZipCode.sendKeys("60610");
    }

    public void typeAdditionalInfo() {
        newAdditionalInfo.sendKeys("Building at the corner");
    }

    public void typeHomePhone() {
        newHomePhone.sendKeys("5554443333");
    }

    public void typeMobilePhone() {
        newMobilePhone.sendKeys("5556667777");
    }

    public void typeAliasAddress() {
        newAliasAddress.sendKeys("Between Street 1 and 2");
    }

    public void clickButtom() {
        submitButtom.click();
    }
}
