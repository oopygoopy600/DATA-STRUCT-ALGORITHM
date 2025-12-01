import java.util.Scanner;

public class Methods {

    public static int push (int[] stack, int peek, int size, Scanner sc) {
        if (peek == -1) {
            System.out.println();
            System.out.println("Stack overflow");
        }
        else {
            System.out.println();
            System.out.println("Push value: ");
            int value = sc.nextInt();
            peek++;
            stack[peek] = value;
            System.out.println("------ "+value+" is pushed.-----");
        }
        return peek;
    }
    public static int pop (int[] stack, int peek){
        if (peek == -1) {
            System.out.println();
            System.out.println("Stack underflow");
        }
        else {
            System.out.println();
            System.out.println("-----"+stack[peek]+" is popped.-----");
            peek--;
        }
        return peek;
    }
    public static void peek(int[] stack, int peek) {
        if (peek == -1) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("\t----- [" + stack[peek] + "] is peek. -----");
        }
    }
    public static void display (int[] stack, int peek){
        if(peek == -1){
            System.out.println();
            System.out.println("Stack is empty.");
        }
        else{
            System.out.println();
            System.out.println("-----[");
            for(int i = 0; i < peek; i++){
                System.out.print(stack[peek]+", ");
            }
            System.out.println("]-----");
        }
    }
}