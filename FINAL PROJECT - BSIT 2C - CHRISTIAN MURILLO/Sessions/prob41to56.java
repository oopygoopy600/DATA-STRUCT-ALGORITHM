import java.util.Scanner;

public class prob41to56 {
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
                        method41to56.problemNo41(height, width);
                        break;

                    case 42: 
                        System.out.println("Input FIVE DIGIT: ");
                        int digit = sc.nextInt();
                        method41to56.problemNo42(digit);
                        break;

                    case 43:
                        method41to56.problemNo43(sc);
                        break;

                    case 44:
                        System.out.println("Enter Taxable income: ");
                        double income = sc.nextDouble();
                        method41to56.problemNo44(income);
                        break;

                    case 45:
                        System.out.println("Input digit: ");
                        long convertDigit = sc.nextLong();
                        sc.nextLine(); // consume leftover newline
                        System.out.println(method41to56.problemNo45(convertDigit));
                        break;
                    case 46:
                        method41to56.problemNo46(sc);
                        break;

                    case 47:
                        System.out.println("Enter a positive integer N: ");
                        int n = sc.nextInt();
                        method41to56.problemNo47(n);
                        break;

                    case 48:
                        method41to56.problemNo48(sc); 
                        break;

                    case 49:
                        method41to56.problemNo49(sc);
                        break;

                    case 50:
                        method41to56.problemNo50(sc);
                        break;
                    case 51:
                        method41to56.problemNo51(sc);
                        break;
                    case 52:
                        method41to56.problemNo52(sc);
                        break;
                    case 53:
                        method41to56.problemNo53(sc);
                        break;
                    case 54:
                        System.out.println("Base: ");
                        int base = sc.nextInt();
                        System.out.println("Exponent: ");
                        int exponent = sc.nextInt();
                        System.out.println("Result: "+method41to56.problemNo54(base,exponent));
                    case 55:
                        System.out.println("Enter a number: ");
                        int num =Math.abs(sc.nextInt());
                        if(num < 1 || num > 99){
                            System.out.println("Please enter a 1- or 2-digit number.");
                        }
                        else {
                            method41to56.problemNo55(num);
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
