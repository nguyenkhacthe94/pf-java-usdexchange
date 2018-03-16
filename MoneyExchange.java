import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args){
        int rate = 23;

        Scanner scanner = new Scanner(System.in);

        float usd;
        System.out.println("Amount of USD to exchange:");
        usd = scanner.nextFloat();

        float vnd = usd*rate;
        System.out.println("Exchange rate USD/VND now is: "+rate+ " thousand VND");
        System.out.println("Amount of VND is:" +vnd +" thousand VND");
    }
}
