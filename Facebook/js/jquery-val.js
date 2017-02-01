$(document).ready(function(){
		$("#btnLogin").click(function(){
			var username = $("#username").val();
			var psd = $("#password").val();
			$.ajax(
			{
				'url':'http://services.trainees.baabtra.com/LoginService/login.php',
				'DataType':'jsonp',
				'data':{email:username,password:psd},
				success:function(data)
				{

					obj = JSON.parse(data);
					console.log(data);
					if (obj[0].ResponseCode=="200") {
						window.location.replace("fb_Success.html");
					}
					else if (obj[0].ResponseCode=="500") {

					}
				},
				error:function()
				{
					alert("error");
				}

			});
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
