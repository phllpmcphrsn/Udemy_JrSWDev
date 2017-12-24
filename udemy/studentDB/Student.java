package udemy.studentDB;

public class Student {
	private String name;
	private String studentID;
	private String ssn;
	private String phone;
	private String city;
	private String state;
	private static int ID = 1000;
	private double balance;
	
	private String [][] courses = { //arbitrary list of available courses
			{"Java Developer I"},
			{"Java Developer II"},
			{"English 101"}
		};
	
	public Student(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		ID++;
		generateID();
	}
	
	private void generateID() {
		int random = 9000 - ((int)(Math.random() * 1000));
		studentID = ID +""+ random + ssn.substring(7, 11);
	}
	
	public void enroll(String course) {
		if (course.equals(courses[0][0])) {
			balance += 1000;
		}
		else if (course.equals(courses[1][0])) {
			balance += 2000;
		}
		else if (course.equals(courses[2][0])) {
			balance += 250;
		}
		else
			System.out.println("Course is not available.");
	}

	public void pay(double amount) {
		balance -= amount;
		System.out.println("Remaining balance: " + balance);
	}

	public void checkBalance() {
		System.out.println("Your balance: " + balance);
	}
	
	public void showCourses() {
		for (String [] course : courses) {
			for (String c : course) {
				System.out.println(c);
			}
		}		
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Student Info: \n"+ name +"\n"+ studentID +"\n"+ phone +"\n"+ city +","+ state +"\n"+ balance +"\n";
	}
}
