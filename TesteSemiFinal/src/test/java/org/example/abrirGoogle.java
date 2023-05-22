package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;


public class abrirGoogle {
    private WebDriver browser;

    @Before
    public void pesquisaNoGoogle() {
        System.setProperty("web-driver.chrome.driver", "C:\\Projetos Automação\\minha automação\\Teste-Semi-Final\\drivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
    }

    @Test
    public void entraNoGoole() {

        browser.get("http:www.google.com.br");

        WebElement fazCoisaNaPagina = browser.findElement(By.id("APjFqb"));
        fazCoisaNaPagina.sendKeys("nttdatasolutions" + Keys.ENTER);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException espera) {
            espera.printStackTrace();
        }

        WebElement achaCoisa = browser.findElement(By.cssSelector(".CCgQ5 > span"));
        achaCoisa.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException espera) {
            espera.printStackTrace();
        }

        WebElement achaCoockie = browser.findElement(By.id("all"));
        achaCoockie.click();

        try {
            Thread.sleep(3000);
       } catch (InterruptedException espera) {
            espera.printStackTrace();
        }

        WebElement carreira = browser.findElement(By.cssSelector(".menu-item-32094 span"));
        carreira.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException espera) {
            espera.printStackTrace();
        }

        WebElement junteSe = browser.findElement(By.xpath("//a[.='Junte-se a nossa equipe']"));
        junteSe.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException espera) {
            espera.printStackTrace();
        }

        ArrayList<String> alternaEntreAbas = new ArrayList<>(browser.getWindowHandles());
        browser.switchTo().window(alternaEntreAbas.get(1));

        WebElement barraDePesquisar = browser.findElement(By.id("pesquisar-vaga-localidade-etc"));

        barraDePesquisar.sendKeys("Arquiteto"+ Keys.ENTER);
        
        try {
            Thread.sleep(9000);
        } catch (InterruptedException espera) {
            espera.printStackTrace();
        }
    }
    @After
    public void fechaNav(){
        browser.quit();
    }
}
