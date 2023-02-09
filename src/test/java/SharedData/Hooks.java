package SharedData;

import ExtentUtility.ExtentReport;
import InputFile.PropertiesUtility;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.TestResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hooks extends SharedData {

    public HashMap<String, String> TestData;
    private String TestName;

    //Implementam o logica de generare a unui singur raport pentru n teste

    public static ExtentReport ExtentReportUtility = new ExtentReport();
    public static List<Log> LogContext = new ArrayList<>();
    public ExtentReport TestReport;


    //Folosim adnotarea de @BeforeMethod din TestNG ca sa accesam site-ul
    @BeforeMethod
    public void prepareEnvironment(){
        Setup();
        TestName = this.getClass().getSimpleName();
        PropertiesUtility propertiesUtility = new PropertiesUtility(TestName);
        TestData = propertiesUtility.GetAllData();
        TestReport = new ExtentReport(TestName);

    }

    //Folosim adnotarea @After din TestNG ca sa inchidem chestiile
    @AfterMethod
    public void clearEnvironment(ITestResult Result){
        //Trebuie sa tratam cazul cand cade un test (faci intai screenshot, apoi raport)
        if (Result.getStatus()==ITestResult.FAILURE){
            TestReport.attachReport("Fail", Result.getThrowable().getMessage(), getDriver(), TestName);

        }
        //Facem o logica care sa genereze raportul inainte sa inchida driver-ul (pentru a putea surprinde un screenshot al erorii, unde e cazul
        TestReport.attachReport("Info", "--- Finish "+TestName+" test ---");

        synchronized (ExtentReportUtility){
            ExtentTest CurrentTest = ExtentReportUtility.getExtent().createTest(""+TestName+"- Report");
            LogContext.addAll(TestReport.getTestReport().getModel().getLogs());
            for (Log log:LogContext){
                CurrentTest.getModel().getLogs().add(log);
                if (log.getStatus().equals(Status.FAIL)){
                    CurrentTest.getModel().setStatus(Status.FAIL);
                }
            }
            ExtentReportUtility.getExtent().flush();
            LogContext.clear();

        }
        Clear();
    }
}
