package tests;

import org.openqa.selenium.WebDriver;
import pages.TestCasePage;

public class CreateTestCaseTest extends BaseTest{


    public void createTestCase() {

        testCasePage.clickOnCaseButton();
        testCasePage.setupTestCase("Case_1");
        testCasePage.setConditions("Not", "Not");
        testCasePage.addSteps("Some step 1","Do something", "some result",
                "Some step 1", "Again do something", "Again result");
        testCasePage.clickOnSaveButton();
    }
}
