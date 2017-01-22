package mypoject.Logic;
import java.sql.*;

public class db_access {
	Connection conn;
	 db_access(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e ){
			e.printStackTrace();
		}
		String connectionURL="jdbc:mysql://localhost/fb-signup";
		try{
		conn = DriverManager.getConnection(connectionURL,"root","root");
		if(conn!=null){
			System.out.println("connected");
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
 
}
