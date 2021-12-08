import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

    public class HomePage extends BaseTest{

         @Step("Checking if application is running. By checking <key> and <keyword>.") //Uygulamanın açıldığı kontrol edilir.
         public void checkShoppingPage(String key, String keyword) {
             String check = appiumDriver.findElement(By.id(key)).getText();
             Assert.assertEquals(keyword, check);
             logger.info("Ozdilekteyim application has started running successfully.");
         }

        @Step("<key> start shopping button has been clicked.") //Alışverişe başla butonuna tıklanır.
            public void clickShoppingBtn(String key) {
             appiumDriver.findElement(By.id(key)).click();
             logger.info("Start shopping button is clicked.");
        }

        @Step("Checking homepage by <key>") //Alışveriş sayfasının açıldığı kontrol edilir.
        public void homepageControl(String key) {
            Boolean Display = appiumDriver.findElement(By.id(key)).isDisplayed();
            logger.info("Start shopping page is displayed.");
        }

}
