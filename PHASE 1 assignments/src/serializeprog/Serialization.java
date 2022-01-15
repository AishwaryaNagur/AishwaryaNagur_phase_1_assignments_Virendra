package serializeprog;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String args[]) throws IOException 
	{
		Student obj = new Student( "Chaitanya",25,"IT ",1234567890,"adfdsh@gmail.com", 116,'M');
		Student s1 = new Student("aish",22,"HR",0173762515,"agfgfa@gmail.com",32,'F');

		FileOutputStream fos= null;
		ObjectOutputStream oos= null;

		try{ 
			fos = new FileOutputStream("D:\simplilearn"); 
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("Serialzation Done!!");
		}catch(IOException ioe){
			System.out.println(ioe);
		}
		finally{
			oos.close();
			fos.close();
		}

		//Deserialization
		Student o=null;
		Student s2=null;
		try{
			FileInputStream fis = new FileInputStream("D:\simplilearn");
			ObjectInputStream ois = new ObjectInputStream(fis);
			o = (Student)ois.readObject();
			s2 = (Student)ois.readObject();
			ois.close();
			fis.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			return;
		}catch(ClassNotFoundException cnfe)
		{
			System.out.println("Student Class is not found.");
			cnfe.printStackTrace();
			return;
		}
		System.out.println("Student Name:"+o.getStuName());
		System.out.println("Student Age:"+o.getStuAge());
		System.out.println("Student deptname:"+o.getStudeptname());
		System.out.println("Student contactno:"+o.getStucontactno());
		System.out.println("Student email:"+o.getStuemail());
		System.out.println("Student id:"+o.getStuid());
		System.out.println("Student gender:"+o.getStugender());
	}
}

//------------------------------Student-------------------------//
class Student implements java.io.Serializable{

	private static final int id = 0;
	private transient String stuName;
	private int stuAge;
	private String studeptname;
	private long stucontactno;
	private String stuemail;
	private int stuid;
	private char stugender;



	public Student(String email, int age, String name,int age1, String deptname,long contactno,char gender) {
		this.stuAge = age1;
		this.stuName = name;
		this.studeptname = deptname;
		this.stucontactno = contactno;
		this.stuemail = email;
		this.stuid = id;
		this.stugender = gender;
	}

	public char getStugender() {
		return stugender;
	}
	public void setStugender(char stugender) {
		this.stugender = stugender;
	}

	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuemail() {
		return stuemail;
	}
	public void setStuemail(String stuemail) {
		this.stuemail = stuemail;
	}


	public long getStucontactno() {
		return stucontactno;
	}
	public void setStuconatctno(long stucontactno) {
		this.stucontactno = stucontactno;
	}

	public String getStudeptname() {
		return studeptname;
	}

	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


}
