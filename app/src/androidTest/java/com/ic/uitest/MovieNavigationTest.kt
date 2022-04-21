package com.ic.uitest

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.ic.uitest.ui.movie.MainActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MovieNavigationTest {

    @Test
    fun testMovieFragmentNavigation(){
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.movie_directiors)).perform(click())
        onView(withId(R.id.fragment_movie_directors_parent)).check(matches(isDisplayed()))
        pressBack()
        onView(withId(R.id.fragment_movie_detail_parent)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_star_actors)).perform(click())
        onView(withId(R.id.fragment_star_actor_parent)).check(matches(isDisplayed()))
    }
}