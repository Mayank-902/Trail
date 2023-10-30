import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateTest {
    @Test
    public void testValidUser() {
        assertTrue(ValidateUser.validate("Shreyas", "Shreyas@123"));
    }

    @Test
    public void testInvalidUser() {
        assertFalse(ValidateUser.validate("wronguser", "wrongpassword"));
    }
}
