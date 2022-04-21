package com.ic.uitest

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.ic.uitest.ui.movie.DirectorsFragmentTest
import com.ic.uitest.ui.movie.MovieDetailFragmentTest
import com.ic.uitest.ui.movie.StarActorsFragmentTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MovieDetailFragmentTest::class,
    StarActorsFragmentTest::class,
    DirectorsFragmentTest::class,
    MovieNavigationTest::class
)
class MovieFragmentTestSuite {
}