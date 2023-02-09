package Tests;

import Objects.AlertObject;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class AlertTest extends Hooks {

    @Test
    public void MetodaTest() {

        AlertObject alertObject = new AlertObject(TestData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();
        TestReport.attachReport("Pass", "I clicked on SignIn button.");

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToAlert();
        TestReport.attachReport("Pass", "I open the Alert page.");

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interactAlertOk();
        alertPage.interactAlertDismiss();
        alertPage.interactAlertValue(alertObject);
        TestReport.attachReport("Pass", "I managed multiple Alert types.");

    }


}
