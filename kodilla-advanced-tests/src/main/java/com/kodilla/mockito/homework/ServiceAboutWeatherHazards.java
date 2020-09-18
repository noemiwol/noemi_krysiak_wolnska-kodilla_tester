package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.Map;

public class ServiceAboutWeatherHazards {
    Map<String, Client> clients = new HashMap<>();

    public void addLocation(String location, Client client){
        this.clients.put(location,client);
    }

    public void sendNotification(Notification notification){
        this.clients.forEach((s, client) -> client.getReceive(notification));
    }
    public void removeOneSubscriberLocation(String location){
        this.clients.remove(location);
    }
    public void removeAllSubscriberLocation(String location,Client client){
        this.clients.remove(location,client);
    }

}
