package br.com.framework.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUserLink")
    public WebElement btnLogin;

    public WebElement btnFechar;
    public WebElement divFecharModal;
    @FindBy(css = "body > login-modal > div > div > div.login.ng-scope > sec-form > sec-view:nth-child(1) > div > input")
    public WebElement inpUsername;
    public WebElement inpPassword;
    public WebElement btnSignin;
    public WebElement inpRemember;
    public WebElement linkCreateAccount;


}
