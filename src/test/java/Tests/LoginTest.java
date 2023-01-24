package Tests;

import HelpMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends SharedData {

    @Test
    public void MetodaTest(){

        //Declaram un obiect si refactorizam actiunile - curs 10
        ElementMethods elementMethods = new ElementMethods(getDriver());

        //Declaram elementul Sign In si interactionam cu el;
        WebElement SignIn = getDriver().findElement(By.id("btn1"));
        elementMethods.ClickElement(SignIn);

        WebElement Email = getDriver().findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "testmail@email.com";
        elementMethods.FillElement(Email, emailValue);

        WebElement Password = getDriver().findElement(By.xpath("//input[@placeholder='Password']"));
        String passwordValue = "password";
        elementMethods.FillElement(Password, passwordValue);

        WebElement Enter = getDriver().findElement(By.id("enterbtn"));
        elementMethods.ClickElement(Enter);

        //Validam un mesaj de eroare - declaram elemetul, si un actual si un expected
        WebElement Error = getDriver().findElement(By.id("errormsg"));
        String ExpectedError = "Invalid User Name or PassWord";
        elementMethods.ValidateElementText(Error, ExpectedError);



    }




}
