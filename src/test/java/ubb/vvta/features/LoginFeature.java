package ubb.vvta.features;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
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

    @Test
    public void loginWithValidCredentials() {
        loginSteps.startHomePage();
        loginSteps.acceptCookies();
        loginSteps.accesLoginPage();
        loginSteps.enterCredentials("popa.catalin88@gmail.com", "TestareAutomata");
        loginSteps.submitLogin();
        loginSteps.exceptToSeeAccountSettings("SETARI CONT");
    }

    @Test
    public void loginWithInvalidCredentials() {
        loginSteps.startHomePage();
        loginSteps.acceptCookies();
        loginSteps.accesLoginPage();
        loginSteps.enterCredentials("popa.catalin88@gmail.com", "validare");
        loginSteps.submitLogin();
        loginSteps.expectToSeeWarning("Adresa dumneavoastră de email / Parola este incorectă. Vă rugăm să încercați din nou.");
    }
}
