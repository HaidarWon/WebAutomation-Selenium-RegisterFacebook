package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class register {
    WebDriver driver;
    @Given("User open web url {string}")
    public void userOpenWebUrl(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("User input firstname {string}")
    public void userInputFirstname(String firstname) {
        driver.findElement(By.name("firstname")).sendKeys(firstname);
    }

    @Then("User input surname {string}")
    public void userInputSurname(String surname) {
//        driver.findElement(By.id("u_0_d_/W")).sendKeys(surname);
        driver.findElement(By.name("lastname")).sendKeys(surname);
    }

    @When("User input phone {string}")
    public void userInputPhone(String phone) {
        driver.findElement(By.name("reg_email__")).sendKeys(phone);
    }

    @And("User input newpass {string}")
    public void userInputNewpass(String newpass) {
        driver.findElement(By.name("reg_passwd__")).sendKeys(newpass);
    }

    @Then("User input date")
    public void userInputDate() {
        WebElement date= driver.findElement(By.id("day"));
        Select dateDropdown = new Select(date);
        dateDropdown.selectByVisibleText("1");
    }

    @When("User input month")
    public void userInputMonth() {
        WebElement months= driver.findElement(By.id("month"));
        Select dateDropdown = new Select(months);
        dateDropdown.selectByVisibleText("May");
    }

    @Then("User input years")
    public void userInputYears() {
        WebElement years= driver.findElement(By.id("year"));
        Select dateDropdown = new Select(years);
        dateDropdown.selectByVisibleText("2001");
    }

    @And("User choose gender")
    public void userChooseGender() {
        driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
    }

    @Then("User click Signup Button")
    public void userClickSignupButton() {
        //driver.findElement(By.name("websubmit")).click();
        driver.close();
        driver.quit();

    }


}
