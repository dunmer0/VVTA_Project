package ubb.vvta.features;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import ubb.vvta.steps.LoginSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginFeatureParameterized {
    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    LoginSteps loginSteps;

    @Title("Parameterized test for login with invalid inputs.")
    @ParameterizedTest
    @CsvFileSource(resources = "/loginparams.csv", numLinesToSkip = 1)
    @Order(2)
    public void loginWithInvalidCredentials(String username, String password) {
        loginSteps.startHomePage();
        loginSteps.acceptCookies();
        loginSteps.accesLoginPage();
        loginSteps.enterCredentials(username, password);
        loginSteps.submitLogin();
        loginSteps.expectToSeeWarning("Adresa dumneavoastră de email / Parola este incorectă. Vă rugăm să încercați din nou.");
    }
}
