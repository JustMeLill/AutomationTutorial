package SharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SharedData {

    //declaram driverul ca variabila
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }



    public void Setup(){
        //Setam driverul pentru browser, utilizand un set de key si value;
        //Daca vrem alt browser, punem driverul de browser, si adaugam valoarea path-ului de la driver si inlocuim in key
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");

        //Deschidem un browser de chrome
        driver = new ChromeDriver();

        //Facem driverul in format maximize
        driver.manage().window().maximize();

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
