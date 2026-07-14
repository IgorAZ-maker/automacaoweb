package br.com.framework.pages;

import br.com.framework.maps.PrincipalMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    WebDriver driver;
    PrincipalMap principalMap;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver, principalMap);

    }

    public String getTitulo() {
        return principalMap.txtTitulo.getText();

    }

    public void clickBotao() throws InterruptedException {
        principalMap.btnTitulo.click();
        Thread.sleep(1500);
    }

}
