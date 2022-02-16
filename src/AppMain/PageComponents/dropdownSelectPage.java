package AppMain.PageComponents;

import AppMain.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dropdownSelectPage extends AbstractComponent {

    By selectValue = By.cssSelector("div.cen-right-align > fieldset > select#dropdown-class-example");

    public dropdownSelectPage(WebDriver driver, By blockSection1) {
        super(driver, blockSection1);
    }

    public WebElement selectOptions() {
        return findElement(selectValue);
    }

}
