package com.kodilla.testing2.facebook;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES_WAIT_FOR = "//div[contains(@class, \"_4-i2 _pig _al5h _al7j _50f4\")]";
    public static final String XPATH_COOKIES_SELECT = "//div[contains(@class, \"_al64\")]/button[2]";
    public static final String XPATH_NEW_ACCOUNT_WAIT_FOR = "//div[contains(@class, \"_6luv _52jv\")]";
    public static final String XPATH_NEW_ACCOUNT_SELECT = "//a[contains(@class, \"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\")]";
    public static final String XPATH_SUBMIT_WAIT_FOR = "//div[contains(@class, \"_5k_5\")]";
    public static final String XPATH_SUBMIT_SELECT_MONTH = "//select[contains(@name, \"birthday_month\")]";
    public static final String XPATH_SUBMIT_SELECT_DAY = "//select[contains(@name, \"birthday_day\")]";
    public static final String XPATH_SUBMIT_SELECT_YEAR = "//select[contains(@name, \"birthday_year\")]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");
        while (!driver.findElement(By.xpath(XPATH_COOKIES_WAIT_FOR)).isDisplayed());
        WebElement cookiesSelect = driver.findElement(By.xpath(XPATH_COOKIES_SELECT));
        cookiesSelect.click();
        while (!driver.findElement(By.xpath(XPATH_NEW_ACCOUNT_WAIT_FOR)).isDisplayed());
        WebElement accountSelect = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT_SELECT));
        accountSelect.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_SUBMIT_WAIT_FOR)));
        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SUBMIT_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByValue("2");
        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SUBMIT_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByValue("4");
        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SUBMIT_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByValue("1999");
    }
}
