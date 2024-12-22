package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProjectTest extends BaseTest {

    @Test
    public void checkCreateProject() {
        loginPage.openPage();
        loginPage.login("natalysheadache@gmail.com", "Mypassword001!");
        projectsPage.waitTillOpened();
        projectsPage.clickOnCreateNewProjectButton();
        projectsPage.addProject("Nataly");
        testCaseTest.createTestCase();
        projectsPage.removeProject("Nataly");
    }
}