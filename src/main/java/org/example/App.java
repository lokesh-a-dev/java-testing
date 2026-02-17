package org.example;

import java.net.InetAddress;
import java.time.LocalDateTime;

public class App {

    public static String getHostname() throws Exception {
        return InetAddress.getLocalHost().getHostName();
    }

    public static String getIPAddress() throws Exception {
        return InetAddress.getLocalHost().getHostAddress();
    }

    public static String getCurrentTime() {
        return LocalDateTime.now().toString();
    }

    public static void main(String[] args) {

        System.out.println("Application Started");

        try {
            System.out.println("Host: " + getHostname());
            System.out.println("IP: " + getIPAddress());
            System.out.println("Time: " + getCurrentTime());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Application Finished");
    }
}
