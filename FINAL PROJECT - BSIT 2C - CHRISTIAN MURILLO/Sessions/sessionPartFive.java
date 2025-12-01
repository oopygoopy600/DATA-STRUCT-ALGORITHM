import java.util.Scanner;

public class sessionPartFive {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int problemNo = 41;

        while (problemNo != 0) {
            System.out.println("Enter a Problem No (41-56): ");
            problemNo = sc.nextInt();

            if (problemNo >= 41 && problemNo <= 56){
                switch (problemNo) {

                    case 41:
                        System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE CIRCLE PROGRAM");
                        System.out.println("Enter width: ");
                        float width = sc.nextFloat();
                        System.out.println("Enter Height: ");
                        float height = sc.nextFloat();
                        sessionNo5Functions.problemNo41(height, width);
                        break;

                    case 42: 
                        System.out.println("Input FIVE DIGIT: ");
                        int digit = sc.nextInt();
                        sessionNo5Functions.problemNo42(digit);
                        break;

                    case 43:
                        sessionNo5Functions.problemNo43(sc);
                        break;

                    case 44:
                        System.out.println("Enter Taxable income: ");
                        double income = sc.nextDouble();
                        sessionNo5Functions.problemNo44(income);
                        break;

                    case 45:
                        System.out.println("Input digit: ");
                        long convertDigit = sc.nextLong();
                        sc.nextLine(); // consume leftover newline
                        System.out.println(sessionNo5Functions.problemNo45(convertDigit));
                        break;
                    case 46:
                        sessionNo5Functions.problemNo46(sc);
                        break;

                    case 47:
                        System.out.println("Enter a positive integer N: ");
                        int n = sc.nextInt();
                        sessionNo5Functions.problemNo47(n);
                        break;

                    case 48:
                        sessionNo5Functions.problemNo48(sc); 
                        break;

                    case 49:
                        sessionNo5Functions.problemNo49(sc);
                        break;

                    case 50:
                        sessionNo5Functions.problemNo50(sc);
                        break;
                    case 51:
                        sessionNo5Functions.problemNo51(sc);
                        break;
                    case 52:
                        sessionNo5Functions.problemNo52(sc);
                        break;
                    case 53:
                        sessionNo5Functions.problemNo53(sc);
                        break;
                    case 54:
                        System.out.println("Base: ");
                        int base = sc.nextInt();
                        System.out.println("Exponent: ");
                        int exponent = sc.nextInt();
                        System.out.println("Result: "+sessionNo5Functions.problemNo54(base,exponent));
                    case 55:
                        System.out.println("Enter a number: ");
                        int num =Math.abs(sc.nextInt());
                        if(num < 1 || num > 99){
                            System.out.println("Please enter a 1- or 2-digit number.");
                        }
                        else {
                            sessionNo5Functions.problemNo55(num);
                        }
                    default:
                        break;
                }
            }
            else {
                System.out.println("41-56 ONLY!!!!");
            }
        }

        sc.close();
    }
}
