package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TestCasePage {

    private static final String TITLE = "//input[@id='title']",
            CLICK_PRIORITY_DROPDOWN = "//div[@id='0-priority']//*[@fill='currentColor']",
            CHOOSE_PRIORITY = "//div[@class='SynGa1']//div[text()='Medium']",
            CLICK_TYPE_DROPDOWN = "//div[@id='0-type']//*[@fill='currentColor']",
            CHOOSE_TYPE = "//div[@class='SynGa1']//div[text()='Smoke']",
            CLICK_LAYER_DROPDOWN = "//div[@id='0-layer']//*[@fill='currentColor']",
            CHOOSE_LAYER = "//div[@class='SynGa1']//div[text()='E2E']",
            CLICK_BEHAVIOR_DROPDOWN = "//div[@id='0-behavior']//*[@fill='currentColor']",
            CHOOSE_BEHAVIOR = "//div[@class='SynGa1']//div[text()='Positive']",
            TO_BE_AUTOMATED_CHECHBOX = "//*[@id='0-isToBeAutomated']",
            PRECONDITIONS = "//input[@id='0-preconditions']",
            POSTCONDITIONS = "//input[@id='0-postconditions']",
            ADD_STEP_BUTTON = "//*[text()=' Add step']",
            STEP_ACTION = "//*[@id=\"application-content\"]/div/div[2]/form/div[1]/div[14]/div[1]/div[1]/div/div/div[2]/div/div[1]/input",
            DATA = "//*[@id=\"application-content\"]/div/div[2]/form/div[1]/div[14]/div[1]/div[1]/div/div/div[2]/div/div[2]/input",
            EXPACTED_RESULT = "//*[@id=\"application-content\"]/div/div[2]/form/div[1]/div[14]/div[1]/div[1]/div/div/div[2]/div/div[3]/input",
            SAVE_BUTTON = "//*[text()='Save']",
            CREATED_CASE_NAME = "//a[@href='/case/NATALY-1']";

    public void clickOnCaseButton() {
        $(byText("Case")).click();
    }

    public void setupTestCase(String title) {
        $x(TITLE).sendKeys(title);
        $x(CLICK_PRIORITY_DROPDOWN).click();
        $x(CHOOSE_PRIORITY).click();
        $x(CLICK_TYPE_DROPDOWN).click();
        $x(CHOOSE_TYPE).click();
        $x(CLICK_LAYER_DROPDOWN).click();
        $x(CHOOSE_LAYER).click();
        $x(CLICK_BEHAVIOR_DROPDOWN).click();
        $x(CHOOSE_BEHAVIOR).click();
        $x(TO_BE_AUTOMATED_CHECHBOX).click();
    }

    public void setConditions(String preConditions, String postConditions) {
        $x(PRECONDITIONS).sendKeys(preConditions);
        $x(POSTCONDITIONS).sendKeys(postConditions);
    }

    public void addSteps(String step1, String data1, String result1) {
        $x(ADD_STEP_BUTTON).click();
        $x(STEP_ACTION).sendKeys(step1);
        $x(DATA).sendKeys(data1);
        $x(EXPACTED_RESULT).sendKeys(result1);
    }

    public void clickOnSaveButton() {
        $x(SAVE_BUTTON).click();
    }

    public void testCaseIsCreated() {
        $x(CREATED_CASE_NAME).shouldBe(Condition.visible);
    }
}