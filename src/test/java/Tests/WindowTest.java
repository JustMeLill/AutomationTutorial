package Tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class WindowTest extends Hooks {

    @Test
    public void MetodaTest() {

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();
        TestReport.attachReport("Pass", "I clicked on SignIn button.");

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToWindow();
        TestReport.attachReport("Pass", "I opened the window page.");

        WindowPage windowPage = new WindowPage(getDriver());
        windowPage.tabProcess();
        windowPage.windowProcess();
        windowPage.tabsProcess();
        TestReport.attachReport("Pass", "I managed multiple tabs and windows.");


    }


}
