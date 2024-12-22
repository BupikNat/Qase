package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProjectsPage;
import pages.TestCasePage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

    LoginPage loginPage;
    ProjectsPage projectsPage;
    TestCasePage testCasePage;
    CreateTestCaseTest testCaseTest;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");  //можно прописать только через опции Selenium, в Селениде нет
        options.addArguments("--disable-notifications");
        Configuration.browserCapabilities = options;
        Configuration.browser = "chrome";  //Указывается браузер
        Configuration.headless = false;  //выключаются заголовки
        Configuration.timeout = 10000;   //тайм аут при открытии страницы
        Configuration.clickViaJs = true;  //взаимодействие с элементами (клики) через JavaScript
        Configuration.baseUrl = "https://app.qase.io/";  //базовый url, используется в методе open
        //Configuration.assertionMode = AssertionMode.valueOf("SOFT");  //мягкий ассерт, если кая-то проверка упал, то будут выполняться следующие проверки (без мягкого ассерта при падении проверки следующие проверки не выполняются)
        //getWebDriver().;  //экземпляр драйвера на основании настроек выше
        //WebDriver driver = new ChromeDriver();
        //setWebDriver(driver);

        loginPage = new LoginPage();
        projectsPage = new ProjectsPage();
        testCasePage = new TestCasePage();
        testCaseTest = new CreateTestCaseTest(testCasePage);

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        closeWebDriver();
    }
}