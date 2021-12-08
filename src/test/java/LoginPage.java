import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest{

    @Step("Checking login page by <key>") //Giriş sayfasının açıldığı kontrol edilir.
    public void loginpageControl(String key) {
        Boolean Display = appiumDriver.findElement(By.id(key)).isDisplayed();
        logger.info("Login page is displayed.");
    }

    @Step("<keymail> email address has been sent to <emailfield> field.") //Email alanına email adresi gönderilir.
    public void sendMail(String keymail, String emailfield){
        appiumDriver.findElement(By.id(emailfield)).sendKeys(keymail);
        logger.info("Email address is sent to email field.");
    }

    @Step("<keypassw> password has been sent to <passwfield> field.") //Şifre alanına şifre gönderilir.
    public void sendPassw(String keypassw, String passwfield){
        appiumDriver.findElement(By.id(passwfield)).sendKeys(keypassw);
        logger.info("Password is sent to password field.");
    }

    @Step("<id3> backbutton has been clicked successfully.") //Geriye gelme butonuna tıklanır.
    public void clickBack(String id3) {
        appiumDriver.findElement(By.id(id3)).click();
        logger.info("Back button is clicked.");
    }


}
