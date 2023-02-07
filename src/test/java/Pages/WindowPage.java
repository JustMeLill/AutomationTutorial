package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasePage {

    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> WindowOptions;

    @FindBy(css = "#Tabbed>a>button")
    private WebElement TabbedButton;

    @FindBy(css = "#Seperate>button")
    private WebElement NewBrowser;

    @FindBy(css = "#Multiple>button")
    private WebElement MultipleButton;

    public void tabProcess(){
        elementMethods.ClickElement(WindowOptions.get(0));
        elementMethods.ClickElement(TabbedButton);
        windowMethods.MoveSpecificTabsWindow(1);
        windowMethods.CloseCurrentTabsWindow();
        windowMethods.MoveSpecificTabsWindow(0);
    }

    public void windowProcess(){
        WindowOptions.get(1).click();
        elementMethods.ClickElement(NewBrowser);
        windowMethods.MoveSpecificTabsWindow(1);
        driver.close();
        windowMethods.MoveSpecificTabsWindow(0);
    }

    public void tabsProcess(){
        WindowOptions.get(2).click();
        elementMethods.ClickElement(MultipleButton);
        windowMethods.MoveSpecificTabsWindow(2);
        windowMethods.CloseCurrentTabsWindow();
        windowMethods.MoveSpecificTabsWindow(1);
        windowMethods.CloseCurrentTabsWindow();
        windowMethods.MoveSpecificTabsWindow(0);
    }
}
