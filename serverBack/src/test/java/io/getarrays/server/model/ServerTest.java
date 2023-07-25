package io.getarrays.server.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.getarrays.server.enumeration.Status;
import org.junit.jupiter.api.Test;

class ServerTest {
    /**
     * Method under test: {@link Server#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new Server()).canEqual("Other"));
    }

    /**
     * Method under test: {@link Server#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertTrue(server.canEqual(server2));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Server#Server()}
     *   <li>{@link Server#setId(Long)}
     *   <li>{@link Server#setImageUrl(String)}
     *   <li>{@link Server#setIpAddress(String)}
     *   <li>{@link Server#setMemory(String)}
     *   <li>{@link Server#setName(String)}
     *   <li>{@link Server#setStatus(Status)}
     *   <li>{@link Server#setType(String)}
     *   <li>{@link Server#toString()}
     *   <li>{@link Server#getId()}
     *   <li>{@link Server#getImageUrl()}
     *   <li>{@link Server#getIpAddress()}
     *   <li>{@link Server#getMemory()}
     *   <li>{@link Server#getName()}
     *   <li>{@link Server#getStatus()}
     *   <li>{@link Server#getType()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Server actualServer = new Server();
        actualServer.setId(1L);
        actualServer.setImageUrl("https://example.org/example");
        actualServer.setIpAddress("42 Main St");
        actualServer.setMemory("Memory");
        actualServer.setName("Name");
        actualServer.setStatus(Status.SERVER_UP);
        actualServer.setType("Type");
        String actualToStringResult = actualServer.toString();
        assertEquals(1L, actualServer.getId().longValue());
        assertEquals("https://example.org/example", actualServer.getImageUrl());
        assertEquals("42 Main St", actualServer.getIpAddress());
        assertEquals("Memory", actualServer.getMemory());
        assertEquals("Name", actualServer.getName());
        assertEquals(Status.SERVER_UP, actualServer.getStatus());
        assertEquals("Type", actualServer.getType());
        assertEquals(
                "Server(id=1, ipAddress=42 Main St, name=Name, memory=Memory, type=Type, imageUrl=https://example.org/example,"
                        + " status=SERVER_UP)",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Server#Server(Long, String, String, String, String, String, Status)}
     *   <li>{@link Server#setId(Long)}
     *   <li>{@link Server#setImageUrl(String)}
     *   <li>{@link Server#setIpAddress(String)}
     *   <li>{@link Server#setMemory(String)}
     *   <li>{@link Server#setName(String)}
     *   <li>{@link Server#setStatus(Status)}
     *   <li>{@link Server#setType(String)}
     *   <li>{@link Server#toString()}
     *   <li>{@link Server#getId()}
     *   <li>{@link Server#getImageUrl()}
     *   <li>{@link Server#getIpAddress()}
     *   <li>{@link Server#getMemory()}
     *   <li>{@link Server#getName()}
     *   <li>{@link Server#getStatus()}
     *   <li>{@link Server#getType()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Server actualServer = new Server(1L, "42 Main St", "Name", "Memory", "Type", "https://example.org/example",
                Status.SERVER_UP);
        actualServer.setId(1L);
        actualServer.setImageUrl("https://example.org/example");
        actualServer.setIpAddress("42 Main St");
        actualServer.setMemory("Memory");
        actualServer.setName("Name");
        actualServer.setStatus(Status.SERVER_UP);
        actualServer.setType("Type");
        String actualToStringResult = actualServer.toString();
        assertEquals(1L, actualServer.getId().longValue());
        assertEquals("https://example.org/example", actualServer.getImageUrl());
        assertEquals("42 Main St", actualServer.getIpAddress());
        assertEquals("Memory", actualServer.getMemory());
        assertEquals("Name", actualServer.getName());
        assertEquals(Status.SERVER_UP, actualServer.getStatus());
        assertEquals("Type", actualServer.getType());
        assertEquals(
                "Server(id=1, ipAddress=42 Main St, name=Name, memory=Memory, type=Type, imageUrl=https://example.org/example,"
                        + " status=SERVER_UP)",
                actualToStringResult);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");
        assertNotEquals(server, null);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals2() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");
        assertNotEquals(server, "Different type to Server");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Server#equals(Object)}
     *   <li>{@link Server#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");
        assertEquals(server, server);
        int expectedHashCodeResult = server.hashCode();
        assertEquals(expectedHashCodeResult, server.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Server#equals(Object)}
     *   <li>{@link Server#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertEquals(server, server2);
        int expectedHashCodeResult = server.hashCode();
        assertEquals(expectedHashCodeResult, server2.hashCode());
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals5() {
        Server server = new Server();
        server.setId(2L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals6() {
        Server server = new Server();
        server.setId(null);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals7() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("42 Main St");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals8() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl(null);
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals9() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("17 High St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals10() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress(null);
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals11() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("42 Main St");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals12() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory(null);
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals13() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("42 Main St");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals14() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName(null);
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals15() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(null);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals16() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_DOWN);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals17() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("42 Main St");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Method under test: {@link Server#equals(Object)}
     */
    @Test
    void testEquals18() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType(null);

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertNotEquals(server, server2);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Server#equals(Object)}
     *   <li>{@link Server#hashCode()}
     * </ul>
     */
    @Test
    void testEquals19() {
        Server server = new Server();
        server.setId(null);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(null);
        server2.setImageUrl("https://example.org/example");
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertEquals(server, server2);
        int expectedHashCodeResult = server.hashCode();
        assertEquals(expectedHashCodeResult, server2.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Server#equals(Object)}
     *   <li>{@link Server#hashCode()}
     * </ul>
     */
    @Test
    void testEquals20() {
        Server server = new Server();
        server.setId(1L);
        server.setImageUrl(null);
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");

        Server server2 = new Server();
        server2.setId(1L);
        server2.setImageUrl(null);
        server2.setIpAddress("42 Main St");
        server2.setMemory("Memory");
        server2.setName("Name");
        server2.setStatus(Status.SERVER_UP);
        server2.setType("Type");
        assertEquals(server, server2);
        int expectedHashCodeResult = server.hashCode();
        assertEquals(expectedHashCodeResult, server2.hashCode());
    }
}

