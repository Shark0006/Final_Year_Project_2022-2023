package io.getarrays.server.model;

import java.time.LocalDateTime;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class ResponseTest {
    /**
     * Method under test: {@link Response#canEqual(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCanEqual() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot read field "timeStamp" because "x0" is null
        //       at io.getarrays.server.model.Response$ResponseBuilder.access$000(Response.java:20)
        //       at io.getarrays.server.model.Response.<init>(Response.java:20)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Response(null)).canEqual("Other");
    }

    /**
     * Method under test: {@link Response#canEqual(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCanEqual2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot read field "timeStamp" because "x0" is null
        //       at io.getarrays.server.model.Response$ResponseBuilder.access$000(Response.java:20)
        //       at io.getarrays.server.model.Response.<init>(Response.java:20)
        //   See https://diff.blue/R013 to resolve this issue.

        Response response = new Response(null);
        response.canEqual(new Response(null));
    }

    /**
     * Method under test: {@link Response#Response(Response.ResponseBuilder)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot read field "timeStamp" because "x0" is null
        //       at io.getarrays.server.model.Response$ResponseBuilder.access$000(Response.java:20)
        //       at io.getarrays.server.model.Response.<init>(Response.java:20)
        //   See https://diff.blue/R013 to resolve this issue.

        new Response(null);
    }

    /**
     * Method under test: {@link Response#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new Response(null)).equals(null);
    }

    /**
     * Method under test: {@link Response#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new Response(null)).equals("Different type to Response");
    }

    /**
     * Method under test: {@link Response#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals3() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new Response(null)).equals(new Response(null));
    }

    /**
     * Method under test: {@link Response#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot read field "timeStamp" because "x0" is null
        //       at io.getarrays.server.model.Response$ResponseBuilder.access$000(Response.java:20)
        //       at io.getarrays.server.model.Response.<init>(Response.java:20)
        //   See https://diff.blue/R013 to resolve this issue.

        Response response = new Response(null);
        response.equals(new Response(null));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Response#setData(Map)}
     *   <li>{@link Response#setDeveloperMessage(String)}
     *   <li>{@link Response#setMessage(String)}
     *   <li>{@link Response#setReason(String)}
     *   <li>{@link Response#setStatus(HttpStatus)}
     *   <li>{@link Response#setStatusCode(int)}
     *   <li>{@link Response#setTimeStamp(LocalDateTime)}
     *   <li>{@link Response#getData()}
     *   <li>{@link Response#getDeveloperMessage()}
     *   <li>{@link Response#getMessage()}
     *   <li>{@link Response#getReason()}
     *   <li>{@link Response#getStatus()}
     *   <li>{@link Response#getStatusCode()}
     *   <li>{@link Response#getTimeStamp()}
     *   <li>{@link Response#toString()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetData() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   io.getarrays.server.model.Response.<init>. A step in the arrange section threw
        //   java.lang.NullPointerException: Cannot read field "timeStamp" because "x0" is null
        //       at io.getarrays.server.model.Response$ResponseBuilder.access$000(Response.java:20)
        //       at io.getarrays.server.model.Response.<init>(Response.java:20)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Response response = null;
        Map<?, ?> data = null;

        // Act
        response.setData(data);
        String developerMessage = "";
        response.setDeveloperMessage(developerMessage);
        String message = "";
        response.setMessage(message);
        String reason = "";
        response.setReason(reason);
        HttpStatus status = HttpStatus.CONTINUE;
        response.setStatus(status);
        int statusCode = 0;
        response.setStatusCode(statusCode);
        LocalDateTime timeStamp = null;
        response.setTimeStamp(timeStamp);
        Map<?, ?> actualData = response.getData();
        String actualDeveloperMessage = response.getDeveloperMessage();
        String actualMessage = response.getMessage();
        String actualReason = response.getReason();
        HttpStatus actualStatus = response.getStatus();
        int actualStatusCode = response.getStatusCode();
        LocalDateTime actualTimeStamp = response.getTimeStamp();
        String actualToStringResult = response.toString();

        // Assert
        // TODO: Add assertions on result
    }
}

