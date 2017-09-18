/**
 * 
 */
package assignment3_4;
import java.util.Scanner;

/**
 * Java program to student entered passed / failed from the marks entered in PCM
 *
 */

class Student {	// Class student to gather the details and process result
	
	private String studentName; 					// Declaring student name as private variable 
	private long phoneNumber;						// Declaring phone number as private variable
	private int rollNumber;							// Declaring roll number as private variable
	private String className;						// Declaring class name as private variable

	
	public String getStudentName() {				// getter for student name
		return studentName;
	}
	public void setStudentName(String studentName) {// setter for student name
		this.studentName = studentName;
	}
	public long getPhoneNumber() {					// getter for phone number
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {	// setter for phone number
		this.phoneNumber = phoneNumber;
	}
	public int getRollNumber() {					// getter for roll number
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {		// setter for roll number
		this.rollNumber = rollNumber;
	}
	public String getClassName() {					// getter for class
		return className;
	}
	public void setClassName(String className) {	// setter for class
		this.className = className;
	}
	
	public String result(int physicsMark , int chemistryMark , int mathsMark , int rollNumber) { // method to print Pass/Fail result of a student
		
		this.rollNumber=rollNumber; 					// Assigning roll number to variable
		int total=physicsMark+chemistryMark+mathsMark;	// Calculating total mark obtained by student
		
		if (total>180)									// Total is greater than 180, Student is Pass
			return "Passed";							// Print pass
		else
			return "Failed"; 							// else Print fail
	}
	
	
}
class StudentResultProcessing extends Student { // Class to process student result extends from Student

	private int physicsMark;					// Declaring Physics Marks as instance variable
	private int mathsMark;						// Declaring maths marks as instance variable
	private int chemistryMark;					// Declaring chemistry marks as instance variable
	public String toString() {					// toString method to display student details with result
		
		return super.getStudentName()+" with phone number "+super.getPhoneNumber()+" and roll number "+this.getRollNumber()+" belonging to class "+super.getClassName()+" has "+super.result(this.physicsMark, this.chemistryMark, this.mathsMark, super.getRollNumber());
		
	}
	
	public static void main(String[] args) {	//  main method starts
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 										// Creating scanner object
		
		StudentResultProcessing s = new StudentResultProcessing();					// Creating StudentResultProcessing object
		
		System.out.println("Enter student name :"); 								// Print message to ask Student name as input
		s.setStudentName(sc.nextLine());											// Set student name using setter method
		
		System.out.println("Enter student Class :");								// Print message to ask Student class as input
		s.setClassName(sc.nextLine());												// Set class using setter method

		System.out.println("Enter student phone number without country code :");	// Print message to ask phone number as input
		s.setPhoneNumber(sc.nextLong());											// Set phone number using setter method
		
		System.out.println("Enter student roll number :");							// Print message to ask roll number as input
		s.setRollNumber(sc.nextInt());												// Set roll number using setter method
				
		System.out.println("Enter marks in Physhics mark of student out of 100:");	// Print message to ask physics mark as input
		s.physicsMark=sc.nextInt();													// Assign Physics mark to instance variable
		
		System.out.println("Enter marks in Maths mark of student out of 100:");		// Print message to ask Maths mark as input
		s.mathsMark=sc.nextInt();													// Assign maths mark to instance variable
		
		System.out.println("Enter marks in Chemistry mark of student out of 100t:");// Print message to ask chemistry mark as input
		s.chemistryMark=sc.nextInt();												// Assign Chemistry mark to instance variable
		
		System.out.println(s);														// Print object result using toString method
		
		sc.close();																	// Closing the scanner object
		

	}

} //StudentResultProcessing class closed
