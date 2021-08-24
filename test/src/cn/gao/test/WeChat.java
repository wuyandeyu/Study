package cn.gao.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class WeChat {

    private AndroidDriver driver;
    private  DesiredCapabilities desiredCapabilities;
    private AppiumDriver appiumDriver;


    @Before
    public void setUp() throws MalformedURLException {
        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9");
        desiredCapabilities.setCapability("deviceName", "MIX_2S");
        desiredCapabilities.setCapability("app", "D:\\Program Files\\android-sdk\\test\\WeCom_android_3.1.11.17124_100038.apk");
        desiredCapabilities.setCapability("appPackage", "com.tencent.wework");
        desiredCapabilities.setCapability("appActivity", "com.tencent.wework.launch.LaunchSplashActivity");
        desiredCapabilities.setCapability("noReset", true);
        desiredCapabilities.setCapability("unicodeKeyboard", true);
        desiredCapabilities.setCapability("resetKeyboard", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() throws MalformedURLException {
      /*  MobileElement el1 = (MobileElement) driver.findElementById("com.tencent.wework:id/it6");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.tencent.wework:id/hd5");
        el2.click();
        el2.sendKeys("’≈√Œ∫≠");



*/

        MobileElement el5 = (MobileElement) driver.findElementById("com.tencent.wework:id/it6");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.tencent.wework:id/hd5");
        el6.sendKeys("∏ﬂ”Ó");
        MobileElement el7 = (MobileElement) driver.findElementById("com.tencent.wework:id/isl");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout[1]");
        el8.click();
        //MobileElement el9 = (MobileElement) driver.findElementById("com.tencent.wework:id/bnk");
        //el9.click();

        desiredCapabilities.setCapability("chromedriverExecutableDir", "C:\\Program Files\\Google\\Chrome\\Application");
        appiumDriver= new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        Set<String> contextNames = appiumDriver.getContextHandles();
        for (String contextName : contextNames) {
            //prints out something like NATIVE_APP \n WEBVIEW_1
            System.out.println(contextName);
        }
       // appiumDriver.context((String)(contextNames.toArray()[1]));

        WebDriver native_app = appiumDriver.context("NATIVE_APP");




      /*  (new TouchAction(driver)).tap(PointOption.point(192, 368)).release().perform();
        MobileElement el3 = (MobileElement) driver.findElementById("com.tencent.wework:id/bnk");
        el3.clear();
        el3.sendKeys("’≈√Œ∫≠");
        MobileElement el4 = (MobileElement) driver.findElementById("com.tencent.wework:id/f5v");
        el4.click();*/
    }

    @After
    public void tearDown() {

        //driver.quit();
    }



}
