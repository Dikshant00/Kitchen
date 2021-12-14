import java.util.Scanner;
class Names{
	public static void main(String[] args){
	char moreNames = 'y';
		while(moreNames == 'y'){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name");
	String str= sc.nextLine();

		System.out.println("Enter the Address");
		String str1= sc.nextLine();

	System.out.println(str + " " + str1);

	System.out.println("If you want to add more name then type y ");
	moreNames=sc.nextLine().charAt(0);
	}

       }
}



