import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class ProductPage extends BaseTest{

    @Step("Checking product page by <key>")  //Kategoriler sayfasının açıldığı kontrol edilir.
    public void productPageControl(String key) {
        Boolean Display = appiumDriver.findElement(By.id(key)).isDisplayed();
        logger.info("Product page is displayed.");
    }

    @Step("<id> button has been clicked.") //Favorilere ekle butonuna tıklanır.
    public void clickFav(String id2) {
        appiumDriver.findElement(By.id(id2)).click();
        logger.info("Add to favourites button is clicked.");
    }

    @Step("<idBasket> add to basket has been clicked.") //Sepete ekle butonuna tıklanır.
    public void clickBasket(String idBasket){
        appiumDriver.findElement(By.id(idBasket)).click();
        logger.info("Add to basket button is clicked.");
    }


}
