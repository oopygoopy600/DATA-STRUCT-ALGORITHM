import java.util.Scanner;
import java.util.Random;

public class sessionPartThree {

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
        if (problemNo >= 21 && problemNo <=29) {
            switch (problemNo) {
            case 21:
                sessionNo3Functions.problemNo21(sc);
                break;
            case 22:
                sessionNo3Functions.problemNo22(sc);
                break;
            case 23:
                sessionNo3Functions.problemNo23(sc);
                break;
            case 24:
                sessionNo3Functions.problemNo24(sc);
                break;
            case 25:
                sessionNo3Functions.problemNo25(rand, sc);
                break;
            case 26:
                sessionNo3Functions.problemNo26(sc);
                break;
            case 27:
                sessionNo3Functions.problemNo27(sc);
                break;
            case 28:
                sessionNo3Functions.problemNo28(sc);
                break;
            case 29:
                sessionNo3Functions.problemNo29(sc);
                break;
            default:
                break;
            }
        }
            else{
                System.out.println("21-29 ONLY");
            }
        }
        sc.nextLine();
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        
        
        String longestWord = findLongestWord(sentence);
        

        System.out.println("The longest word is \"" + longestWord + "\" with " + longestWord.length() + " letters.");
        sc.close();
    }
    public static String findLongestWord(String sentence) {
       
        String[] words = sentence.split(" ");
        
   
        String longestWord = "";
     
        for (String word : words) {
            
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
   
        return longestWord;
    }
    }

