package br.com.framework.steps;

import br.com.framework.core.Driver;
import br.com.framework.pages.NewAccountPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class NewAccountSteps {
    NewAccountPage newAccountPage;
    String username;
    String password;
    String email;
    String confirmPassword;
    String country;


    @Dado("que a pagina new account esteja sendo exibida")
    public void queAPaginaNewAccountEstejaSendoExibida(){
        Driver.getDriver().get("https://www.advantageonlineshopping.com/#/register");
        newAccountPage = new NewAccountPage();
        throw new io.cucumber.java.PendingException();
    }

    @Quando("os campos de cadastro estiverem preenchidos com")
    public void osCamposDeCadastroEstiveremPreenchidosCom(io.cucumber.datatable.DataTable dataTable){
        if(username != null){
            newAccountPage.setInpUsername(username);
        }
        if(password != null){
            newAccountPage.setInpPassword(password);
        }
        if(email != null){
            newAccountPage.setInpEmail(email);
        }
        if(confirmPassword != null){
            newAccountPage.setInpConfirmPassword(password);
        }
        if(country != null){
            newAccountPage.selectCountry(country);
        }
        throw new io.cucumber.java.PendingException();
    }

    @Então("deve ser possivel logar no sistema apos o cadastro")
    public void deveSerPossivelLogarNoSistemaAposOCadastro() {
        throw new io.cucumber.java.PendingException();
    }
}
