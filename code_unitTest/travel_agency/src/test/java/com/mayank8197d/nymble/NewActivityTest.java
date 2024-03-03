package com.mayank8197d.nymble;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class NewActivityTest {
    @Test

    public void check_if_activity_added() {
        final DestinationInterface new_activity = new NewActivity();

        Destination dest = new Destination("dest");
        Activity act = new Activity(001, "act");

        new_activity.add_new_activity(act, dest);
        assertTrue(dest.get_Activities().get(0).get_code() == 001);
        assertTrue(dest.get_Activities().get(0).get_name() == "act");
    }
}