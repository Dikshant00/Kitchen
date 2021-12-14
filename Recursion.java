import java.util.Scanner;
class Recursion{
{
	int fact(int n)
	{	
	   if (n == 0)
	   return 1;	
	else  
 	   return(n * fact(n-1));
}
public static void main(String[] args)
{
	Factorial obj = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
	int n = sc.nextInt();
	System.out.println("Factorial: " + obj.fact(n));
}
}