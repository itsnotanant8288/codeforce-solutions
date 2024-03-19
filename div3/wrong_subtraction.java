//Div 3 Wrong Subtraction
import java.util.*;


public class ex{
		
	public static void main(String args[])
	{
		int num,sub,i;
		
		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextInt();
		sub = scanner.nextInt();
		
		for(i=0;i<sub;i++)
		{
			if(num%10==0)
			{
				num /= 10;
			}
			else
			{
				num -= 1;
			}
		}
		
		System.out.println(num);
	}
}



