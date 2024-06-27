package teste.base2.mantis.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import teste.base2.mantis.pages.LoginPage;
import teste.base2.mantis.pages.TaskCreatePage;

import java.time.Duration;

public class TaskTest extends LoginPage {

    TaskCreatePage task = new TaskCreatePage();

    @Test
    @DisplayName("Logar no sistema")
    public void createTask() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

//        Abrir o site Mantis
        browser.get("http://mantis-prova.base2.com.br");

//        Logar no sistema
        browser.findElement(userName).sendKeys(user);
        browser.findElement(buttonEntrar).click();
        browser.findElement(passwordLocator).sendKeys(passWord);
        browser.findElement(buttonEntrar).click();

        browser.findElement(task.btnCrate).click();
        browser.findElement(task.category).click();

        WebElement comboboxElement = browser.findElement(task.category);
        Select combobox = new Select(comboboxElement);
        combobox.selectByValue("2");

        browser.findElement(task.resume).sendKeys(task.resumeText);
        browser.findElement(task.description).sendKeys(task.descriptionText);
        browser.findElement(task.btnCrateNew).click();

//        Fechar o navegador
        browser.quit();

    }
}
