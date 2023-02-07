package SharedData;

import InputFile.PropertiesUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Hooks extends SharedData {

    public HashMap<String, String> TestData;
    private String TestName;


    //Folosim adnotarea de @BeforeMethod din TestNG ca sa accesam site-ul
    @BeforeMethod
    public void prepareEnvironment(){
        Setup();
        TestName = this.getClass().getSimpleName();
        PropertiesUtility propertiesUtility = new PropertiesUtility(TestName);
        TestData = propertiesUtility.GetAllData();
    }

    //Folosim adnotarea @After din TestNG ca sa inchidem chestiile
    @AfterMethod
    public void clearEnvironment(){
        Clear();
    }
}
