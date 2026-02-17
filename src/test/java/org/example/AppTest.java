package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testHostnameNotNull() throws Exception {

        String hostname = App.getHostname();

        assertNotNull(hostname);

        assertFalse(hostname.isEmpty());

        System.out.println("Hostname: " + hostname);

    }

    @Test
    void testIPAddressNotNull() throws Exception {

        String ip = App.getIPAddress();

        assertNotNull(ip);

        assertFalse(ip.isEmpty());

        System.out.println("IP: " + ip);

    }

    @Test
    void testCurrentTimeNotNull() {

        String time = App.getCurrentTime();

        assertNotNull(time);

        assertFalse(time.isEmpty());

        System.out.println("Time: " + time);

    }

}
