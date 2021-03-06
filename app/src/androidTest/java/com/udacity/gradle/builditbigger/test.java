package com.udacity.gradle.builditbigger;

import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.JokeActivity;
import com.udacity.gradle.builditbigger.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)

public class test {

    @Rule
    public ActivityTestRule<JokeActivity> menuActivityTestRule =
            new ActivityTestRule<>(JokeActivity.class, true, true);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        //Context appContext = InstrumentationRegistry.getTargetContext();
        //assertEquals("io.github.yhdesai.udabakingapp", appContext.getPackageName());
        onView(withId(R.id.jokebutton))
                .perform( click());

        onView(withId(R.id.jokeeViews)).check(matches(not(withText(""))));


    }


}
