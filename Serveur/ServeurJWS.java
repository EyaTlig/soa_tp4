package Serveur;

import jakarta.xml.ws.Endpoint;
import Service.CalculWS;

public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8080/CalculatriceWS";
        CalculWS s = new CalculWS();
        Endpoint.publish(url, s);
        System.out.println("Service web CalculatriceWS publié à l'adresse : " + url);
    }
}

