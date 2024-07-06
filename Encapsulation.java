package week5OOPconcepts;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setFirstName("Sally");
		student.setPhoneNumber("123-456-7890");
		student.setGradeLevel(11);
		student.introduce();		
		
		Rectangle rec = new Rectangle(10.0, 15.0);
		rec.setLength(10.0);
		System.out.println(rec.getArea());
		
		/*
		 * Access Modifiers:
		 * public - accessible everywhere
		 * protected - accessible only within the class, other classes in the same package and all subclasses
		 * private - only accessible from within the class itself
		 * No Modifier - same as protected except not accessible in a subclass in different packages
		 * 
		*/
		
		
		
		
	}

}
