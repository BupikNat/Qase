package tests;

import pages.TestCasePage;

public class CreateTestCaseTest extends BaseTest{

    public CreateTestCaseTest(TestCasePage testCasePage) {
        this.testCasePage = testCasePage;
    }

    public void createTestCase() {

        testCasePage.clickOnCaseButton();
        testCasePage.setupTestCase("Case_1");
        testCasePage.setConditions("Not", "Not");
        testCasePage.addSteps("Some step 1", "Do something", "some result");
        testCasePage.clickOnSaveButton();
        testCasePage.testCaseIsCreated();
    }
}