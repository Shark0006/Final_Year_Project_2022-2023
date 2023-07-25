package io.getarrays.server;

import io.getarrays.server.repo.ServerRepo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.CommandLineRunner;

class ServerApplicationTest {
    /**
     * Method under test: {@link ServerApplication#run(ServerRepo)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRun() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        ServerApplication serverApplication = null;
        ServerRepo serverRepo = null;

        // Act
        CommandLineRunner actualRunResult = serverApplication.run(serverRepo);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link ServerApplication#corsFilter()}
     */
    @Test
    void testCorsFilter() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new ServerApplication()).corsFilter();
    }
}

