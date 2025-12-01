import java.util.Scanner;
import java.util.Random;
public class sessionNo3Functions {

    public static void problemNo21 (Scanner sc) {
        System.out.println("PROBLEM NO 21.");
        double currency;

        System.out.println("Input the currency value (floating point with two decimal places):");
        currency = sc.nextDouble();
        
        int amount = (int) currency;
        double coins = currency - amount; 


        int n100 = amount / 100; //103
        amount %=100; //57

        int n50 = amount / 50; //1
        amount %=50; //7

        int n5 = amount / 5;//1
        amount %=5; //2

        int n2 = amount / 2; //1
        amount %=2; // 0

        int centavos = (int)Math.round(coins * 100);
        int c50 = centavos / 50;//1
        centavos %= 50;//25

        int c25 = centavos / 25;//1
        centavos%=25;//0

        System.out.println("100 Number of Note(s): "+n100);
        System.out.println("50 Number of Note(s): "+n50);
        System.out.println("5 Number of Note(s): "+n5);
        System.out.println("2 Number of Note(s): "+n2);
        System.out.println();
        System.out.println();
        System.out.println("Currency Coins: ");
        System.out.println(".50 Number of Coin(s): "+c50);
        System.out.println(".25 Number of Coin(s): "+c25);
        sc.nextLine();
    }
    public static void problemNo22 (Scanner sc){
        sc.nextLine();
        System.out.print("Input two angles of triangle separated by comma :");
        String angle = sc.nextLine();
        String[] angles = angle.split(",");

        int num1 = Integer.parseInt(angles[0].trim());
        int num2 = Integer.parseInt(angles[1].trim());

        int degree = 180 - (num1+num2);

        System.out.println(degree);
        sc.nextLine();
    }
    public static void problemNo23 (Scanner sc){
        char alphabet;
        System.out.println("Any Letters: ");
        alphabet = sc.next().charAt(0);
        alphabet = Character.toLowerCase(alphabet);
        if (!Character.isLetter(alphabet)) {
            System.out.println("Letters only!");
        }
        else if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
    public static void problemNo24(Scanner sc){
        String digitToString = "";
        int digit;

        System.out.println("Enter a digit:");
        digit = sc.nextInt();
        switch (digit) {
            case 1:
                digitToString = "One";
                break;
            case 2:
                digitToString = "Two";
                break;
            case 3:
                digitToString = "Three";
                break;
            case 4:
                digitToString = "Four";
                break;
            case 5:
                digitToString = "Five";
                break;
            case 6:
                digitToString = "Six";
                break;
            case 7:
                digitToString = "Seven";
                break;
            case 8:
                digitToString = "Eight";
                break;
            case 9:
                digitToString = "Nine";
                break;
            case 10:
                digitToString = "Ten";
                break;
            default:
                System.out.println("1-10 only");
                break;
        }   
            System.out.println(digitToString);
            sc.nextLine();
    }
    public static void problemNo25 (Random rand,Scanner sc){
        int randomNumber = rand.nextInt(20) + 1;
        int guess = 0;

        while (true) {
            System.out.println("Input guess Number: ");
            guess = sc.nextInt();
            if (guess == randomNumber) {
                System.out.println("Correct Guess");
                break;
            }
            else{
                System.out.println("Wrong Guess");
            }
        }
        sc.nextLine();
    }
    public static void problemNo26 (Scanner sc){
        String username= "";

        while (true) {
            System.out.println("Enter a Username(8+Characters)");
            username = sc.nextLine();
            if (username.length() != 8) {
                System.out.println("Username is too short!");
            }
            else {
                break;
            }
        }
            System.out.println("Welcome"+username);
            sc.nextLine();
    }
    public static void problemNo27 (Scanner sc){
        int num;
        System.out.println("Enter a factorial:");
        num = sc.nextInt();
        int factorial = num - 1;
        while (factorial != 0) {
            num*=factorial;
            factorial--;
        }
        System.out.println(num);
        sc.nextLine();
    }
    public static void problemNo28 (Scanner sc){
        int digit;
        int multiplication = 0;
        System.out.println("Enter a Digit to be multiply 10 times: ");
        digit = sc.nextInt();
        
        while (multiplication != 11) {
            int sum = digit * multiplication;
            System.out.println(digit+" x "+multiplication+" = "+sum);
            multiplication++;
        }
        sc.nextLine();
    }
    public static void problemNo29(Scanner sc) {
        for(int i = 1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("FIZZ");
            }
            else if(i % 5 == 0){
                System.out.println("BUZZ");
            }
            else{
                System.out.println(i);
            }
        }
    }
    public static void problemNo30(Scanner sc){
        System.out.println("Sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split("");
        int maxlength = 0;
        for(String word : words){
            if (word.length()> maxlength) {
                maxlength = word.length();
            }
        }
        System.out.println(words);
    }
}
