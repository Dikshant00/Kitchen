import java.util.Scanner;
class BindingClass {
public static void main(String args[]){
	calculator calcObj = new calculator();
	double num1, num2;

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Numbers");
			num1=sc.nextDouble();			
			num2=sc.nextDouble();
		System.out.println("Enter the operator (+,-,*,/)");
			char op = sc.next().charAt(0);
			double result = calcObj .caculate(num1.num2,op);
		}


	}

	public class calculator{

	double o=0;	
	switch(op){

		case '+':
		o = num1+num2;
		break;

		case '-':
		o =num1-num2;
		break;

		case '*':
		o = num1*num2;
		break;

		case'/':
		o = num1/num2;
		break;

	default:System.out.println("Wrong Input");
	break;
	}

		System.out.println("The final result:");
		System.out.println();

		System.out.println(num1 + "" + op + "" + num2 +" =" + o);
	}
} 