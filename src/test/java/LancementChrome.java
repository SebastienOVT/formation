package test.java;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LancementChrome {

    @Test
    public void startChromeDriver() {
        //Récupérer le chemin du driver
        String path = System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");

        //Initialisation de l'instance du driver
        WebDriver driver = new ChromeDriver();

        //Lancement en mode maximize
        driver.manage().window().maximize();

        //Lancer le navigateur avec la bonne URL
        driver.get("http://demo.guru99.com/test/newtours/");

        //Utilisation du thread Java (moins propre car on n'utilise pas le wait du navigateur)
       try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Implic wait (plus propre)
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Quitter le navigateur
        driver.quit();
    }
}
