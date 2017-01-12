package com.G2.Model;

public class LoginValidate {
	
	public static boolean isLoginValid(String uName,String pwd)
	{
		return uName.equals("admin") && pwd.equals("admin")?true:false;
	}
}
