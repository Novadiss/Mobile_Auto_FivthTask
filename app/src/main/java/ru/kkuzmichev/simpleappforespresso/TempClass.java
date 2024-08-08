package ru.kkuzmichev.simpleappforespresso;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(AndroidJUnit4.class)
public class TempClass {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testName() {
        ViewInteraction mainText = onView(
                withId(R.id.test_home)
        );
        mainText.check(
                matches(
                        withText("This is home fragment")
                )
        );
    }
}
