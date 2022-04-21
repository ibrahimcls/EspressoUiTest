package com.ic.uitest

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import junit.framework.TestCase
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class SecondaryActivityTest : TestCase(){

    @get: Rule
    val activityRule : ActivityScenarioRule<SecondaryActivity> =ActivityScenarioRule(SecondaryActivity::class.java)


    @Test
    fun test_isActivityInView() {
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))
    }

    fun test_visibility_title_bacButton() {
        onView(withId(R.id.activity_secondary_title)).check(matches(isDisplayed()))
        onView(withId(R.id.button_back)).check(matches(isDisplayed()))
    }


    @Test
    fun test_isTitleTextDisplayed() {
        onView(withId(R.id.activity_secondary_title)).check(matches(withText(R.string.text_secondaryactivity)))
    }
}