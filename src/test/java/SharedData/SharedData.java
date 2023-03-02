package SharedData;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SharedData {

    //declaram driverul ca variabila
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }



    public void Setup(){

        String cicd = System.getProperty("ci_cd");
        ChromeOptions chromeOptions = new ChromeOptions();
        if(Boolean.parseBoolean(cicd)){
            chromeOptions.addArguments("--headless");
        }
        else {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
            //Setam driverul pentru browser, utilizand un set de key si value;
            //Daca vrem alt browser, punem driverul de browser, si adaugam valoarea path-ului de la driver si inlocuim in key
        }
        //Setez rezolutia dorita
        chromeOptions.addArguments("--window-size=1200,1080");
        chromeOptions.addArguments("--no-sandbox");
        //Setez cum vreau sa se comporte cand se incarca o pagina - strategia paginii (None, Eager, Normal)
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        //Deschidem un browser de chrome
        driver = new ChromeDriver(chromeOptions);

        //Facem driverul in format maximize
        //driver.manage().window().maximize();

        // Accesam un URL specific
        driver.get("https://demo.automationtesting.in/Index.html");

        //Folosim metoda wait implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



    }

    public void Clear(){
        //inchidem un browser
        driver.quit();

        //driver.quit(); = inchide browserul cu oricate tab-uri deschise
        //driver.close(); = inchide doar tab-ul curent

    }

}
