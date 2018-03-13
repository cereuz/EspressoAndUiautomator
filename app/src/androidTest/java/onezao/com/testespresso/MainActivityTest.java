package onezao.com.testespresso;

import android.app.Instrumentation;
import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import onezao.com.testespresso.espresso.EspressoTest;
import onezao.com.testespresso.wetest.KedouNew_1221.KedouNew_main;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * Created by zneo on 2018/03/09.
 */

public class MainActivityTest {

    //UiAutomator2.0
    UiDevice device;
    Instrumentation instrumentation;
    Context context;
    @Before
    public void setUp(){
        instrumentation = getInstrumentation();
        device = UiDevice.getInstance(instrumentation);
    }

    //Espresso
    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule(MainActivity.class);

    //Espresso和UiAutomator都需要的方法
    @Test
    public void espressoAndUiAutomator() {
        //  Espresso  mixed  with  UiAutomator2.0
        EspressoTest.espressoTest();

        //Loan2.0
//       ShareLoan2_0_main.testHere(device);

        //kedouNew
        KedouNew_main.kedouNew_main_start(device);
    }
}
