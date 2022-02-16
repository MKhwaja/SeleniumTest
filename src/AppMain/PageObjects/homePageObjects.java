package AppMain.PageObjects;

import AppMain.PageComponents.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePageObjects  {

    WebDriver driver;
    By sectionElement = By.cssSelector("ul.navigation.clearfix");

    public homePageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public NavigationBar getNavigationBarObj() {
        return new NavigationBar(driver,sectionElement);
    }
}
