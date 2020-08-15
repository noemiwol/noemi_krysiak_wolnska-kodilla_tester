package Switch;
import java.util.Scanner;

public class Color2 {
    public static String getColor2() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select color (R-red, B-blac, O-orange, P-pink):");
            String color2 = scanner.nextLine().trim().toUpperCase();
            String choice2 = "You selected the wrong color. try again.";

            switch (color2) {

                case "R":
                    choice2 = "RED";
                    break;
                case "B":
                    choice2 = "BLACK";
                    break;
                case "O":
                    choice2 = "ORANGE";
                    break;
                case "P":
                    choice2 = "PINK";
                    break;
            }

            return choice2;
        }
    }
}


