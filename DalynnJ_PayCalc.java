import java.util.Scanner; // Import Scanner for user input

public class DalynnJ_Payroll 
{
	
	
	public static void PrintCredits()
	{ // Start code block
		System.out.print("\n************************************");
		System.out.print("\n*** Created by Dalynn Jacobs         ***");
		System.out.print("\n***Copyright 2025                    ***");
		System.out.print("\n*************************************\n");
	} // End code block 
	
	public static int GetNumOfEmployee()
	{
		
		String strRepeats="";
		int repeats=0;
		Scanner myKB = new Scanner(System.in);
		
	     System.out.print("How many employee payrolls do you want to enter?: ");
	     strRepeats = myKB.nextLine();
	     repeats = Integer.parseInt(strRepeats);
	     
	     return repeats; //Return a copy of the value in this local var to the calling function

	} //End code block
	
	public static int GetNumOfEmployee(Scanner tKB)
	{
		
		String strRepeats="";
		int repeats=0;
		
	    System.out.print("How many employee payrolls do you want to enter?: ");
	    strRepeats = tKB.nextLine();
	    repeats = Integer.parseInt(strRepeats);
	    
	    return repeats;
	}

	public static void main(String[] args) {
		
		int repeats = 0; // Variable to hole how many times to loop 
		
		//Create variables for Payroll(Days of week, totalHours)
		// your name, grossPay, payRate
		int numEmployees;
		double sun, mon, tue, wed, thur, fri, sat;
		double totalHours, grossPay, payRate, taxRate, taxAmount, netPay;
		String name; 
		
		
		// Create Scanner object for user input 
		Scanner myKB = new Scanner(System.in);
		  
		// Ask user how many payrolls to enter (validate input)
        do {
            System.out.print("How many employee payrolls do you want to enter? ");
            while (!myKB.hasNextInt()) { // Ensure valid integer input
                System.out.println("Invalid input. Please enter a whole number.");
                myKB.next();
            }
            numEmployees = myKB.nextInt();
            myKB.nextLine(); // Consume newline
            if (numEmployees < 1) {
                System.out.println("You must enter at least one payroll.");
            }
        } while (numEmployees < 1);

        // Process payroll for each employee
        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("\nProcessing payroll for Employee " + i);
            
            // Get Employee Name
            System.out.print("What is your name? ");
            name = myKB.nextLine();

            // Get and validate hourly pay rate
            do {
                System.out.print("What is your hourly pay rate? ");
                while (!myKB.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    myKB.next();
                }
                payRate = myKB.nextDouble();
                myKB.nextLine(); // Consume newline
                if (payRate < 0) {
                    System.out.println("Hourly pay rate cannot be negative.");
                }
            } while (payRate < 0);	
		
		// Ask for daily hours worked 
          	do {
                System.out.print("Please enter hours worked on Sunday (0-24): ");
            	    
            	    while (!myKB.hasNextDouble()) { // Prevents crashes if input is non-numeric
            	        System.out.println("Invalid input. Please enter a number.");
            	        myKB.next(); // Consume invalid input
            	    }
            	    
            	    sun = myKB.nextDouble();
            	    myKB.nextLine(); // Consume the newline character
            	    if (sun < 0 || sun > 24) { 
            	        System.out.println("Hours worked each day can range from 0 to 24 hours.");
            	    }

            	} while (sun < 0 || sun > 24); // Keeps asking until valid input
		
         // Monday Hours Validation
            do {
                System.out.print("Enter hours worked on Monday (0-24): ");
                while (!myKB.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a number.");
                    myKB.next();
                }
                mon = myKB.nextDouble();
                myKB.nextLine();

                if (mon < 0 || mon > 24) {
                    System.out.println("Hours worked each day must be between 0 and 24.");
                }
            } while (mon < 0 || mon > 24);

            // Tuesday Hours Validation
            do {
                System.out.print("Enter hours worked on Tuesday (0-24): ");
                while (!myKB.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a number.");
                    myKB.next();
                }
                tue = myKB.nextDouble();
                myKB.nextLine();

                if (tue < 0 || tue > 24) {
                    System.out.println("Hours worked each day must be between 0 and 24.");
                }
            } while (tue < 0 || tue > 24);

            // Wednesday Hours Validation
            do {
                System.out.print("Enter hours worked on Wednesday (0-24): ");
                while (!myKB.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a number.");
                    myKB.next();
                }
                wed = myKB.nextDouble();
                myKB.nextLine();

                if (wed < 0 || wed > 24) {
                    System.out.println("Hours worked each day must be between 0 and 24.");
                }
            } while (wed < 0 || wed > 24);

            // Thursday Hours Validation
            do {
                System.out.print("Enter hours worked on Thursday (0-24): ");
                while (!myKB.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a number.");
                    myKB.next();
                }
                thur = myKB.nextDouble();
                myKB.nextLine();

                if (thur < 0 || thur > 24) {
                    System.out.println("Hours worked each day must be between 0 and 24.");
                }
            } while (thur < 0 || thur > 24);

            // Friday Hours Validation
            do {
                System.out.print("Enter hours worked on Friday (0-24): ");
                while (!myKB.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a number.");
                    myKB.next();
                }
                fri = myKB.nextDouble();
                myKB.nextLine();

                if (fri < 0 || fri > 24) {
                    System.out.println("Hours worked each day must be between 0 and 24.");
                }
            } while (fri < 0 || fri > 24);

            // Saturday Hours Validation
            do {
                System.out.print("Enter hours worked on Saturday (0-24): ");
                while (!myKB.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a number.");
                    myKB.next();
                }
                sat = myKB.nextDouble();
                myKB.nextLine();

                if (sat < 0 || sat > 24) {
                    System.out.println("Hours worked each day must be between 0 and 24.");
                }
            } while (sat < 0 || sat > 24);

		// Sum the total hours into variables
		totalHours = sun + mon + tue + wed + thur + fri + sat;
		
		//GrossPay = payrate x total hours
		grossPay = payRate * totalHours;
		
    //Tax Calculation based on Gross Pay 
	if (grossPay <= 100) {
        taxRate = 0.0;
    } else if (grossPay <= 400) {
	    taxRate = 0.10;
	} else if (grossPay <= 800) {
	    taxRate = 0.15;
    } else if (grossPay <= 1000) {
        taxRate = 0.18;
    } else if (grossPay <= 3000) {
	    taxRate = 0.20;
    } else if (grossPay <= 5000) {
	    taxRate = 0.25;
	} else if (grossPay <= 10000) {
	    taxRate = 0.35;
    } else if (grossPay <= 50000) {
	    taxRate = 0.45;
	        } else {
	    taxRate = 0.50;
    }

	// Calculate tax amount and net pay
 taxAmount = grossPay * taxRate;
 netPay = grossPay - taxAmount;
 
		//Print receipt and results
		System.out.println("Payroll Receipt for: " + name);
		System.out.println("Hours worked: ");
		System.out.println("Sunday: " + sun + "hours");
		System.out.println("Monday: " + mon + "hours");
		System.out.println("Tuesday: " + tue + "hours");
		System.out.println("Wednesday: " + wed + "hours");
		System.out.println("Thursday: " + thur + "hours");
		System.out.println("Friday: " + fri + "hours");
		System.out.println("Saturday: " + sat + "hours");
		System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Hourly Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("Net Pay: $" + netPay);
        
  // Output message based on tax rate using switch-case
 switch ((int) (taxRate * 100)) {
           case 0:
        System.out.println("You're in the lowest tax bracket. Keep up the good work!");
                break;
            case 10:
        System.out.println("Great job! You're keeping most of your earnings.");
                break;
            case 15:
        System.out.println("Not bad! You're getting taxed a moderate amount.");
                break;
            case 18:
        System.out.println("You're in a slightly higher tax bracket, but still doing well.");
                break;
            case 20:
        System.out.println("You're earning well, but more taxes are coming out.");
                break;
            case 25:
        System.out.println("A quarter of your income goes to taxes, but you're still doing great!");
                break;
            case 35:
        System.out.println("You're earning a lot, but also paying a larger portion in taxes.");
                break;
            case 45:
        System.out.println("You're in a higher tax bracket—time to plan for taxes next year.");
                break;
            case 50:
        System.out.println("You're in the highest tax bracket. Time to consider tax planning!");
                break;
            default:
        System.out.println("Something went wrong with your tax calculation.");
        }
       }
 //CLose scanner
 	myKB.close();
 
	PrintCredits(); // Print credits 
	
	}
}
	
		