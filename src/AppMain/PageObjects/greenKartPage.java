package AppMain.PageObjects;

import AppMain.PageComponents.addCartPage;
import AppMain.PageComponents.searchPage;
import org.openqa.selenium.WebDriver;

public class greenKartPage {

    public WebDriver driver;

    public greenKartPage(WebDriver driver) {
        this.driver = driver;
    }


    public searchPage getSearchElements() {
        return new searchPage(driver);
    }

    public addCartPage getAddCartElements() {
        return new addCartPage(driver);
    }
}
