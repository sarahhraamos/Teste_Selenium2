package io.cucumber.sarah.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Configuracao {
    
    public static WebDriver browser;
    
    public static void abrir(String url){
        if(browser == null){

            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            browser = new ChromeDriver();

            browser.manage().window().maximize();
        }
      
        browser.get(url);
    }

    public static void fechar(){
        browser.close();
        browser = null;
    }

    public static WebElement seletorQueryCss(String seletor) {
        return  Configuracao.browser.findElement(By.cssSelector(seletor));
    }
    

    public static WebElement seletorQueryXpath(String seletor) {
        return  Configuracao.browser.findElement(By.xpath(seletor));
    }

}