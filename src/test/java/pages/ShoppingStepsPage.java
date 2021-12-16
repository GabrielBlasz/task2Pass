package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class ShoppingStepsPage extends BasePage {

    public ShoppingStepsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"search_widget\"]/form/input[2]")
    private WebElement searchProduct;

    @FindBy(xpath = "//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2/a")
    private WebElement clickSweater;

    @FindBy(xpath = "//*[@id=\"group_1\"]")
    private WebElement choseSize;

    @FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
    private WebElement choseQuantity;

    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    private WebElement clickAddToCart;

    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement clickProcedToCheckout;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    private WebElement clickSecondProcededToCheckout;

    @FindBy(xpath = "//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")
    private WebElement clickContinueAddres;

    @FindBy(xpath = "//*[@id=\"js-delivery\"]/button")
    private WebElement clickContinueShipping;

    @FindBy(xpath = "//*[@id=\"payment-option-1\"]")
    private WebElement clickPayByCheck;

    @FindBy(xpath = "//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")
    private WebElement clickCheckBoxAgree;

    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    private WebElement orderWithObligationToPay;






    public void searchSteps() {

        searchProduct.click();
        searchProduct.clear();
        searchProduct.sendKeys("Hummingbird Printed Sweater");
        searchProduct.sendKeys(Keys.ENTER);
    }

    public void pageProductClick() {

        clickSweater.click();

    }

    public void choseSize() {
        choseSize.click();
        choseSize.sendKeys(Keys.DOWN);
        choseSize.sendKeys(Keys.ENTER);

        ///////////////////////////////// sztuczna pauza bo nie wczytywała się assercja
        driver.navigate().to("https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=10&rewrite=brown-bear-printed-sweater&controller=product#/2-size-m");
        ////////////////////////////////

    }

    public void choseQuantity(String quantity){

        choseQuantity.click();
        choseQuantity.clear();
        choseQuantity.sendKeys(quantity);

        clickAddToCart.click();
    }


    public void clickProceedButton(){

        clickProcedToCheckout.click();


    }

    public void clickSecondProcededToCheckout(){
        clickSecondProcededToCheckout.click();



    }

    public void continueAddresButton(){

        clickContinueAddres.click();

    }

    public void continueShippingButton(){

        clickContinueShipping.click();
    }

    public void payByCheck(){

        clickPayByCheck.click();
    }


    public void checkBoxAgreeAndOrderObligationPay(){

        clickCheckBoxAgree.click();
        orderWithObligationToPay.click();


    }

    public void takeOrderScreenShot() throws Exception{
            TakesScreenshot ts = ((TakesScreenshot)driver);
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./src/tests/screenshot/screenshot.png"));
            System.out.println("Screenshot");

    }

    private static class FileUtils {
        public static void copyFile(File source, File file) {
        }


    }



}










