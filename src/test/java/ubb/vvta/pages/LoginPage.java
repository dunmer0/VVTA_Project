package ubb.vvta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
    @FindBy(id = "ShopLoginForm_Login")
    private WebElementFacade userNameInput;
    @FindBy(id = "ShopLoginForm_Password")
    private WebElementFacade passwordInput;
    @FindBy(name = "login")
    private WebElementFacade submitButton;
    @FindBy(xpath = "//div[@class=\"alert alert-danger\"]")
    private WebElementFacade loginWarning;

    public void enterUserName(String userName) {
        userNameInput.sendKeys(userName);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clikSubmit() {
        submitButton.click();
    }

    public String getWarningMessage() {
        return this.loginWarning.getText();
    }
}
