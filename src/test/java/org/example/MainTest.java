package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    Main validator;
    String expectedValid = "Your password is valid";
    String expectedInvalid = "Your password is invalid";

    @Test
    void validate_shouldReturnTrue_forValidPassword() {
        validator = new Main("ValidPass1");
        assertEquals(expectedValid, validator.validate());
    }

    @Test
    void validate_shouldReturnFalse_forShortPassword() {
        validator = new Main("Short1");
        assertEquals(expectedInvalid, validator.validate());
    }

    @Test
    void validate_shouldReturnFalse_forNoUppercase() {
        validator = new Main("lowercase1");
        assertEquals(expectedInvalid, validator.validate());
    }

    @Test
    void validate_shouldReturnFalse_forNoLowercase() {
        validator = new Main("UPPERCASE1");
        assertEquals(expectedInvalid, validator.validate());
    }

    @Test
    void validate_shouldReturnFalse_forNoDigit() {
        validator = new Main("NoDigits!");
        assertEquals(expectedInvalid, validator.validate());
    }

    @Test
    void validate_shouldReturnFalse_forCommonPassword() {
        validator = new Main("Password1");
        assertEquals(expectedInvalid, validator.validate());
    }

    @Test
    void generatePassword() {
        validator = new Main("");
        assertEquals("Not implemented yet", validator.generatePassword());
    }
}

