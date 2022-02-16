package PageComponents;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NavigationBar extends AbstractComponent {

    public WebDriver driver;
    public WebElement selectOptions = findElement(By.cssSelector("li > a"));
    public List<WebElement> selectOptionsList = findElements(By.cssSelector("li > a"));

    public NavigationBar(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
        this.driver = driver;
    }

    public void selectCourse(){
//        WebElement selectOptions = findElement(By.cssSelector("li > a"));
        selectOptions.click();
    }


}
