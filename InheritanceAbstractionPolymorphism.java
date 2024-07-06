package week5OOPconcepts;

public class InheritanceAbstractionPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> list = new ArrayList<String>();
		Employee salary = new SalariedEmployee("Tom", "Sawyer", 2500.00);
		Employee hourly = new HourlyEmployee("Tim", "Smith", 15.00, 75.5);
		Employee manager = new Manager("Bob", "Lincoln", 4500.00, 15.5);
		
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
		
		
		
		

	}

}
