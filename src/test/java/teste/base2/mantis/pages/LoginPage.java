package teste.base2.mantis.pages;

import org.openqa.selenium.By;

public class LoginPage {

    public By userName = By.id("username");
    public By buttonEntrar = By.xpath("//input[@type='submit']");
    public By passwordLocator = By.id("password");
    public String user = "Ana_Santos";
    public String passWord = "testeBase2";

}
