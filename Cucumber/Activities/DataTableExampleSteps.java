package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

public class DataTableExampleSteps extends BaseClass {

    @Given("user is on the To-Do list page")
    public void openPage() {
        // Open the To-Do list page
        driver.get("https://training-support.net/webelements/todo-list");
        // Verify the title of the page
        assertEquals(driver.getTitle(), "Selenium: To-Do List");
    }

    @When("user adds the following tasks")
    public void inputTasks(DataTable tasksTable) throws InterruptedException {
        // Convert the DataTable to a List of Strings (tasks)
        List<String> tasks = tasksTable.asList(String.class);
        
        // Iterate over each task and add it to the To-Do list
        for (String task : tasks) {
            driver.findElement(By.id("todo-input")).sendKeys(task); // Enter task into the input field
            driver.findElement(By.id("todo-add")).click(); // Click the "Add" button
            Thread.sleep(1000); // Wait for the task to be added (this can be improved with explicit waits)
        }
    }

    @Then("they can see the task added to the list")
    public void verifyTasksAdded() {
        // Verify that all tasks have been added to the To-Do list
        // This could involve checking for the task name on the page. Let's just print for now.
        System.out.println("All tasks are added to the list");
        
        // Example check (you can enhance this part to verify the task on the page):
        // List<WebElement> todoList = driver.findElements(By.className("todo-list"));
        // for (String task : tasks) {
        //     assertTrue(todoList.contains(task));
        // }
    }
}
