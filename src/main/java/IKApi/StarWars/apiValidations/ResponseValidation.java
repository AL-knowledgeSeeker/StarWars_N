package IKApi.StarWars.apiValidations;

import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import IKApi.StarWars.utils.ExtentReportListener;
import io.restassured.response.Response;

public class ResponseValidation extends ExtentReportListener{

	
	public static void responseCodeValidation(Response response, int statusCode) {

        try {
            Assert.assertEquals(statusCode, response.getStatusCode());
            test.log(LogStatus.PASS,
                    "Status code successfully validated, status code is :: " + response.getStatusCode());
        } catch (AssertionError e) {
            test.log(LogStatus.FAIL, e.fillInStackTrace());
            test.log(LogStatus.FAIL,
                    "Expected status code is :: " + statusCode + " , instead getting :: " + response.getStatusCode());
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e.fillInStackTrace());
        }
    }

}
