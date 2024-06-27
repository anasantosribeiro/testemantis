package teste.base2.mantis.pages;

import org.openqa.selenium.By;

public class TaskCreatePage {

    public By category = By.id("category_id");
    public By resume = By.id("summary");
    public By description = By.id("description");

    public By btnCrate = By.xpath("//*[text()=' Criar Tarefa']");

    public By btnCrateNew = By.xpath("//input[@type='submit']");

    public String resumeText = "Teste tecnico Base2";

    public String descriptionText = "Descrição Teste tecnico Base2";






}
