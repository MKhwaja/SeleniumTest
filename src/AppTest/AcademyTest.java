package AppTest;

import AppMain.PageObjects.practiceBlock1;
import AppTest.Resources.base;
import AppMain.PageObjects.homePageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Set;

import static java.lang.Integer.parseInt;

public class AcademyTest extends base {

    @BeforeTest
    public void initiateExecution() throws IOException {
        driver = intializeDriver();
        driver.get(loadProperties("url1"));
    }
    

    @Test(dataProvider = "data-provider", enabled = false)
    public void testNavigationBar(String value) {
        homePageObjects homePage = new homePageObjects(driver);
        String text = homePage.getNavigationBarObj().selectOptions.getText();
        System.out.println(text);

        for (WebElement element : homePage.getNavigationBarObj().selectOptionsList) {
            if(element.getText().equalsIgnoreCase(value)) {
                element.click();
                break;
            }
        }
    }

    @Test(dataProvider = "data-provider", enabled = false)
    public void testRadioBtn(String val) {
        practiceBlock1 block1 = new practiceBlock1(driver);
        for(WebElement element : block1.getRadioPage().getRadioBtn()) {
            if(element.getAttribute("value").equalsIgnoreCase(val)) {
                element.click();
                break;
            }
        }
    }

    @Test (enabled = false)
    public void testSuggestionList() {
        practiceBlock1 block1 = new practiceBlock1(driver);
        block1.getSuggestionSelect().getSuggestionTxt().sendKeys("Bel");
        for(WebElement element : block1.getSuggestionSelect().getSuggestionSelection()) {
            if(element.getAttribute("innerHTML").equalsIgnoreCase("Belgium")) {
                element.click();
                break;
            }
        }
    }

    @Test(dataProvider = "data-provider", enabled = false)
    public void testSelectValue(String val) {
        practiceBlock1 block1 = new practiceBlock1(driver);
        Select sel = new Select(block1.getdropdownSelect().selectOptions());
        sel.selectByValue(val);
    }


    @Test (enabled = false)
    public void testCheckboxSelect() {
        practiceBlock1 block1 = new practiceBlock1(driver);
        if(!(block1.getCheckbox().checkboxSelect().isSelected())) {
            block1.getCheckbox().checkboxSelect().click();
        }
    }

    @Test (enabled = false)
    public void testWindowHandle() throws InterruptedException {
        practiceBlock1 block1 = new practiceBlock1(driver);
//        String currentHandle = driver.getWindowHandle();
//        block1.switchTab().openTabElement().click();
        block1.switchTab().openWindowElement().click();
        Thread.sleep(5000);
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles) {
            if(driver.getTitle().contains("Practice Page")) {
                driver.switchTo().window(handle);
                break;
            }
        }


    }

    @Test
    public void testWebTable() {
        String finalVal = null;
        int num_rows = driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr")).size();
        for (int i = 1; i <= num_rows; i++) {
            String cellVal = driver.findElement(By.xpath("//*[@id='product']/tbody/tr[" + i + "]/td[2]")).getText();
            if (cellVal.contains("QA Resume")) {
                finalVal = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[" + i + "]/td[3]")).getText();
                break;
            }
        }

        Assert.assertEquals(0,parseInt(finalVal));

        System.out.println(finalVal);

    }

    @AfterTest
    public void tearDown() {
//        driver.manage().deleteAllCookies();
//        driver.close();
    }

    @DataProvider(name ="data-provider")
    public Object[][] data() {

//        return new Object[][] {{"Practice"}, {"Courses"}};
//        return new Object[][] {{"radio1"}, {"radio2"}, {"radio3"}};
        return new Object[][] {{"option1"}, {"option2"}, {"option3"}};
    }

}
