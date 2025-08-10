import java.text.NumberFormat;
import java.util.Scanner;

public class EnhancedMortageCal {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int principal;
        while(true){
            System.out.print("Principal: ");
            principal = input.nextInt();
            if(principal >= 1000 &&  principal <= 1_000_000)
                break;
            System.out.println("Enter Value Between 1000 And 1_000_000");
        }

        float rate;
        while (true){
            System.out.print("Annual Interest rate: ");
            rate = input.nextFloat();
            if (rate >0 && rate <= 30) {
                rate = rate / 100 / 12;
                break;
            }
            System.out.println("Enter Value GreaterThan 0 And LessThanEqualTo 30");
        }

        byte time;
        while (true) {
            System.out.print("Periods years: ");
            time = input.nextByte();
            if (time >= 1 && time <= 30) {
                time *= 12;
                break;
            }
            System.out.println("Enter Value Between 1 And 30");
        }

        double cal = principal * (rate * Math.pow(1 + rate,time)) / (Math.pow((1 + rate),time) - 1);

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(cal));

        input.close();

    }
}