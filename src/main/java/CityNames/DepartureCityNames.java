package CityNames;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DepartureCityNames extends BaseTest {
    public void departureCityNames()
    {
        //Using Custom Xpath To Store The DropDown List Values
        List<WebElement> list_Dep_Names = driver.findElements(By.xpath("//select[@name='fromPort']//option"));
        System.out.println("Number and Names of the Departure Cities are :" +list_Dep_Names.size());


        for(WebElement option:list_Dep_Names)
        {
            System.out.println(option.getText());
        }

    }
}
