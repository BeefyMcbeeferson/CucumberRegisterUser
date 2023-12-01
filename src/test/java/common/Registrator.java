package common;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;
import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class Registrator {

    @Test

    public void RegisterUser() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://membership.basketballengland.co.uk/NewFullAccount");
        Thread.sleep(1000);

        WebElement button = driver.findElement(By.id("dp"));
        button.click();
        driver.findElement(By.id("dp")).sendKeys("12/02/1980");
        Thread.sleep(1000);

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

        driver.findElement(By.id("signup_memberdetails_homephone")).sendKeys("Died in the 20's :)");
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

        driver.findElement(By.id("signup_nextofkin_name")).sendKeys("Anna Lucas");
        Thread.sleep(1000);

        driver.findElement(By.id("signup_nextofkin_relationship")).sendKeys("Wife");
        Thread.sleep(1000);

        driver.findElement(By.id("signup_nextofkin_contact")).sendKeys("+46768778384");
        Thread.sleep(1000);

        driver.findElement(By.id("txtAddressLine1")).sendKeys("31 The Square, Tarland, Aberdeenshire Scotland");
        Thread.sleep(1000);

        driver.findElement(By.id("txtAddressTownCity")).sendKeys("Aberchirder");
        Thread.sleep(1000);

        driver.findElement(By.id("txtPostCode")).sendKeys("AB34 4TX");
        Thread.sleep(1000);

        dropDown = new Select(driver.findElement(By.id("ddlCounty")));
        dropDown.selectByIndex(1);
        Thread.sleep(1000);

        dropDown = new Select(driver.findElement(By.name("CountryId")));
        dropDown.selectByIndex(211);
        Thread.sleep(1000);

        driver.findElement(By.id("sign_up_9")).sendKeys("EttEnkeltLösenord");
        Thread.sleep(1000);

        driver.findElement(By.id("sign_up_10")).sendKeys("EttEnkeltLösenord");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("label[for=sign_up_25")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("label[for=sign_up_26")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("label[for=fanmembersignup_agreetocodeofethicsandconduct")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("btnJoin")).click();

    public void add() {
            String result = toString();
    }
        Thread.sleep(1000);

        //driver.quit();


    }


    public int getResult() {
        return getResult();
    }
}
}