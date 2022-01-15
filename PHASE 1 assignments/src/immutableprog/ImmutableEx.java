package immutableprog;

public class ImmutableEx {
	public static void main(String[] args) {
		String t = "Delhi";
		String o= "Mumbai";
		String k= "delhi";
		String y= new String("Mumbai");
		String l= new String("delhi");
		String p= new String("Hello");
		if (y.equals(p)&& y==p)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(t.equals(o)&& t==o)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(k.equals(p)&& k ==p)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(p.equals(y) && p==y)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if (o.equals(l) && o == l)
		{
			System.out.println("true");
		}
		else	
		{
			System.out.println("false");
		}
	
		}

}
