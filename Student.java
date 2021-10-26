/**-------------------------------------------------------------
//AUTHOR: Gregory Feng
//FILENAME: Lab8.java
//SPECIFICATION: Class for Lab8.java that contains a constructor and getters and setters for all of the instance
 * variables fullName, ID, grade, numAccessed, and numUpdated, with numAccessed incrementing every time an accessor
 * is used and numUpdated incrementing every time a mutator is used.
//FOR: CSE 110 - Lab #8
//TIME SPENT: 10 min.
//-----------------------------------------------------------*/
public class Student {
	//Instance data definitions
	private String fullName;
	private String ID;
	private double grade;
	//Static variables that don't reset at the call of a constructor
	private static int numAccessed=0;
	private static int numUpdated=0;
	//Student constructor that sets the fullName, ID and grade of the student to null values.
	public Student() {
		fullName="";
		ID="";
		grade=0.0;
	}
	//Accessor that increments the count of the number of times accessors have been called before returning the full name of the object
	public String getFullName() {
		numAccessed++;
		return fullName;
	}
	//Accessor that increments the accessor count before returning the ID of the student.
	public String getId() {
		numAccessed++;
		return ID;
	}
	//Accessor that increments the accessor count before returning the grade of the student.
	public double getGrade() {
		numAccessed++;
		return grade;
	}
	//Accessor that incremenets the accessor count before returning the accessor call count.
	public int getNumAccessed() {
		numAccessed++;
		return numAccessed;
	}
	//Accessor that increments the accessor count before returning the mutator call count.
	public int getNumUpdated() {
		numAccessed++;
		return numUpdated;
	}
	//Mutator that increments the mutator call count before updating the full name of the student to the new full name
	public void setFullName(String newName) {
		numUpdated++;
		fullName=newName;
	}
	//Mutator that increments the mutator count before updating the ID of the student.
	public void setId(String newID) {
		numUpdated++;
		ID=newID;
	}
	//Mutator that increments the mutator count before updating the grade of the student.
	public void setGrade(double newGrade) {
		numUpdated++;
		grade=newGrade;
	}
}
