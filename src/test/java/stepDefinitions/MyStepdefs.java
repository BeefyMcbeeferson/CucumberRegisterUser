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

public class MyStepdefs<string, function> {

    private Registrator registrator;

    private WebDriver driver;
    private WebDriver WebDriverReference;
    private String browser;

    @And("User fill in all member details")
    public void iFillInAllRequiredFields() throws Throwable {

        WebElement search = driver.findElement(By.id("dp"));
        search.sendKeys("12/02/1980");

        driver.findElement(By.id("member_firstname")).sendKeys("Robert");
        Thread.sleep(1000);

        driver.findElement(By.id("member_lastname")).sendKeys("Lucas");
        Thread.sleep(1000);

        driver.findElement(By.id("member_emailaddress")).sendKeys("robert.lucaas.80@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.id("member_confirmemailaddress")).sendKeys("robert.lucaas.80@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.id("signup_memberdetails_mobilephone")).sendKeys("+46702064151");
        Thread.sleep(1000);

        driver.findElement(By.id("signup_memberdetails_homephone")).sendKeys("+46702064151");
        Thread.sleep(1000);

        Select dropDown = new Select(driver.findElement(By.id("signup_memberdetails_gender")));

        dropDown.selectByIndex(2);
        Thread.sleep(1000);

        dropDown = new Select(driver.findElement(By.id("sign_up_12")));
        dropDown.selectByIndex(211);
        Thread.sleep(1000);

        dropDown = new Select(driver.findElement(By.id("sign_up_13")));
        dropDown.selectByIndex(211);
        Thread.sleep(1000);

        System.out.println("All member details are filled in");

    }

    @And("User fill in all emergency contact details")
    public void userFillInAllEmergencyContactDetails() {

        driver.findElement(By.id("signup_nextofkin_name")).sendKeys("Anna Lucas");

        driver.findElement(By.id("signup_nextofkin_relationship")).sendKeys("Wife");

        driver.findElement(By.id("signup_nextofkin_contact")).sendKeys("+46768778384");
        System.out.println("All emergency contact details are filled in");

    }

    @And("User fill in address")
    public void userFillInAddress() {

        driver.findElement(By.id("txtAddressLine1")).sendKeys("31 The Square, Tarland, Aberdeenshire Scotland");

        driver.findElement(By.id("txtAddressTownCity")).sendKeys("Aberchirder");

        driver.findElement(By.id("txtPostCode")).sendKeys("AB34 4TX");

        Select dropDown = new Select(driver.findElement(By.id("ddlCounty")));
        dropDown.selectByIndex(1);

        dropDown = new Select(driver.findElement(By.name("CountryId")));
        dropDown.selectByIndex(211);

        System.out.println("Address is filled in");

    }

    @And("User sets password")
    public void userSetsPassword() {

        driver.findElement(By.id("sign_up_9")).sendKeys("EttEnkeltLösenord");

        driver.findElement(By.id("sign_up_10")).sendKeys("EttEnkeltLösenord");

        System.out.println("Password is set");

    }

    @And("User fills in all anonymous information")
    public void userFillsInAllAnonymousInformation() {

        Select dropDown = new Select(driver.findElement(By.id("signup_anonymousinfo_ethnicity")));
        dropDown.selectByIndex(1);

        dropDown = new Select(driver.findElement(By.id("signup_anonymousinfo_sexualorientation")));
        dropDown.selectByIndex(1);

        dropDown = new Select(driver.findElement(By.id("signup_anonymousinfo_religion")));
        dropDown.selectByIndex(1);

        System.out.println("All anonymous information i set");

    }

    @And("Account confirmation is checked")
    public void AccountConfirmationIsChecked() {

        driver.findElement(By.cssSelector("label[for=sign_up_25")).click();

        driver.findElement(By.cssSelector("label[for=sign_up_26")).click();

        System.out.println("Account confirmation i checked");

    }

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

    @Then("An account is created")
    public void anAccountIsCreated() {

        System.out.println("Account is created");

    }

    @When("User fails to fill in all member details")
    public void userFailsToFillInAllMemberDetails() {

        WebElement search = driver.findElement(By.id("dp"));
        search.sendKeys("12/02/1980");

        driver.findElement(By.id("member_firstname")).sendKeys("Robert");

        WebElement A = driver.findElement(By.id("member_lastname"));
        String text = A.getAttribute("value");
        if (text.isEmpty()) {

            System.out.println("'Last Name' must be entered");

        }

    }

    @Then("An account is NOT created")
    public void anAccountIsNOTCreated() {

        System.out.println("'Last Name' must be entered");

    }

    @When("Code of ethics and conduct NOT are checked")
    public void codeOfEthicsAndConductNOTAreChecked() {

    }

    @When("User sets password mismatch")
    public void userSetsPasswordMismatch() {
    }

    @When("User is on the registration page")
    public void userIsOnTheRegistrationPage() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Basketball England Members Area", "Title is not matching");

    }

    @And("User enter {string} and {string}")
    public void enterUserAnd(String firstName, String lastName) {

        driver.findElement(By.id("member_firstname")).sendKeys(firstName);
        driver.findElement(By.id("member_lastname")).sendKeys(lastName);
    }

    @And("User enter email {string} and {string}")
    public void userEnterEmailAnd(String Email, String confirmEmail) {

        driver.findElement(By.id("member_firstname")).sendKeys(Email);
        driver.findElement(By.id("member_firstname")).sendKeys(confirmEmail);

    }

    @And("User fill in {string}")
    public void userFillIn(String Mobilephone) {

        driver.findElement(By.id("signup_memberdetails_mobilephone")).sendKeys("+46702064151");

    }

    @And("User selects {string}")
    public void userSelects(String female, String male) {

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
    public void userEnterEmergencyContactDetailsAndAnd(String fullname, String relationship, String arg2, String phonenumber) {

        driver.findElement(By.id("signup_nextofkin_name")).sendKeys("Anna Lucas");

        driver.findElement(By.id("signup_nextofkin_relationship")).sendKeys("Wife");

        driver.findElement(By.id("signup_nextofkin_contact")).sendKeys("+46768778384");

        System.out.println("All emergency contact details are filled in");

    }

    @And("User fills in address {string} and {string} and {string} and {string} and {string}")
    public void userFillsInAddressAndAndAndAnd(String addressline1, String towncity, String postcode, String country, String country2) {

        driver.findElement(By.id("txtAddressLine1")).sendKeys("31 The Square, Tarland, Aberdeenshire Scotland");

        driver.findElement(By.id("txtAddressTownCity")).sendKeys("Aberchirder");

        driver.findElement(By.id("txtPostCode")).sendKeys("AB34 4TX");

        Select dropDown = new Select(driver.findElement(By.id("ddlCounty")));
        dropDown.selectByIndex(1);

        dropDown = new Select(driver.findElement(By.name("CountryId")));
        dropDown.selectByIndex(211);

        System.out.println("Address is filled in");

    }

    @And("User sets {string} and {string}")
    public void userSetsAnd(String password, String retypepassword) {

        driver.findElement(By.id("sign_up_9")).sendKeys("EttEnkeltLösenord");

        driver.findElement(By.id("sign_up_10")).sendKeys("EttEnkeltLösenord");

        System.out.println("Password is set");

    }

    @And("User fills in all anonymous information {string} and {string} and {string}")
    public void userFillsInAllAnonymousInformationAndAnd(String sexualorientation, String religion) {

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

    @Given("User has the correct {string}")
    public void userHasTheCorrect(String url) {

            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://membership.basketballengland.co.uk/NewFullAccount");
            driver.get(url);
            driver.get("https://membership.basketballengland.co.uk/NewFullAccount");
            driver.get("https://membership.basketballengland.co.uk/NewFullAccount");

            System.out.println("Correct url is entered");
        }

    }


    class Registrator {

        private string result;


        public string getResult() {
            return result;
        }

        private class string {
        }


    /*@Given("User is using {string} as {string}")
    public void userIsUsingAs(String edge, String chrome) {

            {
                if (browser.equals(("edge"))) {
                    driver = new EdgeDriver();
                } else if (browser.equals("chrome")) {
                    driver = new ChromeDriver();
                }

                driver.get("https://membership.basketballengland.co.uk/NewFullAccount");

            }*/


    }






