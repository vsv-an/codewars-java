package kyu8;

import static org.junit.Assert.*;
import org.junit.Test;

public class L1SetAlarmTest {
    L1SetAlarm Alarm = new L1SetAlarm();
    @Test
    public void setAlarmTest() {
        assertTrue("Should be true.", Alarm.setAlarm(true, false));
        assertFalse("Should be false.", Alarm.setAlarm(true, true));
        assertFalse("Should be false.", Alarm.setAlarm(false, false));
        assertFalse("Should be false.", Alarm.setAlarm(false, true));
    }
}
