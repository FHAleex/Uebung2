package trafficlight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;

public class SubjectTest {

    @Test
    @DisplayName("addObserver Test")
    public void addObserverTest() {
        try {
            Method m = Subject.class.getMethod("addObserver", Observer.class);
        } catch (Exception e) {
            e.printStackTrace();
            fail("addObserver function missing");
        }
    }

    @Test
    @DisplayName("removeObserver Test")
    public void removeObserverTest() {
        try {
            Method m = Subject.class.getMethod("removeObserver", Observer.class);
        } catch (Exception e) {
            e.printStackTrace();
            fail("removeObserver function missing");
        }
    }

    @Test
    @DisplayName("notifyObserver Test")
    public void notifyObserverTest() {
        try {
            Method m = Subject.class.getMethod("notifyObserver");
        } catch (Exception e) {
            e.printStackTrace();
            fail("notifyObserver function missing");
        }
    }

}
