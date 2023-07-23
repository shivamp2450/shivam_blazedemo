package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class OpenBrowserTest extends BaseTest {

    @Test(priority = 1)
    public void ValidatingHomePageTitle() throws IOException {

        //Expected Title For Assertion
        String ExpectedTitle= "BlazeDemo";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(driver.getTitle(),ExpectedTitle);
        System.out.println("The Title Of the Home Page is same as Expected : " +ActualTitle);

        }

    }



