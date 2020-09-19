        package com.kodilla.mockito.homework;

        import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


        class ServiceAboutWeatherHazardsTest{

        @Test
        public void addClients() {
            ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
            Client client = Mockito.mock(Client.class);
            serviceAboutWeatherHazards.addLocation("Warszawa");
            serviceAboutWeatherHazards.addClients("Warszawa", client);
            Alert alert = Mockito.mock(Alert.class);

            serviceAboutWeatherHazards.sendingSubscription("Warszawa",alert);
            Mockito.verify(client,Mockito.times(1)).sendAlert(alert);

        }
        @Test
            public void oneClientSendNotification(){
            ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
            Client client = Mockito.mock(Client.class);
            Notification notification = Mockito.mock(Notification.class);
            serviceAboutWeatherHazards.addingToListOfNotificationsReceivingFromTheWebsite(client);

            serviceAboutWeatherHazards.sendingNotification(notification);
            Mockito.verify(client, Mockito.times(1)).sendNotification(notification);

        }
        @Test
            public void oneClientTwoLocationSendAlert(){
            ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
            Client client = Mockito.mock(Client.class);
            serviceAboutWeatherHazards.addLocation("Warszawa");
            serviceAboutWeatherHazards.addLocation("Kraków");
            serviceAboutWeatherHazards.addClients("Kraków", client);
            serviceAboutWeatherHazards.addClients("Warszawa", client);
            Alert alert = Mockito.mock(Alert.class);

            serviceAboutWeatherHazards.sendingSubscription("Kraków",alert);
            serviceAboutWeatherHazards.sendingSubscription("Warszawa",alert);
            Mockito.verify(client, Mockito.times(2)).sendAlert(alert);
        }
            @Test
            public void twoClientOneLocationSendAlert() {
                ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
                Client clientFirst = Mockito.mock(Client.class);
                Client clientSecond = Mockito.mock(Client.class);
                serviceAboutWeatherHazards.addLocation("Warszawa");
                serviceAboutWeatherHazards.addClients("Warszawa", clientFirst);
                serviceAboutWeatherHazards.addClients("Warszawa", clientSecond);
                Alert alert = Mockito.mock(Alert.class);


                serviceAboutWeatherHazards.sendingSubscription("Warszawa", alert);
                Mockito.verify(clientFirst, Mockito.times(1)).sendAlert(alert);
                Mockito.verify(clientSecond, Mockito.times(1)).sendAlert(alert);
            }
           @Test
            public void removalLocation(){
                ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
                serviceAboutWeatherHazards.addLocation("Warszawa");
                Client client = Mockito.mock(Client.class);
                Alert alert = Mockito.mock(Alert.class);

                serviceAboutWeatherHazards.locationRemoval("Warszawa");
                serviceAboutWeatherHazards.sendingSubscription("Warszawa",alert);
                Mockito.verify(client, Mockito.never()).sendAlert(alert);



            }

                @Test
                public void oneClientTwoLocationSubscriptionWithdrawalAll(){
                    ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
                    Client client = Mockito.mock(Client.class);
                    Alert alert = Mockito.mock(Alert.class);
                    serviceAboutWeatherHazards.addLocation("Warszawa");
                    serviceAboutWeatherHazards.addLocation("Kraków");
                    serviceAboutWeatherHazards.addClients("Kraków", client);
                    serviceAboutWeatherHazards.addClients("Warszawa", client);

                    serviceAboutWeatherHazards.withdrawalAllSubscriptions(client);
                    serviceAboutWeatherHazards.sendingSubscription("Kraków",alert);
                    serviceAboutWeatherHazards.sendingSubscription("Warszawa",alert);
                    Mockito.verify(client, Mockito.never()).sendAlert(alert);
                }
            @Test
            public void TwoClientOneLocationSubscriptionWithdrawal(){
                ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
                Client clientFirst = Mockito.mock(Client.class);
                Client clientSecond = Mockito.mock(Client.class);
                Alert alert = Mockito.mock(Alert.class);
                serviceAboutWeatherHazards.addLocation("Warszawa");
                serviceAboutWeatherHazards.addClients("Warszawa", clientFirst);
                serviceAboutWeatherHazards.addClients("Warszawa", clientSecond);


                serviceAboutWeatherHazards.withdrawalubscription("Warszawa", clientFirst);
                serviceAboutWeatherHazards.withdrawalubscription("Warszawa", clientSecond);
                serviceAboutWeatherHazards.sendingSubscription("Warszawa", alert);
                Mockito.verify(clientFirst, Mockito.never()).sendAlert(alert);
                Mockito.verify(clientSecond, Mockito.never()).sendAlert(alert);
            }

            @Test
            public void notificationsWithdrawal(){
                ServiceAboutWeatherHazards serviceAboutWeatherHazards = new ServiceAboutWeatherHazards();
                Client client = Mockito.mock(Client.class);
                Notification notification = Mockito.mock(Notification.class);
                serviceAboutWeatherHazards.addingToListOfNotificationsReceivingFromTheWebsite(client);

                serviceAboutWeatherHazards.withdrawalNotification(client);
                serviceAboutWeatherHazards.sendingNotification(notification);
                Mockito.verify(client, Mockito.never()).sendNotification(notification);

            }


        }