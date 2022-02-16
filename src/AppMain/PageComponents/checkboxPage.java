package AppMain.PageComponents;

import AppMain.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkboxPage extends AbstractComponent {

    By checkbox = By.id("checkBoxOption1");

    public checkboxPage(WebDriver driver, By blockSection1) {
        super(driver, blockSection1);
    }

    public WebElement checkboxSelect() {
        return findElement(checkbox);
    }

}
