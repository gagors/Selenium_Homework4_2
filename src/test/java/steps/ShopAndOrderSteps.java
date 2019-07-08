package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.*;

public class ShopAndOrderSteps {
    private ChromeDriver driver;

    @Given("user navigates to the app url")
    public void userNavigatesToTheAppUrl() {
        System.setProperty("webdriver.chrome.driver", "/Users/gago/Downloads/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @When("user navigate to Woman")
    public void userNavigateToWoman() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickWomensCategory();
    }

    @And("user click on product")
    public void userClickOnProduct() throws InterruptedException {
        CategoryPage categoryPage = new CategoryPage(driver);
        categoryPage.clickAnyProduct();
    }

    @And("adds to cart")
    public void addsToCart() throws InterruptedException {
        CategoryPage categoryPage = new CategoryPage(driver);
        categoryPage.addToCart();
    }

    @And("clicks checkout from the product popup")
    public void clicksCheckoutFromTheProductPopup() throws InterruptedException {
        CategoryPage categoryPage = new CategoryPage(driver);
        categoryPage.proceedToCheckout();
    }

    @And("clicks checkout from order page")
    public void clicksCheckoutFromOrderPage() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.proceedToCheckout();
    }

    @And("creats new account")
    public void creatsNewAccount() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.createNewEmail("gagors+20@gmail.com");
        checkoutPage.clickCreateAccount();
    }

    @And("fills out Personal Information and clicks continue")
    public void fillsOutPersonalInformationAndClicksContinue() throws InterruptedException {
        Thread.sleep(2000);
        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
        personalInformationPage.selectMr();
        personalInformationPage.typeFirstName();
        personalInformationPage.typeLastName();
        personalInformationPage.typePassword();
        personalInformationPage.typeDayOfBirth();
        personalInformationPage.typeMonthOfBirth();
        personalInformationPage.typeYearOfBirth();
        personalInformationPage.typeCompany();
        personalInformationPage.typeAddress1();

        Thread.sleep(1000);

        personalInformationPage.typeAddress2();
        personalInformationPage.typeCity();
        personalInformationPage.typeState();
        personalInformationPage.typeZipCode();
        personalInformationPage.typeAdditionalInfo();
        personalInformationPage.typeHomePhone();
        personalInformationPage.typeMobilePhone();
        personalInformationPage.typeAliasAddress();

        personalInformationPage.clickButtom();
    }

    @And("fills out Address and clicks continue")
    public void fillsOutAddressAndClicksContinue() {
        CheckOutPage2 checkOutPage2 = new CheckOutPage2(driver);
        checkOutPage2.proceedToCheckOut2();
    }

    @And("agrees to terms")
    public void paysByCheckAndAgreesToTerms() {
        CheckOutPage2 checkOutPage2 = new CheckOutPage2(driver);
        checkOutPage2.agreeTermsService();
    }

    @And("fills out invoice and clicks continue")
    public void fillsOutInvoiceAndClicksContinue() {
        CheckOutPage2 checkOutPage2 = new CheckOutPage2(driver);
        checkOutPage2.proceedToCheckoutToCarrier();
    }


    @And("pays by check")
    public void paysByCheck() {
        CheckOutPage2 checkOutPage2 = new CheckOutPage2(driver);
        checkOutPage2.payByCheque();
    }

    @And("clicks order")
    public void clicksOrder() {
        CheckOutPage2 checkOutPage2 = new CheckOutPage2(driver);
        checkOutPage2.confirmMyOrder();
    }

    @Then("the order is submitted")
    public void theOrderIsSubmitted() {
        CheckOutPage2 checkOutPage2 = new CheckOutPage2(driver);
        String successMessage = checkOutPage2.getConfirmationPageSuccess();
        Assert.assertEquals(successMessage, "Your order on My Store is complete.");
        }

//    @After
//    public void shutdown() {
//        driver.quit();
//    }



}
