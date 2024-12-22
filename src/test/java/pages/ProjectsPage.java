package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ProjectsPage {

    public void openPage() {
        open("projects");
    }

    public void waitTillOpened() {
        $(byText("Create new project")).shouldBe(Condition.visible);
    }

    public void clickOnCreateNewProjectButton() {
        $(byText("Create new project")).click();
    }

    public void addProject (String newProjectName) {
        $x("//*[@id='project-name']").sendKeys(newProjectName);
        $(byText("Public")).click();
        $(byText("Create project")).click();
        $(byText("Nataly")).shouldBe(Condition.visible);
    }

    public void removeProject(String projectName) {

        $(byText(projectName))
                .ancestor("tr")
                .find("button[aria-label='Open action menu']")
                .click();
        $("[data-testid=remove]").click();
        $x("//button[.//span[text()='Delete project']]").click();
    }
}