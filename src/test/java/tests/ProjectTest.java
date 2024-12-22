package tests;

import org.testng.annotations.Test;

public class ProjectTest extends BaseTest {

    @Test
    public void checkCreateProject() {
        loginPage.openPage();
        loginPage.login("natalysheadache@gmail.com", "Mypassword001!");
        projectsPage.waitTillOpened();
        projectsPage.clickOnCreateNewProjectButton();
        projectsPage.addProject("Nataly");
        projectsPage.projectIsCreated();
        testCaseTest.createTestCase();
        projectsPage.openProjectsPage();
        projectsPage.removeProject("Nataly");
    }
}