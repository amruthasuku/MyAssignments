package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		int input=29;
		int count =0;
		
		for(int i=1;i<=input;i++)
		{
			if(input%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println("given number is prime number:"+input);
			}
			else
		
			{
				System.out.println("not a prime number");}
		
	

}
}

