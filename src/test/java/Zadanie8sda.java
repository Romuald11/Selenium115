//Napisz test:
//        Wejdź na stronę: https://www.bbc.com.
//        Wypisz w konsoli ilość dostępnych linków na stronie.
//        Wypisz w konsoli ilość dostępnych obrazków na stronie.

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//import java.util.List;

public class Zadanie8sda {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.bbc.com");
    }

    @Test
    public void iloscLinkowNaStronie() {
        List<WebElement> znalezionyLinki = driver.findElements(By.tagName("a"));
        System.out.println("Ilosc linkow na stronie = " + znalezionyLinki.size());
    }

    @Test
    public void iloscObrazkoNaStronie(){
        List<WebElement> znalezioneObrazki = driver.findElements(By.tagName("img"));
        System.out.println("Ilosc znalezionych obrazkow = " + znalezioneObrazki.size());
    }

    @AfterAll
    public static void tearDown(){
        driver.close();
    }







}
