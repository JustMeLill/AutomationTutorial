package Tests;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import SharedData.SharedData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class AlertTest extends SharedData {

    @Test
    public void MetodaTest() {

        ElementMethods elementMethods = new ElementMethods(getDriver());
        PageMethods pageMethods = new PageMethods(getDriver());
        AlertMethods alertMethods = new AlertMethods(getDriver());

        WebElement SkipSignIn = getDriver().findElement(By.id("btn2"));
        elementMethods.ClickElement(SkipSignIn);


        WebElement SwitchToElement = getDriver().findElement(By.xpath("//a[text()='SwitchTo']"));
        //Mergem cu mouse-ul pe un anumit element - hover
        elementMethods.MoveToElement(SwitchToElement);

        WebElement AlertElement = getDriver().findElement(By.xpath("//a[text()='Alerts']"));
        elementMethods.ClickElement(AlertElement);

        //Navigam catre un URL

        pageMethods.NavigateToPage("https://demo.automationtesting.in/Alerts.html");

        List<WebElement> AlertOptions = getDriver().findElements(By.cssSelector(".nav-stacked>li>a"));
        elementMethods.ClickElement(AlertOptions.get(0));

        WebElement AlertOk = getDriver().findElement(By.cssSelector("#OKTab>button"));
        elementMethods.ClickElement(AlertOk);

        //Interactionam cu o alerta venita din browser, nu din cod

        alertMethods.AcceptAlert();

        elementMethods.ClickElement(AlertOptions.get(1));
        WebElement AlertOkCancel = getDriver().findElement(By.cssSelector("#CancelTab>button"));
        elementMethods.ClickElement(AlertOkCancel);

        alertMethods.DismissAlert();

        elementMethods.ClickElement(AlertOptions.get(2));
        WebElement AlertWithText = getDriver().findElement(By.cssSelector("#Textbox>button"));
        elementMethods.ClickElement(AlertWithText);

        alertMethods.FillAlert("text", true);






    }


}
