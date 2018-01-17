package browserSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class browserSetup {

   public static WebDriver driver;
    public static  final String BROWSER= System.getProperty("selenium.browser", "chrome");


    public static WebDriver getDriver(String browsertype){


    if( browsertype.equals("chrome")){
        browsertype=BROWSER;
        String chromeBrowserLocation=System.getProperty("selenium.chromedriver","C:\\Users\\Anyutsk3\\Desktop\\chrome\\chromedriver.exe" );
        System.setProperty("webdriver.chrome.driver", chromeBrowserLocation);
        driver=new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=z3Ruc2bKnqI&t=745s");

    }
    else if(browsertype.equals("firefox")){
        browsertype=BROWSER;
        String firefoxDriverLocation = System.getProperty("selenium.geckodriver",
                "C:\\Users\\Anyutsk3\\Desktop\\geckodriver.exe");
        System.setProperty("webdriver.geckodriver", firefoxDriverLocation);
        driver = new FirefoxDriver();
    }
     return driver;

    }


    }



