import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StudentInfo {

	String str_name,str_class;
	int int_age,int_rollno;
	//void ShowData(){}


	public static void main(String[] args) throws IOException{
		
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		StudentInfo[] st=new StudentInfo[100];
		String str_c;
		int int_i=0;
		while(true){
			st[int_i] = new StudentInfo();
			System.out.println("Enter your name:\n");
			st[int_i].str_name=inp.readLine();
			System.out.println("Enter your age:\n");
			st[int_i].int_age=Integer.parseInt(inp.readLine());
			System.out.println("Enter the class you are:\n");
			st[int_i].str_class=inp.readLine();
			System.out.println("Enter the your rollno:\n");
			st[int_i].int_rollno=Integer.parseInt(inp.readLine());
			
			System.out.println("Do you want to continue: Y or N :\n");
			str_c=inp.readLine();
			if(str_c.equals("n")||str_c.equals("N"))
				break;
			int_i+=1;
		}
		System.out.println("Student Details Entered: \n Name\t\t Age \t\t Class \t\t Roll-no \n");

		for(int int_j=0;int_j<=int_i;int_j++){
			System.out.println(st[int_j].str_name+"\t\t  "+st[int_j].int_age+"\t\t  "+st[int_j].str_class+"\t\t  "+st[int_j].int_rollno);
		}
		
		
	}
}