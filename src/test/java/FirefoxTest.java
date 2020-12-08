package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;


public class FirefoxTest {

    @Test
    public void startFirefoxDriver() {
        //Récupérer le chemin du driver
        String path = System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
        //Initialisation de l'instance du driver
        WebDriver driver = new FirefoxDriver();
        //Lancer le navigateur avec la bonne URL
        driver.get("https://www.google.fr");
        //Quitter le navigateur
        driver.quit();
    }
}
