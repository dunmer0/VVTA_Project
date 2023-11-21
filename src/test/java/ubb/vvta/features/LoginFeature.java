package ubb.vvta.features;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import ubb.vvta.steps.LoginSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginFeature {
    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    LoginSteps loginSteps;

    @Title("Login test.")
    @Test
    @Order(1)
    public void loginWithValidCredentials() {
        loginSteps.startHomePage();
        loginSteps.acceptCookies();
        loginSteps.accesLoginPage();
        loginSteps.enterCredentials("popa.catalin88@gmail.com", "TestareAutomata");
        loginSteps.submitLogin();
        loginSteps.exceptToSeeAccountSettings("SETARI CONT");
    }

}
