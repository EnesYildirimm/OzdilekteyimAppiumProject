import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CategoriesPage extends BaseTest{

    @Step("<key> categories button has been clicked.") //Kategoriler sayfası açılır.
    public void clickCategoriesBtn(String key) {
        appiumDriver.findElement(By.id(key)).click();
        logger.info("Categories button is clicked.");
    }

    @Step("Checking categories page by <key>")  //Kategoriler sayfasının açıldığı kontrol edilir.
    public void categoriesPageControl(String key) {
        Boolean Display = appiumDriver.findElement(By.id(key)).isDisplayed();
        logger.info("Categories page is displayed.");
    }

    @Step("<xpath> option has been clicked.") //Kadın seçeneği tıklanır.
    public void clickWomanOpt(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
        logger.info("Woman category is clicked.");
    }

    @Step("<xpath> category has been clicked.") //Pantolon kategorisi seçilir.
    public void clickTrousers(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
        logger.info("Trousers category is clicked.");
    }

    @Step("Checking random pick page by controlling <key1>") //Rastgele seçilen ürünün sayfasında olduğu kontrol edilir.
    public void pdpageControl(String key1) {
        Boolean Display = appiumDriver.findElement(By.id(key1)).isDisplayed();
        logger.info("Product page is displayed.");
    }

    @Step("<xph> size of the product has been picked.") //Ürünün beden seçim işlemi yapılır.
    public void pickSize(String xph){
        appiumDriver.findElement(By.xpath(xph)).click();
        logger.info("Size of the product is picked.");
    }


}
