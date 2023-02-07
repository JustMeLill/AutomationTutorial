package HelpMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {

    private WebDriver driver;
    public WindowMethods (WebDriver driver) {
        this.driver = driver;
    }

    public void MoveSpecificTabsWindow(Integer index){
        List<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(index));
    }

    public void CloseCurrentTabsWindow(){
        driver.close();
    }


}
