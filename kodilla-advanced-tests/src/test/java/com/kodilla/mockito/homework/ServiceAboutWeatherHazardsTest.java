package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

    class ServiceAboutWeatherHazardsTest{
        ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
        Client client = mock(Client.class);
        Notification notification = mock(Notification.class);
        @Test
        public void addLocation() {
            serviceAboutWeatherHazards.addLocation("Warszawa",client);
            verify(client);
        }

        @Test
         public void oneClientOneLocationSendNotification() {
             Client client1 = mock(Client.class);
             serviceAboutWeatherHazards.addLocation("Warszawa", client1);

             serviceAboutWeatherHazards.sendNotification(notification);
             verify(client1, times(1)).getReceive(notification);
         }
        @Test
        public void oneClientTreeLocationSendNotification() {
            Client client1 = mock(Client.class);
            serviceAboutWeatherHazards.addLocation("Warszawa", client1);
            serviceAboutWeatherHazards.addLocation("Kraków", client1);
            serviceAboutWeatherHazards.addLocation("Poznań", client1);

            serviceAboutWeatherHazards.sendNotification(notification);
            verify(client1, times(3)).getReceive(notification);
        }

   @Test
    void treeClientsOneLocationSendNotification() {
        Client client1 = mock(Client.class);
        Client client2 = mock(Client.class);
        Client client3 = mock(Client.class);
        serviceAboutWeatherHazards.addLocation("Warszawa",client1);
        serviceAboutWeatherHazards.addLocation("Warszawa",client2);
        serviceAboutWeatherHazards.addLocation("Warszawa",client3);

        serviceAboutWeatherHazards.sendNotification(notification);
        verify(client1, times(1)).getReceive(notification);
        verify(client2, times(1)).getReceive(notification);
        verify(client3, times(1)).getReceive(notification);
    }

        @Test
        void removeOneSubscriberLocation() {
            serviceAboutWeatherHazards.addLocation("Warszawa",client);
            serviceAboutWeatherHazards.removeOneSubscriberLocation("Warszawa");

            serviceAboutWeatherHazards.sendNotification(notification);
            verify(client, never()).getReceive(notification);
        }

        @Test
        void treeClientOneLocationRemoveAllSubscriberLocation() {
            Client client1 = mock(Client.class);
            Client client2 = mock(Client.class);
            Client client3 = mock(Client.class);
            serviceAboutWeatherHazards.addLocation("Warszawa",client1);
            serviceAboutWeatherHazards.addLocation("Warszawa",client2);
            serviceAboutWeatherHazards.addLocation("Warszawa",client3);
            serviceAboutWeatherHazards.removeAllSubscriberLocation("Warszawa",client1);
            serviceAboutWeatherHazards.removeAllSubscriberLocation("Warszawa",client2);
            serviceAboutWeatherHazards.removeAllSubscriberLocation("Warszawa",client3);

            serviceAboutWeatherHazards.sendNotification(notification);
            verify(client1, never()).getReceive(notification);
            verify(client2, never()).getReceive(notification);
            verify(client3, never()).getReceive(notification);
        }
        @Test
        public void oneClientTreeLocationRemoveAllSubscriberLocation() {
            Client client1 = mock(Client.class);
            serviceAboutWeatherHazards.addLocation("Warszawa", client1);
            serviceAboutWeatherHazards.addLocation("Kraków", client1);
            serviceAboutWeatherHazards.addLocation("Poznań", client1);
            serviceAboutWeatherHazards.removeAllSubscriberLocation("Warszawa",client1);
            serviceAboutWeatherHazards.removeAllSubscriberLocation("Kraków",client1);
            serviceAboutWeatherHazards.removeAllSubscriberLocation("Poznań",client1);;

            serviceAboutWeatherHazards.sendNotification(notification);
            verify(client1, never()).getReceive(notification);
        }

    }