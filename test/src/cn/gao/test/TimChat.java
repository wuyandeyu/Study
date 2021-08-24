package cn.gao.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;

public class TimChat {

    private AndroidDriver driver;
    private TouchAction touchAction;


    @Before
    public void setUp() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9");
        desiredCapabilities.setCapability("deviceName", "MIX_2S");
        desiredCapabilities.setCapability("app", "D:\\Program Files\\android-sdk\\test\\timZS.apk");
        desiredCapabilities.setCapability("appPackage", "com.tencent.tim");
        desiredCapabilities.setCapability("appActivity", "com.tencent.mobileqq.activity.SplashActivity");
        desiredCapabilities.setCapability("noReset", true);
        desiredCapabilities.setCapability("unicodeKeyboard", true);
        desiredCapabilities.setCapability("resetKeyboard", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        touchAction= new TouchAction(driver);
    }

    @Test
    public void sampleTest() throws InterruptedException, AWTException {
        Thread.sleep(2000);
        /*MobileElement el1 = (MobileElement) driver.findElementById("com.tencent.tim:id/n_o");
        el1.click();*/
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("请输入QQ号码或手机或邮箱");
        el2.click();
        el2.clear();
        el2.sendKeys("1756153836");
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("密码 安全");
        el3.click();
        el3.clear();
        el3.sendKeys("0325gaoyu");
        MobileElement el4 = (MobileElement) driver.findElementById("com.tencent.tim:id/login");
        el4.click();
        Thread.sleep(6000);
        MobileElement el5 = (MobileElement) driver.findElementById("com.tencent.tim:id/kag");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.tencent.tim:id/et_search_keyword");
        el6.click();
        el6.sendKeys("囚己");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.AbsListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout");
        el7.click();

        MobileElement el8 = (MobileElement) driver.findElementById("com.tencent.tim:id/inputBar");
        el8.clear();
        el8.sendKeys("test0");

        driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));

       /* MobileElement el9 = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button");
        el9.click();*/

       /* int[][] keyboardArr = { { 909,2044 }, { 1047,2121 } };
        this.clickElement_OverScreen(driver, keyboardArr);*/


        MobileElement el12 = (MobileElement) driver.findElementById("com.tencent.tim:id/e89");
        el12.click();
        MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TabHost/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TabWidget/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.View");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementById("com.tencent.tim:id/nap");
        el15.click();
        MobileElement el16 = (MobileElement) driver.findElementById("com.tencent.tim:id/account_switch");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByAccessibilityId("退出当前帐号按钮");
        el17.click();
        MobileElement el18 = (MobileElement) driver.findElementById("com.tencent.tim:id/dialogRightBtn");
        el18.click();
    }

    @After
    public void tearDown() {
      //  driver.quit();
    }


    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9");
        desiredCapabilities.setCapability("deviceName", "923QEDUK22434");
        desiredCapabilities.setCapability("appPackage", "com.leke.lekechat");
        desiredCapabilities.setCapability("appActivity", "com.leke.lekechat.ui.SplashFirstActivity");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("noReset", "True");
        return desiredCapabilities;
    }
    public  AndroidDriver getDriver() {
         final String APPIUM_SERVER_REMOTE = "http://localhost:4723/wd/hub";
        DesiredCapabilities desiredCapabilities =this.getCapabilities();
        URL remoteUrl = null;
        try {
            remoteUrl = new URL(APPIUM_SERVER_REMOTE);
            driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

    public int formatNumber(int P_1,int P_2,int P_3) {
        float dd=(float)P_1/(float)P_2;
        DecimalFormat df = new DecimalFormat("0.00000000");//格式化小数，不足的补0
        String rat = df.format((double)dd);
        float ff=Float.parseFloat(rat);
        int formatNum =(int) (ff*P_3);
        return  formatNum;
    }

    /**
     * 其他方式实施点击事件
     * @param driver
     * @param arr
     */
    public void clickElement_OverScreen( AndroidDriver driver,int [ ][ ] arr) {
        TouchAction ta = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        int P_base_X=arr[0][0];   //元素基准位置坐标
        int P_base_y=arr[0][1];
        int P_base_Screen_X=arr[1][0];//元素所在页的屏幕基准尺寸
        int P_base_Screen_Y=arr[1][1];
        int point_X=this.formatNumber(P_base_X, P_base_Screen_X, width);
        int point_Y=this.formatNumber(P_base_y, P_base_Screen_Y, height);
        System.out.println(point_X);
        System.out.println(point_Y);
        PointOption point_Concat=PointOption.point(point_X,point_Y);
        //ta.press(point_Concat).release().perform();
        //touchAction.press(PointOption.point(996,2067)).release().perform();
        // touchAction.tap(PointOption.point(996,2067)).release().perform();
        ta.tap(point_Concat).release().perform();
    }

}


