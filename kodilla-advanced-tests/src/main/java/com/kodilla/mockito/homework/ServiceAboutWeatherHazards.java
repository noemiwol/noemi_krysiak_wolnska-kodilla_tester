package com.kodilla.mockito.homework;

import java.util.*;

public class ServiceAboutWeatherHazards {
   /* Map<String, Client> clients = new HashMap<>();

    public void addLocation(String location, Client client){
        this.clients.put(location,client);
    }

    public void sendNotification(Notification notification){
        this.clients.forEach((s, client) -> client.sendAlert(notification));
    }
    public void removeOneSubscriberLocation(String location){
        this.clients.remove(location);
    }
    public void removeAllSubscriberLocation(String location,Client client){
        this.clients.remove(location,client);
    }*/

    Map<String, ArrayList<Client>> clients = new HashMap<>();
    Set<Client> subscriber = new HashSet<>();

    public void addLocation(String location) {
        this.clients.put(location, new ArrayList<>());
    }
    public void addClients(String location, Client client){
        this.clients.get(location).add(client);
    }
    public  void locationRemoval(String location){
        this.clients.remove(location);
    }

    public void addingToListOfNotificationsReceivingFromTheWebsite(Client client) {
        this.subscriber.add(client);

    }

    public void sendingNotification(Notification notification) {
        this.subscriber.forEach(client -> client.sendNotification(notification));
    }

    public void sendingSubscription(String location, Alert alert) {
        if (this.clients.containsKey(location)){
            this.clients.get(location).forEach(value -> value.sendAlert(alert));
        }
    }

    public void withdrawalAllSubscriptions(Client client) {
        this.clients.forEach((location, clients)->clients.removeIf(client1 -> client1.equals(client)));
        this.subscriber.removeIf(client1 -> client1.equals(client));
    }
    public void withdrawalubscription(String location, Client client) {
        this.clients.get(location).removeIf(client1 -> client1.equals(client));

    }

    public void withdrawalNotification(Client client) {
        this.subscriber.removeIf(client1 -> client1.equals(client));

    }


}
