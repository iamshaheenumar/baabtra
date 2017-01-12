package com.G2.Actions;
import com.G2.Model.LoginValidate;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport {
	private String uName,pwd;

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

public String execute() throws Exception {
	return LoginValidate.isLoginValid(uName, pwd) ? SUCCESS:INPUT;
}

	

}
