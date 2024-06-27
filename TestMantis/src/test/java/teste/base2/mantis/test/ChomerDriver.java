package teste.base2.mantis.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChomerDriver {

    public void factory() {

    WebDriverManager.chromedriver().setup();

    WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

//        Abrir o site Mantis
        browser.get("http://mantis-prova.base2.com.br");
    }
}
