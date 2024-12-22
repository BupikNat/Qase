package pages;

import tests.BaseTest;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TestCasePage {

    public void clickOnCaseButton() {
        $(byText("Case")).click();
    }

    public void setupTestCase(String title) {

        $x("//input[@id='title']").sendKeys(title);
        $x("//div[@id='0-priority']//*[@fill='currentColor']").click();
        $x("//div[@class='SynGa1']//div[text()='Medium']").click();
        $x("//div[@id='0-type']//*[@fill='currentColor']").click();
        $x("//div[@class='SynGa1']//div[text()='Smoke']").click();
        $x("//div[@id='0-layer']//*[@fill='currentColor']").click();
        $x("//div[@class='SynGa1']//div[text()='E2E']").click();
        $x("//div[@id='0-behavior']//*[@fill='currentColor']").click();
        $x("//div[@class='SynGa1']//div[text()='E2E']").click();
        $x("//*[@id='0-isToBeAutomated']").click();
    }

    public void setConditions(String preConditions, String postConditions) {

        $x("//input[@id='0-preconditions']").sendKeys(preConditions);
        $x("//input[@id='0-postconditions']").sendKeys(postConditions);
    }

    public void addSteps(String step1, String data1, String result1, String step2, String data2, String result2) {
        $(byText(" Add step")).click();
        $x("//*[@id=\"application-content\"]/div/div[2]/form/div[1]/div[14]/div[1]/div[1]/div/div/div[2]/div/div[1]/input").sendKeys(step1);
        $x("//*[@id=\"application-content\"]/div/div[2]/form/div[1]/div[14]/div[1]/div[1]/div/div/div[2]/div/div[2]/input").sendKeys(data1);
        $x("//*[@id=\"application-content\"]/div/div[2]/form/div[1]/div[14]/div[1]/div[1]/div/div/div[2]/div/div[3]/input").sendKeys(result1);
        $(byText(" Add step")).click();
        $x("//*[@id=\"application-content\"]/div/div[2]/form/div[1]/div[14]/div[1]/div[1]/div/div/div[2]/div/div[1]/input").sendKeys(step2);
        $x("//*[@id=\"application-content\"]/div/div[2]/form/div[1]/div[14]/div[1]/div[1]/div/div/div[2]/div/div[2]/input").sendKeys(data2);
        $x("//*[@id=\"application-content\"]/div/div[2]/form/div[1]/div[14]/div[1]/div[1]/div/div/div[2]/div/div[3]/input").sendKeys(result2);
    }

    public void clickOnSaveButton() {
        $(byText("Save")).click();
    }
}