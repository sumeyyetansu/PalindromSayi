import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number){
        int temp = number , reverseNumber = 0, lastNumber;

        while (temp != 0){
            lastNumber = temp % 10 ;
            reverseNumber = (reverseNumber * 10) + lastNumber ;
            temp /= 10 ;
        }
        if( number == reverseNumber){
            System.out.println("Polindrom sayıdır. ");

            return true;
        }
        else {

            System.out.println("Polindrom sayı değildir. ");
            return false;

        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number = scanner.nextInt();
        isPalindrom(number);
    }
}