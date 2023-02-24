import GuestPackage.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Cindy Crawford");
    }

    @Test
    public void guestHasName() {
        assertEquals("Cindy Crawford", guest.getName());
    }
}
