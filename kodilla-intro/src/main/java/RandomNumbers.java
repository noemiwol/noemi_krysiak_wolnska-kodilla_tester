
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random generator = new Random();

        int max = 0;
        int min = 0;
        int sum = 0;



        while(sum <= 5000){
            int i = generator.nextInt(30);
            sum+= i;
            max = Max(i,max);
            min = Min(i,min);




        }
        System.out.println("Max"+" "+ max + " "+"Min"+" "+ min);
    }
    public static int Max(int a, int b){
        if(a < b){
            return b;
        }
        else{
            return a;
        }

    }

    public static int Min( int a, int b){
        if(a >  b){
            return b;
        }
        else{
            return a;
        }
    }

}
