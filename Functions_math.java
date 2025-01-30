package math;

public class Functions_math {

	public static void main(String[] args)
	{
		int answer=Math.addExact(10, 20);
		System.out.println(answer);
		int sub=Math.subtractExact(20,30);
		System.out.println(sub);
		int mul=Math.multiplyExact(answer, sub);
		System.out.println(mul);
		double y=Math.PI;
		System.out.println(y);
		
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(Math.random());
		}
		

	}

	

}
