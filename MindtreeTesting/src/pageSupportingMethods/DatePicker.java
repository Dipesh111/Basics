package pageSupportingMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {
	public static WebDriver driver;

	public DatePicker(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyIfObjectPresent(WebDriver driver,By selectfromdate) {
		try {
			driver.findElement(selectfromdate);
			return true;

		} catch (Exception e) {
			System.out.println("exception cought");
			return false;
		}
	}

	// (dependsOnMethods = { "verifyObjectPresent" })
	public static void selectDate(WebDriver driver, String Expected_date,
			By arg0) throws Exception {

		try {
			Thread.sleep(1000);
			@SuppressWarnings("unchecked")
			List<WebElement> dates = driver.findElements(arg0);

			for (int i = 0; i < dates.size(); i++) {
				String date = dates.get(i).getText();
				if (date.equalsIgnoreCase(Expected_date)) {
					dates.get(i).click();
					System.out.println("Given date selected");
					break;
				}
			}
		} catch (TimeoutException toe) {
			WebDriverWait mywait = new WebDriverWait(driver, 1);
			mywait.until(ExpectedConditions.elementToBeClickable(arg0));
		} catch (Exception e) {
			System.out.println("Element is not found");
			throw e;
		}
	}
}
