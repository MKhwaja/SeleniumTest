package AppMain.PageObjects;

import AppMain.PageComponents.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class practiceBlock1 {

    public WebDriver driver;
    By blockSection1 = By.cssSelector("div.block.large-row-spacer");

    public practiceBlock1(WebDriver driver) {
        this.driver = driver;
    }

    public radioBtnPage getRadioPage() {
        return new radioBtnPage(driver, blockSection1);
    }

    public suggestionSelectPage getSuggestionSelect() {
        return new suggestionSelectPage(driver, blockSection1);
    }

    public dropdownSelectPage getdropdownSelect() {
        return new dropdownSelectPage(driver, blockSection1);
    }

    public checkboxPage getCheckbox() {
        return new checkboxPage(driver, blockSection1);
    }

    public switchWindowPage switchTab() {
        return new switchWindowPage(driver);
    }

}
