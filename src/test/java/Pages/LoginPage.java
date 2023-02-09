package Pages;

import HelpMethods.ElementMethods;
import Objects.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (css = "input[placeholder='E mail']")
    private WebElement Email;

    @FindBy (xpath = "input[@placeholder='Password']")
    private WebElement Password;

    @FindBy (id = "enterbtn")
    private WebElement Enter;

    @FindBy (id = "errormsg")
    private WebElement Error;


    public void LoginInvalid(LoginObject loginObject){

        elementMethods.FillElement(Email, loginObject.getEmail());
        elementMethods.FillElement(Password, loginObject.getPassword());
        elementMethods.ClickElement(Enter);
        elementMethods.ValidateElementText(Error, loginObject.getMessage());
    }

}
