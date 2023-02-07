package Tests;

import Objects.LoginObject;
import Pages.IndexPage;
import Pages.LoginPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class LoginTest extends Hooks {

    @Test
    public void MetodaTest(){

        LoginObject loginObject = new LoginObject(TestData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSignIn();

        LoginPage loginPage= new LoginPage(getDriver());
        loginPage.LoginInvalid(loginObject);

    }

}
