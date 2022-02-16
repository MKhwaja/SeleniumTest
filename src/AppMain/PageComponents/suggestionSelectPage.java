package AppMain.PageComponents;

import AppMain.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class suggestionSelectPage extends AbstractComponent {

    WebDriver driver;

    By suggestionTxtBox = By.cssSelector("div#select-class-example > fieldset > input#autocomplete");
    By suggestionSelect = By.cssSelector("ul#ui-id-1 > li > div");


    public suggestionSelectPage(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
        this.driver = driver;
    }

    public WebElement getSuggestionTxt() {
        return findElement(suggestionTxtBox);
    }

    public List<WebElement> getSuggestionSelection() {
        return driver.findElements(suggestionSelect);
    }
}
