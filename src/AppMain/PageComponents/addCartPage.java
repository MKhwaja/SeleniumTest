package AppMain.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class addCartPage {

    WebDriver driver;

    By productName = By.cssSelector("h4.product-name");
//    By addCartBtn = By.xpath("//h4[@class='product-name' and starts-with(., '" +item+ "')]//following::div[2]/button[text()='ADD TO CART']");

    public addCartPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement addCartBtnElement(String item) {
        return driver.findElement(By.xpath("//h4[@class='product-name' and starts-with(., '" +item+ "')]//following::div[2]/button[text()='ADD TO CART']"));
    }

    public List<WebElement> productNameElement() {
        return driver.findElements(productName);
    }
}
