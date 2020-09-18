package com.kodilla.mockito.homework;

public class ServiceAboutWeatherHazardsTest1 {
  /*  ServiceAboutWeatherHazards1 serviceAboutWeatherHazards1 = new ServiceAboutWeatherHazards1();
    ArrayList<Client1> client = (ArrayList<Client1>) mock(Client1.class);
    Notification1 notification1 = mock(Notification1.class);

    @Test
    public void addLocation() {
        serviceAboutWeatherHazards1.addLocation("Warszawa",client);
        verify(client);
    }

    @Test
    public void oneClientOneLocationSendNotification() {
        ArrayList<Client1> client1 = (ArrayList<Client1>) mock(Client1.class);
        serviceAboutWeatherHazards1.addLocation("Warszawa", client1);

        serviceAboutWeatherHazards1.sendNotification(notification1);
        verify(client1, times(1)).getReceive(notification1);
    }
    @Test
    public void oneClientTreeLocationSendNotification() {
        ArrayList<Client1> client1 = (ArrayList<Client1>) mock(Client1.class);
        serviceAboutWeatherHazards1.addLocation("Warszawa", (ArrayList<Client1>)client1);
        serviceAboutWeatherHazards1.addLocation("Kraków", (ArrayList<Client1>)client1);
        serviceAboutWeatherHazards1.addLocation("Poznań", (ArrayList<Client1>)client1);

        serviceAboutWeatherHazards1.sendNotification(notification1);
        verify(client1, times(3)).getReceive(notification1);
    }

    @Test
    void treeClientsOneLocationSendNotification() {
        ArrayList<Client1> client1 = (ArrayList<Client1>) mock(Client1.class);
        client1.add(client1 = mock(Client1.class));
        client1.add(client1 = mock(Client1.class));
        client1.add(client1 = mock(Client1.class));
        serviceAboutWeatherHazards1.addLocation("Warszawa",(ArrayList<Client1>)client1);
        serviceAboutWeatherHazards1.addLocation("Warszawa",(ArrayList<Client1>)client2);
        serviceAboutWeatherHazards1.addLocation("Warszawa",(ArrayList<Client1>)client3);

        serviceAboutWeatherHazards1.sendNotification(notification1);
        verify(client1, times(1)).getReceive(notification1);
        verify(client2, times(1)).getReceive(notification1);
        verify(client3, times(1)).getReceive(notification1);
    }

    @Test
    void removeOneSubscriberLocation() {
        serviceAboutWeatherHazards1.addLocation("Warszawa",(ArrayList<Client1>)client);
        serviceAboutWeatherHazards1.removeOneSubscriberLocation("Warszawa");

        serviceAboutWeatherHazards1.sendNotification(notification1);
        verify(client, never()).getReceive(notification1);
    }

    @Test
    void treeClientOneLocationRemoveAllSubscriberLocation() {
        Client1 client1 = mock(Client1.class);
        Client1 client2 = mock(Client1.class);
        Client1 client3 = mock(Client1.class);
        serviceAboutWeatherHazards1.addLocation("Warszawa",(ArrayList<Client1>)client1);
        serviceAboutWeatherHazards1.addLocation("Warszawa",(ArrayList<Client1>)client2);
        serviceAboutWeatherHazards1.addLocation("Warszawa",(ArrayList<Client1>)client3);
        serviceAboutWeatherHazards1.removeAllSubscriberLocation("Warszawa",(ArrayList<Client1>)client1);
        serviceAboutWeatherHazards1.removeAllSubscriberLocation("Warszawa",(ArrayList<Client1>)client2);
        serviceAboutWeatherHazards1.removeAllSubscriberLocation("Warszawa",(ArrayList<Client1>)client3);

        serviceAboutWeatherHazards1.sendNotification(notification1);
        verify(client1, never()).getReceive(notification1);
        verify(client2, never()).getReceive(notification1);
        verify(client3, never()).getReceive(notification1);
    }
    @Test
    public void oneClientTreeLocationRemoveAllSubscriberLocation() {
        Client1 client1 = mock(Client1.class);
        serviceAboutWeatherHazards1.addLocation("Warszawa", (ArrayList<Client1>) client1);
        serviceAboutWeatherHazards1.addLocation("Kraków", (ArrayList<Client1>)client1);
        serviceAboutWeatherHazards1.addLocation("Poznań", (ArrayList<Client1>)client1);
        serviceAboutWeatherHazards1.removeAllSubscriberLocation("Warszawa",(ArrayList<Client1>)client1);
        serviceAboutWeatherHazards1.removeAllSubscriberLocation("Kraków",(ArrayList<Client1>)client1);
        serviceAboutWeatherHazards1.removeAllSubscriberLocation("Poznań",(ArrayList<Client1>)client1);;

        serviceAboutWeatherHazards1.sendNotification(notification1);
        verify(client1, never()).getReceive(notification1);
    }*/
}
