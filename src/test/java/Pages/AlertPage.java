package Pages;

import Objects.AlertObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> AlertOptions;

    @FindBy(css = "#OKTab>button")
    private WebElement AlertOk;

    @FindBy(css = "#CancelTab>button")
    private WebElement AlertOkCancel;

    @FindBy(css = "#Textbox>button")
    private WebElement AlertWithText;

    public void interactAlertOk (){
        elementMethods.ClickElement(AlertOptions.get(0));
        elementMethods.ClickElement(AlertOk);
        alertMethods.AcceptAlert();
    }

    public void interactAlertDismiss (){
        elementMethods.ClickElement(AlertOptions.get(1));
        elementMethods.ClickElement(AlertOkCancel);
        alertMethods.DismissAlert();
    }

    public void interactAlertValue (AlertObject alertObject){
        elementMethods.ClickElement(AlertOptions.get(2));
        elementMethods.ClickElement(AlertWithText);
        alertMethods.FillAlert(alertObject.getAlertText(), Boolean.TRUE);
    }

}
