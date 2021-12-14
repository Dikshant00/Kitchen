import java.util.Scanner;
public class Pair {
    public static void main(String args[])
    {
	int sum;
        int[] arr = { 1, 4, 3, 2, 5, 0, 3, 6,-1, 7, -9, 15 };
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Numebr");
	sum=sc.nextInt	();
        getPairsCount(arr, sum);
    }
 
    public static void getPairsCount(int[] arr, int sum)
    {
 
        int count = 0;
 
            for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
 
        System.out.printf("No of Pair is %d", count);
    }
}