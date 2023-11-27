package server;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServerWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8084/",new BanqueService());
        System.out.println("web deploy");
    }
}

