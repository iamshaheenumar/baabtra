package mypoject.Logic;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert_data extends db_access {
	public int signUp(String firstname,String lastname,int mobno,String email,String password){
		try{
			PreparedStatement pt= super.conn.prepareStatement("insert into user-credentials(firstname,lastname,mobnum,email,password)values(?,?,?,?,?)");
			pt.setString(1,firstname);
			pt.setString(2,lastname);
			pt.setInt(3,mobno);
			pt.setString(4,email);
			pt.setString(5,password);
			boolean i=pt.execute();
			if(i==true){
				return 1;
			}
			else{
				return 0;
			}
		}catch(SQLException e){
			e.printStackTrace();
			return 0;
		}


	}

}
