import java.util.*;
public class num
{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	if(number>0)
	{
		System.out.println("positive");
		
	}else if(number<0)
	{
		System.out.println("negative");
	}
	else
	{
		System.out.println("neither positive nor negative");
	}
	
	
}
}
