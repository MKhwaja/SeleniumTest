import PageObjects.homePageObjects;
import Resources.base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class AcademyTest extends base {

    @BeforeTest
    public void initiateExecution() throws IOException {
        driver = intializeDriver();
        driver.get(loadProperties("url"));
    }
    

    @Test (dataProvider = "data-provider")
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

    @AfterTest
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

    @DataProvider(name ="data-provider")
    public Object[][] data() {
        return new Object[][] {{"Practice"}, {"Courses"}};
    }

}
