import java.util.Scanner;

public class prob1to10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        studentName("Christian M Murillo");

        System.out.println("");

		//PROBLEM 1
            String name = "Juan";
			String sem = "1st";
			String schoolYear = "2025-2026";
			String degree = "Bachelor of Science in Information Technology";

			System.out.println("Name: "+name);
			System.out.println("Semester: "+sem);
			System.out.println("School Year: "+schoolYear);			
            System.out.println("Degree Program: "+degree);
            System.out.println("");

        //PROBLEM 2
            int height;
            int width;
            
            System.out.println("Height: ");
            height = sc.nextInt();

            System.out.println("Width: ");
            width = sc.nextInt();
            int perimeter = 2 * (height + width);
            int area = height * width;
            System.out.println("Perimeter of Rectangle is "+ perimeter);
            System.out.println("Area of Rectangle is "+area);
            System.out.println("");
        
		//PROBLEM 3
            System.out.println("INPUT THE EMPLOYEES ID: ");
            String employeesID = sc.next();

            System.out.println("INPUT THE WORKING HOURS: ");
            int workingHours = sc.nextInt();

            System.out.println("SALARY AMOUNT PER HOUR: ");
            int salaryPerHour = sc.nextInt();
            sc.nextLine();
            double totalSalary = workingHours * salaryPerHour;

            System.out.println("EMPLOYEES ID: "+ employeesID);
            System.out.printf("Total Salary: $ %.2f\n", totalSalary);
            System.out.println("");
        //PROBLEM 4
            int x;
            int y;
            int z;

            System.out.println("INPUT THE FIRST INTEGER ");
            x = sc.nextInt();
            System.out.println("INPUT THE SECOND INTEGER ");
            y = sc.nextInt();
            System.out.println("INPUT THE THIRD INTEGER ");
            z = sc.nextInt();

            if(x > y && x > z){
                System.out.println("Maximum value of the three integers: "+x);
            }
            else if (y>x && y>z){
                System.out.println("Maximum value of the three integers: "+y);
            }
            else {
                System.out.println("Maximum value of the three integers: "+ z);
            }
            System.out.println("");
        //PROBLEM 5
            int x1;
			int y1;
			int x2;
			int y2;
			System.out.println("Input X1: ");
			x1 = sc.nextInt();
			System.out.println("Input Y1: ");
			y1 = sc.nextInt();
			System.out.println("Intput X2: ");
			x2 = sc.nextInt();
			System.out.println("Intput Y2: ");
			y2 = sc.nextInt();

			double distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));

			System.out.printf("Distance the said points: %.4f\n",distance);
            System.out.println("");
        //PROBLEM 6
            int n;
			System.out.println("Input amount: ");
			n = sc.nextInt();
			if(n>=0 && n<1000){
			//375
			int n100 = n / 100;
			int n50 = (n%100)/50;
			int n20 = ((n%100)%50)/20;
			int n10 = (((n%100)%50)%20)/10;
			int n5 = ((((n%100)%50)%20)%10)/5;
			int n2 = (((((n%100)%50)%20)%10)%5)/2;
			int n1 = ((((((n%100)%50)%20)%10)%5)%2)/1;
			System.out.println(n100+" Note(s) of 100.00");
			System.out.println(n50+" Note(s) of 50.00");
			System.out.println(n20+" Note(s) of 20.00");
			System.out.println(n10+" Note(s) of 10.00");
			System.out.println(n5+" Note(s) of 5.00");
			System.out.println(n2+" Note(s) of 2.00");
			System.out.println(n1+" Note(s) of 1.00");
            System.out.println("");
        //PROBLEM 7
            int totalSeconds;
			System.out.print("Input seconds: ");
			totalSeconds = sc.nextInt();
			int hour = totalSeconds / 3600;
			int min = (totalSeconds % 3600) / 60;
			int sec = totalSeconds % 60;

			System.out.printf("H:%d M:%d S:%d",hour ,min ,sec);
            System.out.println("");
            System.out.println("");
        //PROBLEM 8
            int monthNumber;

				System.out.println("Enter Month Number: ");
				monthNumber = sc.nextInt();

				switch(monthNumber){
					case 1:
						System.out.println("January");
						break;
					case 2:
					System.out.println("February");
						break;
					case 3:
					System.out.println("March");
						break;
					case 4:
					System.out.println("April");
						break;
					case 5:
					System.out.println("May");
						break;
					case 6:
					System.out.println("June");
						break;
					case 7:
					System.out.println("July");
						break;
					case 8:
					System.out.println("August");
						break;
					case 9:
					System.out.println("September");
						break;
					case 10:
						System.out.println("October");
						break;
					case 11:
						System.out.println("November");
						break;
					case 12:
						System.out.println("December");
						break;
					}
                System.out.println("");
        //PROBLEM 9
            int pos = 0;
			int neg = 0;
			int num;
			for(int i = 1; i<=5; i++){
			    System.out.print("Enter"+i+" integer: ");
				num = sc.nextInt();

				if(num>=0){
					pos++;
				}
				else{
					neg++;
				}
				}
				System.out.println("The positives are:"+pos);
				System.out.println("The negatives are: "+neg);
                System.out.println("");
        //PROBLEM 10
            String password = "1234";
			String pass;
				while(true){
					System.out.println("ENTER PASSWORD: ");
					pass = sc.next();

					if(pass.equals(password)){
						System.out.println("Correct Password");
						break;
						}
					else{
						System.out.println("Incorrect Password");
						}
					}
                System.out.println("");
        System.out.println("YOU COMPLETED THE PART 1 SESSION");

        sc.close();
    }
}
    public static void studentName(String firstName){
        System.out.print("NAME:"+firstName);
    }
}


