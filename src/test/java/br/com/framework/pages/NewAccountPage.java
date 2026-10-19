package br.com.framework.pages;

import br.com.framework.core.Driver;
import br.com.framework.maps.NewAccountMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
    NewAccountMap newAccountMap;

    public NewAccountPage(){
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(), newAccountMap);
    }

    public String getTextNewAccount(){
        Driver.visibilityOf(newAccountMap.txtCreateAccount);
        return newAccountMap.txtCreateAccount.getText();
    }

    public void setInpUsername(String userName){
        newAccountMap.inpUserName.sendKeys(userName);
    }

    public void setInpEmail(String email){
        newAccountMap.inpEmail.sendKeys(email);
    }
    public void setInpPassword(String password){
        newAccountMap.inpPassword.sendKeys(password);
    }
    public void setInpConfirmPassword(String password){
        newAccountMap.inpConfirmPassword.sendKeys(password);
    }

    public void selectCountry(String country){
        Select select = new Select(newAccountMap.slcCountry);
        select.selectByVisibleText(country);
    }

    public void clickInpIagree(){
        newAccountMap.inpIagree.click();
    }

    public void clickBtnRegister(){
        newAccountMap.btnRegister.click();
    }
}
