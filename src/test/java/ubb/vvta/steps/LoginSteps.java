package ubb.vvta.steps;

import net.serenitybdd.annotations.Step;
import org.junit.jupiter.api.Assertions;
import ubb.vvta.pages.AccountPage;
import ubb.vvta.pages.LoginPage;
import ubb.vvta.pages.MainPage;

public class LoginSteps {
    private MainPage mainPage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void startHomePage() {
        this.mainPage.open();
    }

    @Step
    public void acceptCookies() {

        this.mainPage.setAcceptCookies();
    }
    @Step
    public void accesLoginPage() {
        this.mainPage.goToLoginPage();
    }
    @Step
    public void enterCredentials(String userName, String password) {
        this.loginPage.enterUserName(userName);
        this.loginPage.enterPassword(password);
    }
    @Step
    public void submitLogin() {
        this.loginPage.clikSubmit();
    }

    @Step
    public void goToHomePage() {
        this.accountPage.goToHomePage();
    }

    @Step
    public void logout() {
        this.mainPage.setLogoutButton();
    }

    @Step
    public void exceptToSeeAccountSettings(String title) {
        Assertions.assertEquals(title, this.accountPage.getTitleText());
    }



    @Step
    public void expectToSeeWarning(String warning) {
        Assertions.assertEquals(warning, this.loginPage.getWarningMessage());
    }

    @Step
    public void expectToSeeLoginButton() {
        Assertions.assertEquals("CONECTARE", this.mainPage.getTextFromLoginButton());
    }
}
