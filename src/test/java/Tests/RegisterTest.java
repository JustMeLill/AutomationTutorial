package Tests;

import HelpMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterTest extends SharedData {

    @Test
    public void MetodaTest(){

        //Declaram un obiect si refactorizam actiunile
        ElementMethods elementMethods = new ElementMethods(getDriver());

        WebElement SkipSignIn = getDriver().findElement(By.id("btn2"));
        elementMethods.ClickElement(SkipSignIn);

        WebElement FirstName = getDriver().findElement(By.cssSelector("input[placeholder='First Name']"));
        String FirstNameValue = "Dutescu";
        elementMethods.FillElement(FirstName, FirstNameValue);

        WebElement LastName = getDriver().findElement(By.cssSelector("input[placeholder='Last Name']"));
        String LastNameValue = "Lili";
        elementMethods.FillElement(LastName, LastNameValue);

        WebElement Address = getDriver().findElement(By.xpath("//textarea[@ng-model='Adress']"));
        String AddressValue = "Negoveanu nr.12";
        elementMethods.FillElement(Address, AddressValue);

        WebElement Email = getDriver().findElement(By.cssSelector("input[ng-model='EmailAdress']"));
        String EmailValue = "dutescu_lilly@yahoo.com";
        elementMethods.FillElement(Email, EmailValue);

        WebElement Phone = getDriver().findElement(By.cssSelector("input[ng-model='Phone']"));
        String PhoneValue = "0747413430";
        elementMethods.FillElement(Phone, PhoneValue);

        WebElement Gender = getDriver().findElement(By.cssSelector("input[value='FeMale']"));
        elementMethods.ClickElement(Gender);

        WebElement Hobby = getDriver().findElement(By.id("checkbox2"));
        elementMethods.ClickElement(Hobby);

        //Interactionam cu un drop-down classic
        WebElement Skills = getDriver().findElement(By.id("Skills"));
        elementMethods.SelectElementText(Skills, "Java");

        WebElement Year = getDriver().findElement(By.id("yearbox"));
        elementMethods.SelectElementValue(Year,"1988");

        elementMethods.ScrollByPixel(0, 300);

        WebElement LanguageElement = getDriver().findElement(By.id("msdd"));
        LanguageElement.click();

        //Interactionam cu o multime de elemente (drop-down complex)
        List<WebElement> LanguageOptions = getDriver().findElements(By.cssSelector(".ui-autocomplete>li>a"));
        String ExpectedLanguage = "English";
        for (Integer index = 0; index < LanguageOptions.size(); index ++){
            if (LanguageOptions.get(index).getText().equals(ExpectedLanguage)){
                elementMethods.ClickElement(LanguageOptions.get(index));
            }
        }

        elementMethods.ClickElement(Gender);

        WebElement SelectCountry = getDriver().findElement(By.cssSelector(".select2-selection"));
        elementMethods.ClickElement(SelectCountry);
        WebElement SelectCountryInput = getDriver().findElement(By.className("select2-search__field"));
        elementMethods.FillElement(SelectCountryInput, "Australia");

        WebElement Month = getDriver().findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
        elementMethods.SelectElementText(Month, "November");

        WebElement Day = getDriver().findElement(By.xpath("//*[@id=\"daybox\"]"));
        elementMethods.SelectElementValue(Day, "24");

        WebElement Password = getDriver().findElement(By.xpath("//*[@id=\"firstpassword\"]"));
        elementMethods.FillElement(Password, "ThisIsMyPW");

        WebElement confirmPassword = getDriver().findElement(By.xpath("//*[@id=\"secondpassword\"]"));
        elementMethods.FillElement(Password, "ThisIsMyPW");


    }

}
