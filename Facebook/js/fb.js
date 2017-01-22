function logInValidation()
{
	var username = document.getElementById("username").value;
	var psd = document.getElementById("password").value;
	if(username=="" || username== null || psd=="" || psd==null)
	{
		alert("Fill in Credentials !");
	}
	else
	{
		alert("Successfull Loged In !");
	}
}

function signUpValidation()
{
	var c = new Date();
	var fname = document.getElementById("firstname").value;
	var lname = document.getElementById("lastname").value;
	var psd = document.getElementById("Password").value;
	var email = document.getElementById("email").value;
	var mobno = document.getElementById("MobNumber").value;
	var dob =document.getElementById("dob").value;
	var y1 = c.getFullYear();
	var y2 = new Date(dob).getFullYear();

	var age = y1-y2;

	if(fname == "" || lname == "" || psd == "" || email == "" || mobno == "" || dob == "")
	{
		alert("Fill in all details to sign Up");
	}
	else
	{
		if(fname.length < 3)
		{
			alert("First name should be minimum of 3 character length !");
		}
		else
		{
			if(psd.length <8 || psd.length>13)
			{
				alert("Password should be in between 8-13 characters !");
			}
			else
			{
				if (age < 13) 
				{
					alert("Your age is less than 13");
				}
				else
				{
					alert("Successfull Sign Up !");
				}
			}
		}
	}
}