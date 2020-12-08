package test.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.reflect.misc.FieldUtil;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

public class SignUpMercury {

    WebDriver driver;
    @Before
    public void setUp() {
        //Récupérer le chemin du driver
        String path = System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");

        //Initialisation de l'instance du driver
        driver = new ChromeDriver();

        //Lancement en mode maximize
        driver.manage().window().maximize();
    }

    @Test
    public void startChromeDriver() throws InterruptedException {
        //Lancer le navigateur avec la bonne URL
        driver.get("http://demo.guru99.com/test/newtours/");

        //Implic wait (plus propre)
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.name("firstName")).sendKeys("Firstname");
        driver.findElement(By.name("lastName")).sendKeys("Lastname");
        driver.findElement(By.name("phone")).sendKeys("012345678");
        driver.findElement(By.name("userName")).sendKeys("username@username.com");
        driver.findElement(By.name("address1")).sendKeys("20 rue de ladresse");
        driver.findElement(By.name("city")).sendKeys("Paris");
        driver.findElement(By.name("state")).sendKeys("Ile de France");
        driver.findElement(By.name("postalCode")).sendKeys("0123456");

        driver.findElement(By.name("email")).sendKeys("test@test.fr");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.name("confirmPassword")).sendKeys("password");
        driver.findElement(By.name("submit")).click();

        Thread.sleep(5000);

    }

    @After
    public void tearDown() {
        //Quitter le navigateur
        driver.quit();
    }
}
