package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindFlightPageObject {


    WebDriver driver;

    //Creating Constructor
    public FindFlightPageObject(WebDriver driver) {
        this.driver= driver;

        PageFactory.initElements(driver,this);
    }




    //Choose Departure City Name
    @FindBy(xpath = "//select[@name='fromPort']")
    WebElement depCityName;

    //Choose Destination City Name
    @FindBy(xpath = "//select[@name='toPort']")
    WebElement desCityName;

    //Click on Find Flight button
    @FindBy(xpath = "//body/div[3]/form[1]/div[1]/input[1]")
    WebElement findFlightBtn;


    //Select Paris As a Departure City
    public void selectDepCity()
    {
        depCityName.click();
    }

    public void selectDesCity()
    {
        desCityName.click();
    }

    public void clickOnFindFlight()
    {
        findFlightBtn.click();
    }

    //Entering Passenger Details
    //Entering name
    @FindBy(xpath = "//input[@id='inputName']")
    WebElement passengerName;

    //Entering Address
    @FindBy(xpath = "//input[@id='address']")
    WebElement passengerAddress;

    //Entering City
    @FindBy(xpath = "//input[@id='city']")
    WebElement passengerCity;

    //Entering State
    @FindBy(xpath = "//input[@id='state']")
    WebElement passengerState;

    //Entering ZipCode
    @FindBy(xpath = "//input[@id='zipCode']")
    WebElement passengerZipCode;

    //Entering CreditCardNumber
    @FindBy(xpath = "//input[@id='creditCardNumber']")
    WebElement CreditCardNumber;

    //Entering Card Month
    @FindBy(xpath = "//input[@id='creditCardMonth']")
    WebElement cardMonth;

    //Entering Card Year
    @FindBy(xpath = "//input[@id='creditCardYear']")
    WebElement cardYear;

    //Entering Card Holder Name
    @FindBy(xpath = "//input[@id='nameOnCard']")
    WebElement cardHolderName;

    //Click On Purchase Flight
    @FindBy(xpath = "//input[@value='Purchase Flight']")
    WebElement ClickOnPurchaseBtn;



    public void clickOnPassengerName()
    {
        passengerName.sendKeys("Md Masum Alam");
    }

    public void clickOnAddress()
    {
        passengerAddress.sendKeys("Kamari");
    }

    public void clickOnCreditCard()
    {
        CreditCardNumber.sendKeys("1234567890009876");
    }
    public void clickOnCity()
    {
        passengerCity.sendKeys("Krishnanagar");
    }

    public void clickOnState()
    {
        passengerZipCode.sendKeys("West Bengal");
    }

    public void clickOnCardMonth()
    {
        cardMonth.sendKeys("02");
    }

    public void clickOnCardYear()
    {
        cardYear.sendKeys("2030");
    }

    public void clickOnCardHolderName()
    {
        cardHolderName.sendKeys("Md Masum Alam");
    }

    public void clickOnPurchaseFlight()
    {
        ClickOnPurchaseBtn.click();
    }

    public void clickOnZipCode()
    {
        passengerZipCode.sendKeys("741137");
    }

}
