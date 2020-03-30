package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePageClass {

    private By emailFieldLocator = By.xpath("//input[@id = 'exampleInputEmail1']");

    private By passwordFieldLocator = By.xpath("//input[@id = 'exampleInputPassword1']");

    private String emailValue = "nastya.chelyapina@gmail.com";

    private String passwordValue = "7845366Nastya";


    public LoginPage fillOutEmailField() {
        WebElement emailField = setUpWaiterForWebElement(emailFieldLocator);
        emailField.sendKeys(emailValue, Keys.ENTER);
        return this;
    }


    public PersonalAreaPage fillOutPasswordField() {
        WebElement passwordField = setUpWaiterForWebElement(passwordFieldLocator);
        passwordField.sendKeys(passwordValue, Keys.ENTER);
        return new PersonalAreaPage();
    }

}
