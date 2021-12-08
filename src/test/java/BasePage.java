import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.PointOption.point;

public class BasePage extends BaseTest {

    @Step("Waited <time> seconds.")
    public void waitingTime(int time) throws InterruptedException {
        TimeUnit.SECONDS.sleep(time);
    }

    @Step("Swipe down to end the page.") //Sayfanın en aşağısına doğru scroll edilir.
    public void swipeDown() {
        int startX = 535;
        int startY = 1961;
        int endX = 542;
        int endY = 379;
        (new TouchAction(appiumDriver))
                .press(point(startX, startY))
                .moveTo(point(endX, endY))
                .release()
                .perform();
        logger.info("Page is swiped down.");
    }

    @Step("Randomly pick a product.") //Rastgele ürün seçme işlemi yapılır.
    public void pickProductRandomly() throws InterruptedException {
        List<String> randomProductlist =new LinkedList<String>();
        Thread.sleep(2000);
        for(int i=0;i<4;i++){
            randomProductlist.add("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[\"+(i+1)+\"]/android.view.ViewGroup/android.widget.ImageView");
        }

        Random random = new Random();
        int r = random.nextInt(4);
        appiumDriver.findElement(By.xpath(randomProductlist.get(r))).click();
        logger.info("A product is picked randomly.");
    }

}
