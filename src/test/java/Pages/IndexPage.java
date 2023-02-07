package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage {

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    //elemente specifice de aceasta pagina
    @FindBy(id="btn1")
    private WebElement SignIn;

    @FindBy(id = "btn2")
    private WebElement SkipSignIn;


    //Actiuni specific pt IndexPage

    public void clickSignIn(){
        elementMethods.ClickElement(SignIn);
    }

    public void clickSkipSignIn(){
        elementMethods.ClickElement(SkipSignIn);
    }


}
