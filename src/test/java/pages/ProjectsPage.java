package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ProjectsPage {

    private static final String PROJECT_NAME = "//*[@id='project-name']",
            PROJECTS_LINK = "//a[@href='/projects']",
            REMOVE_BUTTON = "[data-testid=remove]",
            DELETE_PROJECT_BUTTON = "//button[.//span[text()='Delete project']]";


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
        $x(PROJECT_NAME).sendKeys(newProjectName);
        $(byText("Public")).click();
        $(byText("Create project")).click();
        $(byText("Nataly")).shouldBe(Condition.visible);
    }

    public void openProjectsPage() {
        $x(PROJECTS_LINK).click();
    }

    public void removeProject(String projectName) {

        $(byText(projectName))
                .ancestor("tr")
                .find("button[aria-label='Open action menu']")
                .click();
        $(REMOVE_BUTTON).click();
        $x(DELETE_PROJECT_BUTTON).click();
    }
}