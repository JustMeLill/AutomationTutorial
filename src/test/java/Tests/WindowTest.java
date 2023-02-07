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

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToWindow();

        WindowPage windowPage = new WindowPage(getDriver());
        windowPage.tabProcess();
        windowPage.windowProcess();
        windowPage.tabsProcess();


    }


}
