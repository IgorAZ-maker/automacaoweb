package br.com.aula.automacaoweb;

import br.com.aula.core.Driver;
import br.com.aula.pages.CursoPage;
import br.com.aula.pages.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.jspecify.annotations.NonNull;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;

public class TestWeb {
    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaTest(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
    }

    @Test
    public void primeiroTest(){
        assertEquals("Porque Tempo É Conhecimento.", principalPage.getTitulo());
    }

    @Test
    public void segundoTeste() throws InterruptedException {
        cursoPage = new CursoPage(driver);
        principalPage.clickBotao();
        assertEquals("Conheça todos os nossos cursos.",cursoPage.getTitulo2());

    }

    @After
    public void finalizaTest(){
        driver.quit();
    }
}

