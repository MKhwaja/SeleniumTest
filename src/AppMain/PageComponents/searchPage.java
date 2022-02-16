package AppMain.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPage {
    WebDriver driver;

    By searchBox = By.cssSelector("input.search-keyword");
    By searchBtn = By.cssSelector("button.search-button");

    public searchPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement searchBoxElement() {
        return driver.findElement(searchBox);
    }

    public WebElement searchBtnElement() {
        return driver.findElement(searchBtn);
    }

}
