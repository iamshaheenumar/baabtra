import java.util.Scanner;


public class employee {

	int int_age;
	String str_name,str_designation;
	double double_PF,double_gratuity,double_salary, double_totalSalary;
	
	double calculate_salary(double double_salary,double double_PF,double double_gratuity) {
		
		this.double_salary = double_salary;
		this.double_PF = double_PF;
		this.double_gratuity = double_gratuity;
		
		double_totalSalary = double_salary -(double_PF+double_gratuity);
		
		return double_totalSalary;
		
	}
	
	public static void main(String[] args){
		
		
		double double_salary,double_PF,double_gratuity,double_totalSalary;
		employee e=new employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the your Salary:");
		double_salary=sc.nextDouble();
		System.out.println("Enter the Pf:");
		double_PF = sc.nextDouble();
		System.out.println("Enter the gratuity:");
		double_gratuity = sc.nextDouble();
		double_totalSalary=e.calculate_salary(double_salary,double_PF,double_gratuity);
		System.out.println("Your Total salary is :"+double_totalSalary);
	}
}

