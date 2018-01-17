package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class HoverPage extends BasePage {

    BasePage basepage = new BasePage();

    public void setup() {
        basepage.visit(BASE_URL + "/hovers");

    }

    public void hoverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

    }

    public void hoverAvatar() {


       hoverElement(basepage.find(By.cssSelector("figure")));



    }

    EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);

}



