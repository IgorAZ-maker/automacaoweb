package br.com.framework.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUserLink")
    public WebElement btnLogin;
    @FindBy(css = ".closeBtn")
    public WebElement btnFechar;
    @FindBy(css = ".PopUp")
    public WebElement divFecharModal;
    @FindBy(css = "*[name='username']")
    public WebElement inpUsername;
    @FindBy(css = "*[name='password']")
    public WebElement inpPassword;
    @FindBy(css = "#sign_in_btn")
    public WebElement btnSignin;
    @FindBy(css = "*[name='remember_me']")
    public WebElement inpRemember;
    @FindBy(css = "a.create-new-account.ng-scope")
    public WebElement linkCreateAccount;
    @FindBy(css = ".loader")
    public WebElement divLoader;
    @FindBy(css = ".containMiniTitle ")
    public WebElement txtLogado;
    @FindBy(xpath = "//label[contains(text(), 'Incorrect ')]")
    public WebElement txtErroLogin;


}
