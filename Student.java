package week5OOPconcepts;

public class Student {

		static int numberOfStudents;
	
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private int gradeLevel;
		
		public Student() {}
		
		//contructors
		
		public Student(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.gradeLevel = gradeLevel;
			
		}
		
		//public methods
		
		public void introduce() {
			System.out.println("Hello, my name is " + firstName + " " + lastName);
			System.out.println("I am in grade " + gradeLevel);
			System.out.println("My phone number is " + phoneNumber);
			
		}
		
		//Private method
		
		private boolean checkLength(String str, int length) {
			return str.length() > length;
		}
		
		//Getters and setters
		
		
		public void setFirstName(String firstName) {
			if (checkLength(firstName, 1)) {
				this.firstName = firstName;
			}
		}
		public String getfirstName() {
			return firstName;
		}
		
		public void setLastName(String lastName) {
			if (checkLength(lastName, 1)) {
				this.lastName = lastName;
			}
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setPhoneNumber(String phoneNumber) {
			if (checkLength(phoneNumber, 9)) {
				this.phoneNumber = phoneNumber;
			}
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setGradeLevel(int gradeLevel) {
			if (gradeLevel > 0 && gradeLevel < 13) {
				this.gradeLevel = gradeLevel;
			}
		}
		public int getGradeLevel() {
			return gradeLevel;
		}
		
		
		
		
		
}
