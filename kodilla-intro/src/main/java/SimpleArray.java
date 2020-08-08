public class SimpleArray {
    public static void main(String[] args) {

        String[] cars = new String[5];
        cars[0] = "Skoda";
        cars[1] = "Suzuki";
        cars[2] = "Opel";
        cars[3] = "Toyota";
        cars[4] = "Nissan";

        String car = cars[3];
        int numberOfElements = cars.length;

        System.out.println("Moja tablica zawiera" +" " + numberOfElements + " " + "elementów");


    }
}
