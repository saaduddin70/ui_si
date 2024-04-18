package com.example.myapplication;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testButtonClick_Red() {
        // Click the button1
        Espresso.onView(ViewMatchers.withId(R.id.button1)).perform(ViewActions.click());

        // Check if the text view displays "One"
        Espresso.onView(ViewMatchers.withId(R.id.textView2))
                .check(ViewAssertions.matches(ViewMatchers.withText("one")));
    }

    // Click the button1
    @Test
    public void testButtonClick_Red1() {
        // Click the button1
        Espresso.onView(ViewMatchers.withId(R.id.button2)).perform(ViewActions.click());

        // Check if the text view displays "One"
        Espresso.onView(ViewMatchers.withId(R.id.textView2))
                .check(ViewAssertions.matches(ViewMatchers.withText("two")));
    }
}
