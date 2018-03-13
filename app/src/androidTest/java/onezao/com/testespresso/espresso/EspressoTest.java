package onezao.com.testespresso.espresso;

import android.support.test.espresso.assertion.ViewAssertions;

import onezao.com.testespresso.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by XYL-SJ005 on 2018/3/9.
 */

public class EspressoTest {
    public static void espressoTest() {
        onView(withText("cool")).check(ViewAssertions.matches(isDisplayed()));
        onView(withText("Say hello!")).perform(click());
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.btn_test_btn2)).perform(click());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.btn_second_show)).perform(click());

        onView(withText("TestEspresso")).check(ViewAssertions.matches(isDisplayed()));
    }
}
