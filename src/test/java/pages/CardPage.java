package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CardPage extends BasePageClass {


    private By setUpOrderLocator = By.xpath("//a[text()='Оформить заказ']");



    public CardPage initiateOrder() {
        WebElement buyButton = setUpWaiterForWebElement(setUpOrderLocator);
        buyButton.click();
        return this;
    }
}
