package io.getarrays.server.enumeration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StatusTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Status#valueOf(String)}
     *   <li>{@link Status#getStatus()}
     * </ul>
     */
    @Test
    void testValueOf() {
        assertEquals("SERVER_UP", Status.valueOf("SERVER_UP").getStatus());
    }
}

