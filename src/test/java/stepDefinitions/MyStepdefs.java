package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyStepdefs {

    /*System.setProperty("webdriver.chrome.driver", "C://Users//RobertLucas//Downloads//chrome-win64.zip//chrome-win64//chromedriver.exe");

    ChromeOptions co = new ChromeOptions();
	    co.setBinary("C://Users//RobertLucas//Downloads//chrome-win64.zip//chrome-win64//chromedriver.exe");
    WebDriver driver = new ChromeDriver(co);
	    driver.get("https://unidemyglobal.com/");*/

    private WebDriver driver;

    @And("Code of ethics and conduct are checked")
    public void codeOfEthicsAndConductAreChecked() {

        WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'Code of Ethics and Conduct (applies to all Members)')]/following::span[@class='box']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);


        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

    }

    @And("Join and proceed are clicked")
    public void joinAndProceedAreClicked() throws InterruptedException {

        //Explicit wait, men får inte & funka :(
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement LastButton;
        LastButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#btnJoin")));

        driver.findElement(By.cssSelector("input#btnJoin")).click();
        System.out.println("Join and proceed is clicked");

    }

    @When("User is on the registration page")
    public void userIsOnTheRegistrationPage() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Basketball England Members Area", "Title is not matching");

    }

    @And("User fill in {string}")
    public void userFillIn(String Mobilephone) {

        driver.findElement(By.id("signup_memberdetails_mobilephone")).sendKeys(Mobilephone);

    }

    @And("User selects {string}")
    public void userSelects(String male) {

        Select dropDown = new Select(driver.findElement(By.id("signup_memberdetails_gender")));
        dropDown.selectByIndex(2);

    }

    @And("User enters {string} and {string}")
    public void userEntersAnd(String nationality, String countryofbirth) {

        Select dropDown = new Select(driver.findElement(By.id("sign_up_12")));
        dropDown.selectByIndex(211);

        dropDown = new Select(driver.findElement(By.id("sign_up_13")));
        dropDown.selectByIndex(211);

    }

    @And("User enter emergency contact details {string} and {string} and {string}")
    public void userEnterEmergencyContactDetailsAndAnd(String fullname, String relationship, String phonenumber) {

        driver.findElement(By.id("signup_nextofkin_name")).sendKeys(fullname);

        driver.findElement(By.id("signup_nextofkin_relationship")).sendKeys(relationship);

        driver.findElement(By.id("signup_nextofkin_contact")).sendKeys(phonenumber);

        System.out.println("All emergency contact details are filled in");

    }

    @And("User fills in address {string} and {string} and {string} and {string} and {string}")
    public void userFillsInAddressAndAndAndAnd(String addressline1, String towncity, String postcode, String county, String country) {

        driver.findElement(By.id("txtAddressLine1")).sendKeys(addressline1);

        driver.findElement(By.id("txtAddressTownCity")).sendKeys(towncity);

        driver.findElement(By.id("txtPostCode")).sendKeys(postcode);

        Select dropDown = new Select(driver.findElement(By.id("ddlCounty")));
        dropDown.selectByIndex(1);

        dropDown = new Select(driver.findElement(By.id("ddlCountry")));
        dropDown.selectByIndex(211);

        System.out.println("Address is filled in");

    }

    @And("User sets {string} and {string}")
    public void userSetsAnd(String password, String retypepassword) {

        driver.findElement(By.id("sign_up_9")).sendKeys(password);

        driver.findElement(By.id("sign_up_10")).sendKeys(retypepassword);

        System.out.println("Password is set");

    }

    @And("User fills in all anonymous information {string} and {string} and {string}")
    public void userFillsInAllAnonymousInformationAndAnd(String ethnicity, String sexualorientation, String religion) {

        Select dropDown = new Select(driver.findElement(By.id("signup_anonymousinfo_ethnicity")));
        dropDown.selectByIndex(1);

        dropDown = new Select(driver.findElement(By.id("signup_anonymousinfo_sexualorientation")));
        dropDown.selectByIndex(1);

        dropDown = new Select(driver.findElement(By.id("signup_anonymousinfo_religion")));
        dropDown.selectByIndex(1);

        System.out.println("All anonymous information i set");

    }



    @And("{string} are checked")
    public void areChecked(String codeofethicsandconduct) {

        driver.findElement(By.id("div:nth-of-type(7) > label > .box)).")).click();

        System.out.println("Code of ethics and conduct are checked");

    }

    @And("{string} are clicked")
    public void areClicked(String Joinandproceed) {

        driver.findElement(By.id("btnJoin")).click();
        System.out.println("Join and proceed is clicked");

    }

    @Then("An {string} is created")
    public void anIsCreated(String Account) {

        System.out.println("Account is created");

    }

    @And("User enter {string} {string} and {string}")
    public void userEnterAnd(String DateOfBirth, String firstName, String lastName) {

        driver.findElement(By.id("dp")).sendKeys(DateOfBirth);
        driver.findElement(By.id("member_firstname")).sendKeys(firstName);
        driver.findElement(By.id("member_lastname")).sendKeys(lastName);
    }

    @Given("User is on the correct {string}")
    public void userIsOnTheCorrect(String url) {

        driver = new EdgeDriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://membership.basketballengland.co.uk/NewFullAccount");
    }

    @And("User enter email {string} and {string}")
    public void userEnterEmailAnd(String Email, String confirmEmail) {

        driver.findElement(By.id("member_emailaddress")).sendKeys(Email);
        driver.findElement(By.id("member_confirmemailaddress")).sendKeys(confirmEmail);

    }

    @And("{string} is clicked")
    public void isClicked(String arg0) {

        driver.findElement(By.cssSelector("label[for=sign_up_25")).click();

        driver.findElement(By.cssSelector("label[for=sign_up_26")).click();

        System.out.println("Account confirmation i checked");

    }

    @And("User enter {string} {string}")
    public void userEnter(String DateOfBirth, String firstName) {

        driver.findElement(By.id("dp")).sendKeys(DateOfBirth);
        driver.findElement(By.id("member_firstname")).sendKeys(firstName);

    }

    @Then("An Account is not created and throw error last name is missing")
    public void anAccountIsNotCreatedAndThrowErrorLastNameIsMissing() {

        String expectedText = "Last Name is required";
        WebElement lastName = driver.findElement(By.xpath("//*[@id='member_lastname__label']/following-sibling::*/span"));
        String lastNameText = lastName.getText();
        Assert.assertEquals(lastNameText,expectedText, "Account is created successfully without LastName");
    }

    @Then("An Account is not created and throw error when password missmatch")
    public void anAccountIsNotCreatedAndThrowErrorWhenPasswordMissamatch() {

        String expectedPassword = "Password did not match";
        WebElement password = driver.findElement(By.xpath("//*[@name='ConfirmPassword']/following-sibling::*//span"));
        String confirmedPassword = password.getText();
        Assert.assertEquals(confirmedPassword,expectedPassword, "Account is created successfully without confirmed password");
    }

    @Then("An Account is not created and throw error when Code of Ethics not selected")
    public void anAccountIsNotCreatedAndThrowErrorWhenCodeOfEthisNotSelected() {

        String expectedWarning = "You must confirm that you have read, understood and agree to the Code of Ethics and Conduct";
        WebElement cOEText = driver.findElement(By.xpath("//*[@name='AgreeToCodeOfEthicsAndConduct']/following-sibling::*[@class='warning field-validation-error']"));
        String cOETextWarning = cOEText.getText();
        Assert.assertEquals(cOETextWarning,expectedWarning, "Account is created successfully without confirmed password");
    }

    @And("User enter email address")
    public void userEnterEmailAddress() {
        String emailId = RandomStringUtils.randomAlphanumeric(10).toUpperCase();
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}