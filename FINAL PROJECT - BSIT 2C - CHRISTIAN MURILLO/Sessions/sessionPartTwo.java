import java.util.Scanner;
public class sessionPartTwo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        studentName();
    //PROBLEM 11 
        int x;
        int y;
        System.out.println("Enter X value: ");
        x = sc.nextInt();
        System.out.println("Enter Y value: ");
        y = sc.nextInt();

        if (x >= 0 && y >= 0){
            System.out.println("QUADRANT I - "+x+","+y);
        }
        else if(x<0 && y >= 0){
            System.out.println("QUADRANT II - "+x+","+y);
        }
        else if (x<0 && y<0){
            System.out.println("QUADRANT III - "+x+","+y);
        }
        else{
            System.out.println("QUADRANT IV - "+x+","+y);
        }
        System.out.println("");
    //PROBLEM 12
        while(true){
        System.out.println("Input Numbers:");
        System.out.println("x: ");
        double num1 = sc.nextDouble();
        System.out.println("y: ");
        double num2 = sc.nextDouble();

        if(num2 == 0){
            System.out.println("Division is not possible");
        }
        else{
            double quotient = num1 / num2;
            System.out.printf("Expected Output: %.2f",quotient);
            break;
        }
        }
        System.out.println("");
    //PROBLEM 13
        int count = 1;
        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=3; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        }
    //PROBLEM 14
        double grade = 0;
        double student = 0;
        System.out.println("Input Mathematics marks (0 to terminate):");
        while(true) {
            double score = sc.nextDouble();
            if (score <= 0) {
                break;
            }
            grade+=score;
            student++;
        }
        double average = grade / student;
            System.out.printf("Average marks in Mathematics is: %.2f\n",average);
    //PROBLEM 15
        getSmallestArray(sc);
    
    //PROBLEM16
        getInches(sc);
        System.out.println("");
    //PROBLEM17
        getReverse(sc);

    //PROBLEM18
        System.out.println("Input a Value(negative): ");
        int number = sc.nextInt();

        int posiviteValue = removeNegative(number);

        System.out.println("Original Value: "+number);
        System.out.println("Absolute Value: "+ posiviteValue);
    //PROBLEM19
        System.out.println("Input the first Integer: ");
        int first = sc.nextInt();

        System.out.println("Input the second Integer: ");
        int second = sc.nextInt();

        if(first % second == 0){
            System.out.println(first+" is a multipile of "+second+".");
        }
        else{
            System.out.println("Not a multiple");
        }
    //PROBLEM20
        System.out.println("Input some text:");
        String text = sc.nextLine();
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    //
    System.out.println("YOU COMPLETED THE PART 2 SESSION");
    sc.close();
    }
    public static void studentName(){
        System.out.println("CHRISTIAN");
    }
    public static void getSmallestArray(Scanner sc){

        System.out.println("Input length of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Input arrays elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int position = 0;

        for (int i = 1; i < n; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
                position = i;
            }
        }
        System.out.println("Smallest: "+ smallest);
        System.out.println("Index: "+(position+1));
    }
    public static void getInches(Scanner sc){
        System.out.println("Input Data: ");
        double centimeter = sc.nextDouble();

        double inches = centimeter / 2.54;

        System.out.printf("Distance of %.2f cms is = %.2f",centimeter,inches);
    }
    public static void getReverse(Scanner sc){
        System.out.println("Input the Numbers: ");
        int num = sc.nextInt();

        int reversed = 0;
        int original = num; 

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
            System.out.println("The original Numbers is: "+ original);
            System.out.println("The Reversed Number is: "+reversed);
    }
    public static int removeNegative(int num){
        return Math.abs(num);
    }
}
