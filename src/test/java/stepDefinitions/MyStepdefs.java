package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyStepdefs {

    private Registrator registrator;

    private WebDriver driver;
    private WebDriver WebDriverReference;
    private String browser;

    @And("Code of ethics and conduct are checked")
    public void codeOfEthicsAndConductAreChecked() {

        driver.findElement(By.cssSelector("label[for='fanmembersignup_agreetocodeofethicsandconduct'] span[class='box']")).click();

        System.out.println("Code of ethics and conduct are checked");

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

    @And("{string} is checked")
    public void isChecked(String Accountconfirmation) {

        driver.findElement(By.cssSelector("label[for=sign_up_25")).click();

        driver.findElement(By.cssSelector("label[for=sign_up_26")).click();

        System.out.println("Account confirmation i checked");

    }

    @And("{string} are checked")
    public void areChecked(String codeofethicsandconduct) {

        driver.findElement(By.cssSelector("div:nth-of-type(7) > label > .box)).")).click();

        System.out.println("Code of ethics and conduct are checked");

    }

    @And("{string} are clicked")
    public void areClicked(String Joinandproceed) {

        //Explicit wait, men får inte & funka :(
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //WebElement LastButton;
        //LastButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Joinandproceed)));

        driver.findElement(By.cssSelector("input#btnJoin")).click();
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
        driver.manage().window().maximize();
        driver.get(url);
    }

    @And("User enter email {string} and {string}")
    public void userEnterEmailAnd(String Email, String confirmEmail) {

        driver.findElement(By.id("member_emailaddress")).sendKeys(Email);
        driver.findElement(By.id("member_confirmemailaddress")).sendKeys(confirmEmail);

    }
}

    /*@Given("User is using {string} as {string}")
    public void userIsUsingAs(String arg0, String arg1) {

        {
            if (browser.equals(("edge"))) {
                driver = new EdgeDriver();
            } else if (browser.equals("chrome")) {
                driver = new ChromeDriver();
            }
            driver.get("https://membership.basketballengland.co.uk/NewFullAccount");

        }*/


    class Registrator {

    }









