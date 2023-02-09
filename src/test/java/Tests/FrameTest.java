package Tests;

import Objects.FrameObject;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class FrameTest extends Hooks {

    @Test
    public void MetodaTest() {

        FrameObject frameObject = new FrameObject(TestData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();
        TestReport.attachReport("Pass", "I clicked on SignIn button.");

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToFrame();
        TestReport.attachReport("Pass", "I open the Frame page.");

        FramePage framePage = new FramePage(getDriver());
        framePage.singleFrame(frameObject);
        framePage.multipleFrame(frameObject);
        TestReport.attachReport("Pass", "I managed multiple Frame types.");

    }
}
