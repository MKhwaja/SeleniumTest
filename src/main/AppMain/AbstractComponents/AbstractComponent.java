package AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractComponent {

    public WebDriver driver;
    WebElement sectionElement;

    public AbstractComponent(WebDriver driver, By sectionElement) {
        this.sectionElement = driver.findElement(sectionElement);
    }

    public WebElement findElement(By ele) {
        return sectionElement.findElement(ele);
    }

    public List<WebElement> findElements(By elem) {
        return sectionElement.findElements(elem);
    }
}
