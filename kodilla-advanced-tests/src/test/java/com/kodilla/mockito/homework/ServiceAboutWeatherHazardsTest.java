        package com.kodilla.mockito.homework;

        import org.junit.jupiter.api.Test;
        import org.mockito.Mockito;

        import static org.mockito.Mockito.*;

        class ServiceAboutWeatherHazardsTest{
        @Test
        public void addLocation() {
            ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
            Client client = mock(Client.class);
            Client client1 = mock(Client.class);
            serviceAboutWeatherHazards.addLocation("Warszawa", client1);
            Mockito.verify(client);
        }

        @Test
        public void oneClientTreeLocationSendNotification() {
            ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
            Notification notification = mock(Notification.class);
            Client client1 = mock(Client.class);
            serviceAboutWeatherHazards.addLocation("Warszawa", client1);
            serviceAboutWeatherHazards.addLocation("Kraków", client1);
            serviceAboutWeatherHazards.addLocation("Poznań", client1);

            serviceAboutWeatherHazards.sendNotification(notification);
            Mockito.verify(client1, times(3)).getReceive(notification);
        }


        @Test
        void removeOneSubscriberLocation() {
            ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
            Client client = mock(Client.class);
            Notification notification = mock(Notification.class);
            Client client1 = mock(Client.class);
            serviceAboutWeatherHazards.addLocation("Warszawa", client1);
            serviceAboutWeatherHazards.addLocation("Warszawa",client);
            serviceAboutWeatherHazards.removeOneSubscriberLocation("Warszawa");

            serviceAboutWeatherHazards.sendNotification(notification);
            Mockito.verify(client, never()).getReceive(notification);
        }

        @Test
        void treeClientOneLocationRemoveAllSubscriberLocation() {
            ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
            Notification notification = mock(Notification.class);
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
            Mockito.verify(client1, never()).getReceive(notification);
            Mockito.verify(client2, never()).getReceive(notification);
            Mockito.verify(client3, never()).getReceive(notification);
        }
        @Test
        public void oneClientTreeLocationRemoveAllSubscriberLocation() {
            ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
            Notification notification = mock(Notification.class);
            Client client1 = mock(Client.class);
            serviceAboutWeatherHazards.addLocation("Warszawa", client1);
            serviceAboutWeatherHazards.addLocation("Kraków", client1);
            serviceAboutWeatherHazards.addLocation("Poznań", client1);
            serviceAboutWeatherHazards.removeAllSubscriberLocation("Warszawa",client1);
            serviceAboutWeatherHazards.removeAllSubscriberLocation("Kraków",client1);
            serviceAboutWeatherHazards.removeAllSubscriberLocation("Poznań",client1);;

            serviceAboutWeatherHazards.sendNotification(notification);
            Mockito.verify(client1, never()).getReceive(notification);
        }
        }