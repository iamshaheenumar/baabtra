$(document).ready(function(){
		$("#btnLogin").click(function(){
			var username = $("#username").val();
			var psd = $("#password").val();
			if(username=="" || username== null || psd=="" || psd==null)
			{
				alert("Fill in Credentials !");
			}
			else
			{
				alert("Successfull Loged In !");
			}
		});


		$("#SignUpImg").click(function(){
			var c = new Date();
			var fname = $("#firstname").val();
			var lname = $("#lastname").val();
			var psd = $("#Password").val();
			var email = $("#email").val();
			var mobno = $("#MobNumber").val();
			var dob = $("#dob").val();
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
		});
	});		
