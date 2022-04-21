package com.ic.uitest.ui.movie

import android.os.Bundle
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.ic.uitest.R
import com.ic.uitest.data.DummyMovies.INFINITY_WAR
import junit.framework.TestCase
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class DirectorsFragmentTest : TestCase() {

    @Test
    fun test_directorsListVisible() {
        val directors = arrayListOf("Anthony Russo", "Joe Russo")
        val fragmentFactory = FragmentFactory()
        val bundle = Bundle()
        bundle.putStringArrayList("args_directors",directors);

        val scenario = launchFragmentInContainer<DirectorsFragment>(
            factory = fragmentFactory,
            fragmentArgs = bundle
        )

        onView(withId(R.id.directors_text)).check(matches(withText(DirectorsFragment.stringBuilderForDirectors(directors))))
    }
}