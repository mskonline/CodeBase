package test;

public class StringTest {

	public static void main(String[] args)
	{
		String s1=new String("Buggy");
		//test(s1);

		System.out.println(s1);
	}

	private static void test(StringBuffer s){
		s.append("Bread");
	}
}
