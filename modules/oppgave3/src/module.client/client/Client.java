package client;

import api.Service;

public class Client {
    public static void main(String... args) {
        Service.getInstances().forEach(e -> {
            System.out.println(e.getName());
        });

    }
}