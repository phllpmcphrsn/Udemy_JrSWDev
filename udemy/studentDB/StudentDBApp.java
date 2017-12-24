package udemy.studentDB;

public class StudentDBApp {
	public static void main(String[] args) {
		Student student1 = new Student("Gucci Mane", "123-45-6789");
		Student student2 = new Student("Alexis Bledel", "576-10-5208");
		Student student3 = new Student("Five Guys", "894-30-2857");
		
		student1.enroll("Java Developer I");
		student1.enroll("Java Developer II");
		student1.pay(1000);
		student1.checkBalance();
		student1.showCourses();
		student1.setCity("St. Louis");
		student1.setState("MO");
		student1.setPhone("417-012-9043");
		System.out.println(student1.toString());
		
		student2.enroll("Java Developer II");
		student2.pay(500);
		student2.setCity("Richmond");
		student2.setState("VA");
		student2.setPhone("804-123-4567");
		System.out.println(student2.toString());
		
		student3.enroll("English 101");
		student3.pay(200.50);
		student3.setCity("Sacramento");
		student3.setState("CA");
		student1.setPhone("916-344-2124");
		System.out.println(student3.toString());
	}

}
