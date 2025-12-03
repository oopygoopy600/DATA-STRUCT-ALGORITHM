import java.util.Scanner;

public class Methods {

    public static int push (int[] stack, int peek, int size, Scanner sc) {
        if (peek == size - 1) {
            System.out.println("\t\t[-!-!-!-!- Stack OVERFLOW -!-!-!-!-!-]");
        }
        else {
            System.out.println("Push value:");
            int value = sc.nextInt();
            peek++;
            stack[peek] = value;
            System.out.println("\t\t[----- " + value + " is pushed.-----]");
        }
        return peek;
    }
    public static int pop (int[] stack, int peek){
        if (peek == -1) {
            System.out.println("\t\t[-!-!-!-!- Stack UNDERFLOW -!-!-!-!-!-]");
        }
        else {
            System.out.println();
            System.out.println("\t\t[-----" + stack[peek] + " is popped.-----]");
            peek--;
        }
        return peek;
    }
    public static void peek(int[] stack, int peek) {
        if (peek == -1) {
            System.out.println("\t\t[-!-!-!-!- Stack is EMPTY -!-!-!-!-!-]");
        } else {
            System.out.println("\t\t----- [" + stack[peek] + "] is peek. -----]");
        }
    }
    public static void display (int[] stack, int peek){
        if(peek == -1){
            System.out.println("\t\t[-!-!-!-!- Stack is EMPTY -!-!-!-!-!-]");
        }
        else{
            System.out.println();
            System.out.print("\t\t-----FIRST[ ");
            for(int i = 0; i <= peek; i++){
                System.out.print(stack[i]+", ");
            }
            System.out.print(" ]LAST-----");
        }
    }
    public static void search(int [] stack, int peek, Scanner sc){
        if (peek == -1) {
            System.out.println("\t\t[-!-!-!-!- Stack is EMPTY -!-!-!-!-!-]");
        }
        else{
            System.out.println("Search stack:");
            int search = sc.nextInt();
            for(int i = 0; i <= peek; i++){
                if (stack[i] == search) {
                    System.out.println("\t\t-----[ " + search + " ]-----==> "+i);
                }
            }
        }
    }
}