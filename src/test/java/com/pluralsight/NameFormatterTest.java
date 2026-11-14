package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameFormatterTest {

    @Test
    void format_should_putLastNameFirst_forFirstAndLastName() {
        String expected = "Johnson, Mel";

        String actual = NameFormatter.format("Mel", "Johnson");

        assertEquals(expected, actual);
    }
}
