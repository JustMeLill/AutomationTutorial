package Tests;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Frames extends SharedData {

    @Test
    public void MetodaTest() {

        ElementMethods elementMethods = new ElementMethods(getDriver());
        PageMethods pageMethods = new PageMethods(getDriver());
        FrameMethods frameMethods = new FrameMethods(getDriver());

        WebElement SkipRegister = getDriver().findElement(By.id("btn2"));
        elementMethods.ClickElement(SkipRegister);

        WebElement SwitchTo = getDriver().findElement(By.xpath("//a[text()='SwitchTo']"));

        //Mergem cu mouse-ul pe un anumit element
        elementMethods.MoveToElement(SwitchTo);

        WebElement FrameElement = getDriver().findElement(By.xpath("//a[text()='Frames']"));
        elementMethods.ClickElement(FrameElement);

        pageMethods.NavigateToPage("https://demo.automationtesting.in/Frames.html");

        List<WebElement> FrameOptions = getDriver().findElements(By.cssSelector(".nav-tabs>li>a"));
        elementMethods.ClickElement(FrameOptions.get(0));

        //Ne mutam pe un iFrame

        frameMethods.SwitchFrame("singleframe");
        WebElement FirstFrame = getDriver().findElement(By.cssSelector("input[type='text']"));
        elementMethods.FillElement(FirstFrame, "text1");
        frameMethods.SwitchDefault();
        elementMethods.ClickElement(FrameOptions.get(1));

        frameMethods.SwitchFrame(getDriver().findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        frameMethods.SwitchFrame(getDriver().findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
        WebElement SecondFrame = getDriver().findElement(By.cssSelector("input[type='text']"));
        elementMethods.FillElement(SecondFrame, "text2");

    }
}
