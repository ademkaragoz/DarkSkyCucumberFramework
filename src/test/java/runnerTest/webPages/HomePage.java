package runnerTest.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomePage extends ElementUtil {

    JavaScriptUtil javaScriptUtil;
    //Locator
    private By clickToday = By.xpath("//a[@data-day='0']");
    private By temperature = By.xpath("(//div[@class='temps'])[2]//span//span");
    private By minimumTemp = By.xpath("//a[@data-day='" + "0']//span[@class='minTemp']");
    private By highestTemp = By.xpath("//span[@class='high-temp-text']");
    private By maximumTemp = By.xpath("//a[@data-day='0']//span[@class='maxTemp']");

    //Actions
    public void getTemperature() {
        WebElement element = BasePage.get().findElement(clickToday);
        JavaScriptUtil.scrollIntoView(element, BasePage.get());
        WebDriverWait wait = new WebDriverWait(BasePage.get(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(clickToday));
        BasePage.get().findElement(clickToday).click();
    }

    static ArrayList < Integer > tempListInt = new ArrayList < Integer >();

    public ArrayList < Integer > getTempList() {

        WebDriverWait wait = new WebDriverWait(BasePage.get(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(temperature));
        List < WebElement > tempList = BasePage.get().findElements(temperature);
        for (int i = 0; i < tempList.size(); i++) {
            String tempText = tempList.get(i).getText().substring(0, 2);
            tempListInt.add(Integer.parseInt(tempText));
        }
        return tempListInt;
    }
    public int minTemp() {
        Collections.sort(tempListInt);
        return tempListInt.get(0);
    }
    public int maxTemp() {
        Collections.sort(tempListInt);
        return tempListInt.get(11);

    }
    public int verifyMin() {
        WebElement lowtemp = BasePage.get().findElement(minimumTemp);
        String lowTempStr = lowtemp.getText().substring(0, 2);
        return Integer.parseInt(lowTempStr);

    }
    public int verifyMax() {
        WebElement highTemp = BasePage.get().findElement(maximumTemp);
        String highTempStr = highTemp.getText().substring(0, 2);
        return Integer.parseInt(highTempStr);
    }


}