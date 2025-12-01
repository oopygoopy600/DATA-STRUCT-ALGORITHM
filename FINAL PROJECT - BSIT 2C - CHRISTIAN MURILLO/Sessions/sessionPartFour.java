import java.util.Scanner;
public class sessionPartFour {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int problemNo = 31;

        while (problemNo != 0) {
            System.out.println();
            System.out.println();
            System.out.println("Enter a problemNo : ");
            int no = sc.nextInt();
            if (no >= 31 && no <= 40) {
                switch (no) {
                    case 31:
                        sessionNo4Functions.problemNo31(sc);
                        break;
                    case 32:
                        sessionNo4Functions.problemNo32(sc);
                        break;
                    case 33:
                        sessionNo4Functions.problemNo33(sc);
                        break;
                    case 34:
                        sessionNo4Functions.problemNo34(sc);
                        break;
                    case 35:
                        sessionNo4Functions.problemNo35(sc);
                        break;
                    case 36:
                        System.out.println("Enter a Number: ");
                        int n = sc.nextInt();
                        sessionNo4Functions.problemNo36(n);
                        break;
                    case 37:
                        System.out.println("Number System Decimal to Binary: ");
                        int num = sc.nextInt();
                        sessionNo4Functions.problemNo37(num);
                        break;
                    case 38:
                        System.out.println("Enter a year: ");
                        int year = sc.nextInt();
                        sessionNo4Functions.problemNo38(year);
                        break;
                    case 39:
                        System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE CIRCLE PROGRAM");
                        System.out.println();
                        System.out.println("Input radius: ");
                        float radius = sc.nextFloat();
                        sessionNo4Functions.getAreaNo39(radius);
                        break;
                    case 40:
                        System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE CIRCLE PROGRAM");
                        System.out.println("Input side : ");
                        float side = sc.nextFloat();
                        sessionNo4Functions.getAreaNo40(side);
                        break;
                    default:
                        break;
                }
            }
            else {
                System.out.println("MUST BE 31 TO 40 ONLY!");
            }
        }
        sc.close();
    }
    
}
