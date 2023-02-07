package Pages;

import Objects.RegisterObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver){
        super (driver);
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement SwitchToElement;

    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement AlertElement;



    @FindBy (xpath = "//a[text()='Frames']")
    private WebElement FrameElement;



    @FindBy (xpath = "//a[text()='Windows']")
    private WebElement WindowElement;


    @FindBy(css = "input[placeholder='First Name']")
    private WebElement FirstName;

    @FindBy (css = "input[placeholder='Last Name']")
    private WebElement LastName;

    @FindBy (xpath = "//textarea[@ng-model='Adress']")
    private WebElement Address;

    @FindBy (css = "input[ng-model='EmailAdress']")
    private WebElement Email;

    @FindBy (css = "input[ng-model='Phone']")
    private WebElement Phone;

    @FindBy (css = "input[value='FeMale']")
    private WebElement Gender;

    @FindBy (id = "checkbox2")
    private WebElement Hobby;

    @FindBy (id = "Skills")
    private WebElement Skills;

    @FindBy (id = "yearbox")
    private WebElement Year;

    @FindBy (id = "msdd")
    private WebElement LanguageElement;

    @FindBy (css = ".ui-autocomplete>li>a")
    private List<WebElement> LanguageOptions;

    @FindBy (css = ".select2-selection")
    private WebElement SelectCountry;

    @FindBy (className = "select2-search__field")
    private WebElement SelectCountryInput;

    @FindBy (css = "select[placeholder='Month']")
    private WebElement Month;

    @FindBy (id = "daybox")
    private WebElement Day;

    @FindBy (id = "firstpassword")
    private WebElement Password;

    @FindBy (id = "secondpassword")
    private WebElement confirmPassword;

    @FindBy (id = "submitbtn")
    private WebElement Submit;







    public void registerProcess(RegisterObject registerObject){

        elementMethods.FillElement(FirstName, registerObject.getFirstName());
        elementMethods.FillElement(LastName, registerObject.getLastName());
        elementMethods.FillElement(Address, registerObject.getAddressValue());
        elementMethods.FillElement(Email, registerObject.getEmailValue());
        elementMethods.FillElement(Phone, registerObject.getPhoneValue());
        elementMethods.ClickElement(Gender);
        elementMethods.ClickElement(Hobby);
        elementMethods.SelectElementText(Skills, registerObject.getSkillValue());
        elementMethods.SelectElementValue(Year,registerObject.getYearValue());
        elementMethods.ScrollByPixel(0, 300);
        LanguageElement.click();

        for (Integer index = 0; index < LanguageOptions.size(); index ++){
            if (LanguageOptions.get(index).getText().equals(registerObject.getExpectedLanguage())){
                elementMethods.ClickElement(LanguageOptions.get(index));
            }
        }

        elementMethods.ClickElement(Gender);
        elementMethods.ClickElement(SelectCountry);
        elementMethods.FillElement(SelectCountryInput, registerObject.getCountryValue());
        elementMethods.SelectElementText(Month, registerObject.getMonthValue());
        elementMethods.SelectElementValue(Day, registerObject.getDayValue());
        elementMethods.FillElement(Password, registerObject.getFirstPasswordValue());
        elementMethods.FillElement(Password, registerObject.getConfirmPasswordValue());
        elementMethods.ClickElement(Submit);

    }

    public void goToAlert(){
        elementMethods.MoveToElement(SwitchToElement);
        elementMethods.ClickElement(AlertElement);
        pageMethods.NavigateToPage("https://demo.automationtesting.in/Alerts.html");
    }
    public void goToFrame(){
        elementMethods.MoveToElement(SwitchToElement);
        elementMethods.ClickElement(FrameElement);
        pageMethods.NavigateToPage("https://demo.automationtesting.in/Frames.html");
    }
    public void goToWindow(){
        elementMethods.MoveToElement(SwitchToElement);
        elementMethods.ClickElement(WindowElement);
        pageMethods.NavigateToPage("https://demo.automationtesting.in/Windows.html");
    }

}
