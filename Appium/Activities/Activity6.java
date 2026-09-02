package examples;

import static java.time.Duration.ofMillis;
import java.time.Duration;
import java.util.Arrays;

public class ActionsBase {
	// Set the point type
	private final PointerInput finger = new PointerInput(Kind.TOUCH, "finger");

	// Create the swipe gesture
	public void doSwipe(AppiumDriver driver, int duration, Point start, Point end) {
		// Create the sequence of actions
		Sequence swipe = new Sequence(finger, 1);
		swipe.addAction(finger.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()));
		swipe.addAction(finger.createPointerDown(MouseButton.LEFT.asArg())); // 0 = Left click
		swipe.addAction(finger.createPointerMove(ofMillis(duration), viewport(), end.getX(), end.getY()));
		swipe.addAction(finger.createPointerUp(MouseButton.LEFT.asArg())); // 0 = Left click

		// Perform the swipe
		driver.perform(Arrays.asList(swipe));
	}
}