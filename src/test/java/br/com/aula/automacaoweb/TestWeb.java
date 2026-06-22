package br.com.aula.automacaoweb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class TestWeb {

    ChromeDriver driver;

    @Before
    public void inicializaTest(){
        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://youtube.com");
    }



    @Test
    public void primeiroTest(){

        String xpathTitulo = "//*[@id=\"sections\"]/ytd-guide-signin-promo-renderer/yt-formatted-string";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Faça login para curtir vídeos, comentar e se inscrever.", titulo);

    }

    @After
    public void finalizaTest(){
        driver.quit();
    }



}

