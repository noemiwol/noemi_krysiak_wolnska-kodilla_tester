package Switch;
import java.util.Scanner;

public class Color {
    public static String getColor(){
        Scanner scanner = new Scanner(System.in);

            while (true){
                System.out.println("Select color (R-red, B-blac, O-orange, P-pink):");
                String color = scanner.nextLine().trim().toUpperCase();
                String choice = "You selected the wrong color. try again.";
                switch (color) {
                    case "R" : return "RED";
                    case "B" : return "BLACK";
                    case "O" : return "ORANGE";
                    case "P" : return "PINK";

                }
                System.out.println("You selected the wrong color. try again.");
            }
        }
    }


