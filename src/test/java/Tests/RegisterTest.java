package Tests;

import Objects.RegisterObject;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class RegisterTest extends Hooks {

    @Test
    public void MetodaTest(){

        RegisterObject registerObject = new RegisterObject(TestData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();
        TestReport.attachReport("Pass", "I clicked on SignIn button.");

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerProcess(registerObject);
        TestReport.attachReport("Pass", "I filled in multiple register steps.");


    }

}
