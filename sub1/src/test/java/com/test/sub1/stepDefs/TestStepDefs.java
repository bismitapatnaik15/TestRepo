package com.test.sub1.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.text.controlstracture.helpers.DriverUtils.getDriver;

public class TestStepDefs {

    public static WebDriver driver = getDriver();

    @Given("^I  on the  google page$")
    public void start() throws Throwable {

    String url="https://www.google.co.uk/";
        System.setProperty("webdriver.chrome.driver", "/Users/bismitapatnaik/Desktop/chromeDriver/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);

            // String url1="https://gmail.com";
            // String url2="https://www.phptravels.net/admin";
           // // idriver.get(url2);
           // System.out.println(idriver.getTitle());
           // String userid="email";
           //idriver.findElements("userId")
          // WebElement loginLink = idriver.findElement(By.linkText("email"));


       // why we need driver == null first, when are running 2 tests

    }

    @When("^I enter some search$")
    public void whatYouDoing() throws Throwable {
        driver.findElement(By.name("q")).sendKeys("Reading");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("^I should  see some result$")
    public void whatYouWhatToAchive() throws Throwable {
        Assert.assertEquals("Reading", driver.findElement(By.xpath("//*[@id=\"tsuid100\"]/div[1]/div[2]/div[1]/div[2]/div[2]/div/div/div/div[1]/span")).getText());
        driver.quit();
    }

    @When("^I enter some search \"([^\"]*)\"$")
    public void i_enter_some_search(String arg1) throws Throwable {
        driver.findElement(By.name("q")).sendKeys(arg1);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
