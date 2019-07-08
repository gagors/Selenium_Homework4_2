package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage2 {

        public CheckOutPage2 (WebDriver driver) {
        PageFactory.initElements(driver, this);
        }

        @FindBy(name = "processAddress")
        WebElement standardCheckOut2;

        @FindBy(id="cgv")
        WebElement cgv;

        @FindBy(name="processCarrier")
        WebElement processCarrier;

        @FindBy(className="cheque")
        WebElement cheque;

        @FindBy(css="#cart_navigation > button")
        WebElement placeOrder;

        @FindBy(className="alert-success")
        WebElement success;

//        @FindBy(id="email_create")
//        WebElement emailCreate;
//
//        @FindBy(id="SubmitCreate")
//        WebElement submitCreate;


    public void proceedToCheckOut2 () {
        standardCheckOut2.click();
    }
    public void agreeTermsService()  {
        cgv.click();
    }

    public void proceedToCheckoutToCarrier() {
        processCarrier.click();
    }

        public void payByCheque()  {
        cheque.click();
    }

    public void confirmMyOrder()  {
        placeOrder.click();
    }

    public String getConfirmationPageSuccess()  {
        return success.getText();
    }

//    public void createNewEmail(String email) {
//        emailCreate.sendKeys(email);
//    }
//
//    public void clickCreateAccount() {
//        submitCreate.click();
//    }

}