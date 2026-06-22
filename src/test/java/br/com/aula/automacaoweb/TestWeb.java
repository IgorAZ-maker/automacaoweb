package br.com.aula.automacaoweb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class TestWeb {

    @Test
    public void primeiroTest(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://youtube.com");
        String xpathTitulo = "//*[@id=\"sections\"]/ytd-guide-signin-promo-renderer/yt-formatted-string";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Faça login para curtir vídeos, comentar e se inscrever.", titulo);

        driver.quit();



    }
}
