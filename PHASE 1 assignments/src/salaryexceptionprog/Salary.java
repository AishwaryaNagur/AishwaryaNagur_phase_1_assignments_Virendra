package salaryexceptionprog;

public class Salary {
	static void salary (double sal)throws CustomSalaryexception{
		if(sal<2100)
			throw new CustomSalaryexception("you need to work hard");
		else if(sal>2100 && sal <=5000)
			throw new CustomSalaryexception("your salary is somehow good");
		else if(sal>5100 && sal<9000)
			throw new CustomSalaryexception("salary is very good");
	}
	public static void main(String[] args) {
		try {
			salary(4500);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured : "+ m.getMessage());
		}
		System.out.println("Rest of the code");
	}
}

class CustomSalaryexception extends Exception{
	CustomSalaryexception(String s){
		super(s);
	}	

}
