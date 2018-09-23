package com.udacity.gradle.builditbigger;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

import android.support.test.rule.ActivityTestRule;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UITest {
    @Rule
    public ActivityTestRule<MainActivity> menuActivityTestRule =
            new ActivityTestRule<>(MainActivity.class, true, true);

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void asyncTask_retrievesString() {


        onView(withId(R.id.recipe_list))
                .perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));

        onView(withId(R.id.rv_ingredients)).check(matches(not(withText(""))));

    }
}