import java.util.Scanner;

public class sessionNo4Functions {
    public static void problemNo31 (Scanner sc){

        System.out.println("Input the number of elements to be stored in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Element: "+i);
            arr[i] = sc.nextInt();
        }
        
        int min = arr[0];
        int max = arr[0];
        
        for(int num : arr){
            if(num > max){
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimun: "+ min);
        System.out.println("Maximum: "+ max);
    }
    public static void problemNo32(Scanner sc){

        int[] arr = new int[100];
        int[] even = new int[100];
        int[] odd = new int[100];

        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Input the number of elements to be stored in the array :");
        int n = sc.nextInt();

        System.out.println("Inpute elements to be stored in a array: ");
        for(int i = 0; i<n; i++){
            System.out.println("Element- "+ i + " : ");
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                even[evenCount++] = arr[i];
            }
            else {
                odd[oddCount++] = arr[i];
            }
        }
        System.out.println("Even Elements are: ");
        for (int i = 0; i < evenCount; i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();
        System.out.println("Odd Elements are: ");
        for (int i = 0; i < oddCount; i++){
            System.out.print(odd[i]+" ");
        }
    }
    public static void problemNo33(Scanner sc){

        System.out.println("Input the size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter a elements sort to the array: ");
        for(int i = 0; i < n; i++){
            System.out.print("Element "+i+" -: ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) { 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elements of array in sorted ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void problemNo34 (Scanner sc){
        System.out.print("Input the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Input " + size + " elements in the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Elements of the array in sorted descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void problemNo35(Scanner sc){
        System.out.print("Input the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        
        System.out.println("Input " + size + " elements in the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }

    
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The Second largest element in the array is : " + secondLargest);
    }
    public static int problemNo36 (int n){
        if (n % 2 == 0){
            System.out.println("The enter number is even");
        }
        else {
            System.out.println("The enter number is odd");
        }
        return n;
    }
    public static int problemNo37 (int n){
        int original = n;
        if (n == 0) {
            System.out.println("Binary of 0 is 0");
            return n;
        }
        String binary = "";
        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }
        System.out.println("Binary of " + original + " is: " + binary);
        return n;
    }
    public static int problemNo38 (int year){
        while (true) {
            if (year >= 1000 && year <= 9000) {
                if (year % 4 == 0 && year % 400 == 0) {
                    System.out.println(year+" is a LEAP YEAR");
                    break;
                }
                else{
                    System.out.println(year+" is not a LEAP YEAR");
                    break;
                }
            }
            else {
                System.out.println("Not A valid Year");
                break;
            }  
        }
        return year;
    }
    public static float getAreaNo39 (float radius){
        double area = (float) (3.1416 * radius * radius);
        System.out.printf("The area is : %.2f\n",area);
        return radius;
    }
    public static float getAreaNo40 (float side){
        float area = side * side;
        System.out.printf("The area is %.2f\n",area);
        return side;
    }
}
