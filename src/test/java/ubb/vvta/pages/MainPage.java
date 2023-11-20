package ubb.vvta.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.elefant.ro/")
public class MainPage extends PageObject {

    @FindBy(xpath = "//span[@class=\"login-prompt js-login-prompt\"]")
    private WebElementFacade logInButton;
    @FindBy(xpath = "//a[@class=\"my-account-login btn btn-primary btn-block\"]")
    private WebElementFacade connectButton;
    @FindBy(xpath = "//button[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")
    private WebElementFacade acceptCookies;
    @FindBy(xpath = "//input[@name=\"SearchTerm\"]")
    private WebElementFacade searchField;

    public void goToLoginPage() {
        this.logInButton.click();
        this.connectButton.click();
    }

    public void setAcceptCookies() {
        acceptCookies.click();
    }

    public void setSearchField(String searchField) {
        this.searchField.sendKeys(searchField);
    }

}
