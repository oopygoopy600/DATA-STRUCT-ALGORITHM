import java.util.Scanner;
public class stack {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("\t\t\tWELCOME TO STACK SYSTEM.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
        int size;

        System.out.print("Enter size of stack: ");
        size = sc.nextInt();

        System.out.println();

        int[] stack = new int[size];
        int peek = -1; //TOP VALUE OF YOUR STACK.

        boolean status = true;

        System.out.println("---------------------------------------------------------------------");
        System.out.println();

        while (status) {
            System.out.println();
            System.out.println("[1] Push.");
            System.out.println("[2] Pop.");
            System.out.println("[3] Peek.");
            System.out.println("[4] Display.");
            System.out.println("[5] Search.");
            System.out.println("[6] Exit.");
            System.out.print("Choose an Option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    peek = Methods.push(stack, peek, size, sc);
                    break;
                case 2:
                    peek = Methods.pop(stack, peek);
                    break;
                case 3:
                    Methods.peek(stack, peek);
                    break;
                case 4:
                    Methods.display(stack, peek);
                    break;
                case 5: 
                    Methods.search(stack, peek, sc);
                    break;
                case 6:
                    status = false;    
                default:
                    break;
            }
        }
            System.out.println("\t\t\tEXITING STACK SYSTEM.");
            System.out.println("\t---------------------------------------------------------");
        sc.close();
    }
}
