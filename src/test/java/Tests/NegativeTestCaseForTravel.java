package Tests;

import Base.BaseTest;
import Pages.FindFlightPageObject;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class NegativeTestCaseForTravel extends BaseTest {

    //Creating Objects for FindFlightPageObject Class
    FindFlightPageObject flight;

    @Test(priority = 5)
    public void FindFlightsTest() throws IOException {


        flight = new FindFlightPageObject(driver);

        //clicking Paris As a Departure City Name
        flight.selectDepCity();

        //clicking Buenos as a Destination City Name
        flight.selectDesCity();

        //Click on Find Flight button
        flight.clickOnFindFlight();

        //clicking on ChooseThis Flight
        driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();

        //Passenger Name Input
        flight.clickOnPassengerName();
        //Passenger Address Input
        flight.clickOnAddress();
        //Passenger City Input
        flight.clickOnCity();
        //Passenger State Input
        flight.clickOnState();
        //Passenger Zip Code Input
        flight.clickOnZipCode();
        //Passenger Credit Card Number Input
        flight.clickOnCreditCard();
        //Passenger Credit Card Month Input
        flight.clickOnCardMonth();
        //Passenger Credit Card Year Input
        flight.clickOnCardYear();
        //Passenger Credit Card Holder Name Input
        flight.clickOnCardHolderName();
        //Click on Purchase Button
        flight.clickOnPurchaseFlight();


        //Assertion for Matching Title
        {
            //Expected Title For Assertion
            String ExpectedTitle = "BlazeDemo Confirmatio";
            String ActualTitle = driver.getTitle();
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            System.out.println("The Title Of the Home Page is same as Expected : " + ActualTitle);


        }




    }

}
