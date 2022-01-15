package studentsmarksprog;

public class Student {
	int age;
	String name;
	char section;
	char gender;
	int subject1;
	int subject2;
	int subject3;
	double percentage;
	
	public Student(int m1,int m2, int m3,double p) {
		subject1 = m1;
		subject2 = m2;
		subject3 = m3;
		percentage = p;
	}
	public void display() {
		System.out.println(subject1+" "+subject2+" "+subject3+" "+percentage);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(35,85,70,63.3);
		Student s2 = new Student(0,90,78,56);
		Student s3 = new Student(0,40,95,45);
		
		s1.display();
		s2.display();
		s3.display();

	}

}
