package com.ic.uitest.ui.movie

import android.os.Bundle
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.ic.uitest.R
import junit.framework.TestCase
import org.junit.Test

class StarActorsFragmentTest : TestCase(){


    @Test
    fun test_starActorsListVisible() {
        val starActors = arrayListOf("Robert Downey Jr.", "Chris Hemsworth", "Mark Ruffalo", "+ more...")
        val fragmentFactory = FragmentFactory()
        val bundle = Bundle()
        bundle.putStringArrayList("args_actors",starActors);

        val scenario = launchFragmentInContainer<StarActorsFragment>(
            factory = fragmentFactory,
            fragmentArgs = bundle
        )

        Espresso.onView(ViewMatchers.withId(R.id.star_actors_text)).check(
            ViewAssertions.matches(
                ViewMatchers.withText(
                    DirectorsFragment.stringBuilderForDirectors(starActors)
                )
            )
        )
    }
}