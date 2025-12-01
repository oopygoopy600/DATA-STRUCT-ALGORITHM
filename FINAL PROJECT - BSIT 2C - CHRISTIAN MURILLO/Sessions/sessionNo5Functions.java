import java.util.Scanner;

public class sessionNo5Functions {
    public static float problemNo41 (float length ,float width){
        float area = length * width;
        System.out.printf("The area is %.2f\n",area);
        return area;
    }
    public static int problemNo42 (int n){
        if (n < 10000 || n > 99999) {
            System.out.println("ONLY FIVE DIGIT");
        } else {
            // Extract digits
            int digit1 = n / 10000;          // first digit
            int digit2 = (n / 1000) % 10;    // second digit
            int digit4 = (n / 10) % 10;      // fourth digit
            int digit5 = n % 10;             // fifth digit

            // Check palindrome: first == fifth, second == fourth
            if (digit1 == digit5 && digit2 == digit4) {
                System.out.println("PALINDROME");
            } else {
                System.out.println("NOT PALINDROME");
            }
        }
        return n;
    }
    public static void problemNo43(Scanner sc) {
        System.out.print("INPUT FOUR DIGIT INTEGER: ");
        int num = sc.nextInt();
        
        // Convert to string to easily access each digit
        String numStr = Integer.toString(num);
        
        // Check if it's exactly four digits
        if (numStr.length() != 4) {
            System.out.println("Please enter a four-digit number.");
            return;
        }
        
        // Output each digit with spaces
        for (int i = 0; i < numStr.length(); i++) {
            System.out.print(numStr.charAt(i));
            if (i < numStr.length() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static double problemNo44(double income){
        double tax;

        if(income <= 50000){
            tax = income * 0.10;
        }
        else if (income <= 100000){
            tax = 5000 + (income - 50000) * 0.15;
        }
        else if (income <= 200000){
            tax = 15000 + (income - 100000) * 0.20;
        } 
        else {
            tax = income * 0.25;
        }

        System.out.println("Tax due: " + tax);
        return income;
    }
    
    public static String problemNo45(long num) {
        String[] belowTwenty = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
        };
        if (num < 20) {
            return belowTwenty[(int) num] + " ";
        }
        else if (num < 100) {
            return tens[(int) num / 10] + " " + problemNo45(num % 10);
        }
        else if (num < 1000) {
            return problemNo45(num / 100) + "hundred " + problemNo45(num % 100);
        }
        else if (num < 1_000_000) {
            return problemNo45(num / 1000) + "thousand " + problemNo45(num % 1000);
        }
        else if (num < 1_000_000_000) {
            return problemNo45(num / 1_000_000) + "million " + problemNo45(num % 1_000_000);
        }
        else {
            return problemNo45(num / 1_000_000_000) + "billion " + problemNo45(num % 1_000_000_000);
        }
    }
    public static void problemNo46 (Scanner sc) {
        System.out.println();
        while (true){
            System.out.println("Enter text (or 'tiuq' to quit): ");
            String input = sc.nextLine();

            if (input.equals("tiuq")) {
                System.out.println("Exiting program.");
                break;
            }
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed: " + reversed);
        }
    }
    public static int problemNo47 (int N) {

        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
            return N;
        }

        long a = 1, b = 1;

        // Print first Fibonacci numbers
        if (N >= 1) System.out.print(a + " ");
        if (N >= 2) System.out.print(b + " ");

        // Print the rest
        for (int i = 3; i <= N; i++) {
            long next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

        System.out.println(); // newline
        return N;
    }
    public static void problemNo48(Scanner sc) {
        System.out.print("Enter the initial amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        // Validate inputs
        if (amount <= 0 || years <= 0) {
            System.out.println("Both amount and years must be positive.");
            return;
        }

        double rate = 0.10;
        double finalAmount = amount * Math.pow(1 + rate, years);

        System.out.printf("After %d years, the amount will be: %.2f%n", years, finalAmount);
    }
    public static void problemNo49(Scanner sc){
        int total = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int totalPositive = 0;
        int totalNegative = 0;
        int countNegative = 0;
        int count50to100 = 0;
        System.out.println("Enter 10 integers: ");

        for(int i = 1; i<=10; i++){
            System.out.println("Number "+i+". ");
            int num = sc.nextInt();
            total += num;
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
            if (num > 0){
                totalPositive = num;
            }
            else if (num < 0) {
                totalNegative = num;
                countNegative++;
            }
            
            if(num >= 50 && num <=100){
                count50to100 = num;
            }
        }
        System.out.println("\nRESULTS:");
        System.out.println("a. Total: " + total);
        System.out.println("b. Largest: " + largest);
        System.out.println("c. Smallest: " + smallest);
        System.out.println("d. Total of positive numbers: " + totalPositive);
        System.out.println("e. Total of negative numbers: " + totalNegative);
        System.out.println("f. Count of negative numbers: " + countNegative);
        System.out.println("g. Count of numbers between 50 and 100: " + count50to100);
    }
    public static void problemNo50(Scanner sc) {

        System.out.println("DESTINATION:");
        System.out.println("1 - American Region");
        System.out.println("2 - Asian Region");
        System.out.println("3 - African Region");
        System.out.println("4 - European Region");
        System.out.print("Enter destination code (1-4): ");
        int dest = sc.nextInt();

        System.out.print("Enter time code (1 = Day, 2 = Night): ");
        int time = sc.nextInt();

        System.out.print("Enter call duration in minutes: ");
        int duration = sc.nextInt();

        if (dest < 1 || dest > 4 || time < 1 || time > 2 || duration <= 0) {
            System.out.println("Invalid input. Please enter correct values.");
            return;
        }

        double rate = 0;
        int blockMinutes = 1; // minutes per billing block

        // Determine rate and billing block based on destination and time
        switch (dest) {
            case 1:  // American Region
                blockMinutes = 3;
                rate = (time == 1) ? 50 : 45;
                break;

            case 2:  // Asian Region
                blockMinutes = 2;
                rate = (time == 1) ? 30 : 27;
                break;

            case 3:  // African Region
                blockMinutes = 3;
                rate = (time == 1) ? 40 : 36;
                break;

            case 4:  // European Region
                blockMinutes = 2;
                rate = (time == 1) ? 35 : 30;
                break;
        }

       
        int blocks = (int) Math.ceil((double) duration / blockMinutes);

        
        double total = blocks * rate;

        System.out.println("\n--- CALL CHARGES ---");
        System.out.println("Billing blocks: " + blocks);
        System.out.printf("Total Charges: P %.2f%n", total);
    }
        public static void problemNo51(Scanner sc) {
    System.out.print("Enter distance in meters: ");
    int distance = sc.nextInt();

    if (distance <= 0) {
        System.out.println("Invalid distance.");
        return;
    }

    double fare = 20.00;

    if (distance > 300) {
        int remaining = distance - 300;
        int blocks = (int) Math.ceil(remaining / 200.0);

        fare += blocks * 2.0;
    }

    System.out.printf("Total Taxi Fare: P %.2f%n", fare);
}
    public static void problemNo52(Scanner sc){
        System.out.print("Enter code: ");
        String code = sc.nextLine();

        if (code.length() > 5) {
            System.out.println("Invalid code: exceeds 5 characters.");
            return;
        }

        if (code.length() == 0 || code.charAt(0) != '*') {
            System.out.println("Invalid code: must start with '*'.");
            return;
        }

        char lastChar = code.charAt(code.length() - 1);
        if (!Character.isLetter(lastChar)) {
            System.out.println("Invalid code: must end with a letter.");
            return;
        }

        System.out.println("Valid code.");
    }
    public static void problemNo53 (Scanner sc){
        double sum = 0;
        double highest = -Double.MAX_VALUE;
        double lowest = Double.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score " + i + ": ");
            double score = sc.nextDouble();

            sum += score; // keep running total
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
        }
        double adjustedSum = sum - highest - lowest;
        double finalScore = adjustedSum / 8; // divide by remaining 8 scores
        System.out.printf("Final score: %.2f%n", finalScore);
    }
    public static int problemNo54 (int base , int exponent){
        int Result = 1;
        for(int i = 1; i<=exponent; i++){
            Result *= base;
        }
        return Result;
    }
    public static int problemNo55(int n) {

        for (int i = 1; i <= n; i++) {      
            for (int j = 1; j <= i; j++) {  
                System.out.print(i);
            }
            System.out.println();           
        }
        return n;
    }
    public static void problemNo56 (Scanner sc){
        System.out.println("Input Number: ");
        String numbers = sc.nextLine();
        int bomb = 0;
        for(int i = 0; i < numbers.length(); i++){
            char digit = numbers.charAt(i);

            switch (digit) {
                case 0:
                case 6:
                case 7:
                case 5:
                    bomb += 1;
                    break;
                case 2:
                case 1:
                    bomb +=2;
                default:
                    break;
            }
            System.out.println("Total bombs"+bomb);
        }
    }
    }
    


