import java.util.Scanner;
import java.util.Random;

public class prob21to30 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int problemNo = 21;

        while (problemNo != 0) {
            System.out.println();
            System.out.println();
            System.out.println("Choose a Problem no(21-30): ");
            problemNo = sc.nextInt();
            System.out.println();
        if (problemNo >= 21 && problemNo <=30) {
            switch (problemNo) {
            case 21:
                method21to30.problemNo21(sc);
                break;
            case 22:
                method21to30.problemNo22(sc);
                break;
            case 23:
                method21to30.problemNo23(sc);
                break;
            case 24:
                method21to30.problemNo24(sc);
                break;
            case 25:
                method21to30.problemNo25(rand, sc);
                break;
            case 26:
                method21to30.problemNo26(sc);
                break;
            case 27:
                method21to30.problemNo27(sc);
                break;
            case 28:
                method21to30.problemNo28(sc);
                break;
            case 29:
                method21to30.problemNo29(sc);
                break;
            case 30:
                System.out.println("Enter a sentence:");
                String sentence = sc.nextLine();
                String longestWord = method21to30.problemNo30(sentence);
                System.out.println("The longest word is \"" + longestWord + "\" with " + longestWord.length() + " letters.");
                break;
            default:
                break;
            }
        }
            else{
                System.out.println("21-30 ONLY");
            }
        }
        sc.close();
    }
    }

