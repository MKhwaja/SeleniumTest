package AppMain.PageComponents;

import AppMain.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class switchWindowPage {

    WebDriver driver;
    By openTab = By.id("opentab");
    By openWindow = By.id("openwindow");

    public switchWindowPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement openTabElement() {
        return driver.findElement(openTab);
    }

    public WebElement openWindowElement() {
        return driver.findElement(openWindow);
    }

}
