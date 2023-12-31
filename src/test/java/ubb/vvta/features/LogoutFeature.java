package ubb.vvta.features;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import ubb.vvta.pages.MainPage;
import ubb.vvta.steps.LoginSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class LogoutFeature {
    @Managed(uniqueSession = true)
    WebDriver webDriver;

    @Steps
    LoginSteps loginSteps;


    @Title("Testing logout feature. Expect to see the login button after logout.")
    @Test
    @Order(5)
    public void expectToSeeLogoutButton() {
        loginSteps.startHomePage();
        loginSteps.acceptCookies();
        loginSteps.accesLoginPage();
        loginSteps.enterCredentials("popa.catalin88@gmail.com", "TestareAutomata");
        loginSteps.submitLogin();
        loginSteps.goToHomePage();
        loginSteps.logout();
        loginSteps.expectToSeeLoginButton();
    }
}
