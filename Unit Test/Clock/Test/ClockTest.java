import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ClockTest {

    private void checkClock(Clock clock, int hour, int minute, int second) {
        assertEquals(hour, clock.getHour());
        assertEquals(minute, clock.getMinute());
        assertEquals(second, clock.getSecond());
    }

    @Test
    public void lowConstructorParameters() {
        Clock clock = new Clock(0, 0, 0);
        checkClock(clock, 0, 0, 0);
    }

    @Test
    public void highConstructorParameters() {
        Clock clock = new Clock(23, 59, 59);
        checkClock(clock, 23, 59, 59);
    }

    @Test
    public void middleConstructorParameters() {
        //error detected
        Clock clock = new Clock(11, 27, 41);
        checkClock(clock, 11, 27, 41);
    }

    @Test()
    public void illeargumentExceptionOnHour() {
        //error detected
        assertThrows(IllegalArgumentException.class, () -> new Clock(24, 0, 0));
    }

    @Test()
    public void illeargumentExceptionOnMinute() {
        assertThrows(IllegalArgumentException.class, () -> new Clock(0, 60, 0));
    }

    @Test()
    public void illeargumentExceptionOnSecond() {
        assertThrows(IllegalArgumentException.class, () -> new Clock(0, 0, 60));
    }

    @Test()
    public void setSecondsTurnsToMinutes() {
        Clock clock = new Clock(65);
        //error detected, see also middleConstructorParameters
        checkClock(clock, 0, 1, 5);
    }

    @Test()
    public void setSecondsTurnsMinutesToHours() {
        Clock clock = new Clock(2 * 3600 + 10 * 60 + 15);
        checkClock(clock, 2, 10, 15);
        //error detected, see also middleConstructorParameters
    }

    @Test()
    public void ticUpdatesSecond() {
        Clock clock = new Clock(13, 12, 58);
        clock.tic();
        checkClock(clock, 13, 12, 59);
    }

    @Test()
    public void ticUpdatesMinute() {
        Clock clock = new Clock(13, 12, 59);
        clock.tic();
        checkClock(clock, 13, 13, 0);
    }

    @Test()
    public void ticUpdatesHour() {
        Clock clock = new Clock(13, 59, 59);
        clock.tic();
        checkClock(clock, 14, 0, 0);
    }

    @Test()
    public void ticChangesDay() {
        Clock clock = new Clock(23, 59, 59);
        clock.tic();
        //error detected
        checkClock(clock, 0, 0, 0);
    }
}
