package AppMain.PageComponents;

import AppMain.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class radioBtnPage extends AbstractComponent {

    By radioBtns = By.cssSelector("div#radio-btn-example > fieldset > label > input");

    public radioBtnPage(WebDriver driver, By sectionElement) {
        super(driver,sectionElement);
    }

    public List<WebElement> getRadioBtn() {
       return findElements(radioBtns);
    }

}
