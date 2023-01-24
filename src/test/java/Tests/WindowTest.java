package Tests;

import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends SharedData {

    @Test
    public void MetodaTest() {

        WebElement SkipSignIn = getDriver().findElement(By.id("btn2"));
        SkipSignIn.click();


        WebElement SwitchToElement = getDriver().findElement(By.xpath("//a[text()='SwitchTo']"));
        //Mergem cu mouse-ul pe un anumit element - hover
        Actions actions = new Actions(getDriver());

        actions.moveToElement(SwitchToElement).perform();

        WebElement WindowElement = getDriver().findElement(By.xpath("//a[text()='Windows']"));
        WindowElement.click();

        getDriver().navigate().to("https://demo.automationtesting.in/Windows.html");

        List<WebElement> WindowsOptions = getDriver().findElements(By.cssSelector(".nav-stacked>li>a"));
        WindowsOptions.get(0).click();

        WebElement TabbedButton = getDriver().findElement(By.cssSelector("#Tabbed>a>button"));
        TabbedButton.click();

        //Identificam multimea de taburi/windows

        List <String> Tabs = new ArrayList<>(getDriver().getWindowHandles());
        //Ne mutam cu focus-ul pe un tab specific
        getDriver().switchTo().window(Tabs.get(1));

        //Inchidem tab-ul curent

        getDriver().close();
        getDriver().switchTo().window(Tabs.get(0));

        WindowsOptions.get(1).click();
        WebElement NewBrowser = getDriver().findElement(By.cssSelector("#Seperate>button"));
        NewBrowser.click();

        List <String> Window = new ArrayList<>(getDriver().getWindowHandles());
        //Ne mutam cu focus-ul pe un window specific
        getDriver().switchTo().window(Window.get(1));
        getDriver().close();
        getDriver().switchTo().window(Window.get(0));

        WindowsOptions.get(2).click();
        WebElement MultipleButton = getDriver().findElement(By.cssSelector("#Multiple>button"));
        MultipleButton.click();

        List <String> Multiple = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(Multiple.get(2));
        getDriver().close();
        getDriver().switchTo().window(Multiple.get(1));
        getDriver().close();
        getDriver().switchTo().window(Multiple.get(0));

    }


}
