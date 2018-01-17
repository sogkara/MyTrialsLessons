package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static browserSetup.browserSetup.getDriver;

public class BasePage   {
  protected WebDriver driver;
public  static final String BASE_URL= System.getProperty("selenium.url", "https://the-internet.herokuapp.com");


    public BasePage(){

     driver= getDriver("firefox");

    }

    public void visit(String url){

        driver.get(url);
    }

  public WebElement find (By cssSelector){

        return driver.findElement(cssSelector);
  }


}
