package Tests;

import Base.BaseTest;
import CityNames.DepartureCityNames;
import CityNames.DestinationCityNames;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class DepartureAndDestinationCityNamesTest extends BaseTest {
    //object Created for DepartureCityNames
    DepartureCityNames depNames = new DepartureCityNames();

    //Object Created for DestinationCityNames
    DestinationCityNames desNames = new DestinationCityNames();


    @Test(priority = 2)
    public void departureCityNames()
    {
        depNames.departureCityNames();
    }

    @Test(priority = 3)
    public void destinationCityNames()
    {
        desNames.destinationCityNames();
    }


}
