﻿
<html>
<head>
	<meta charset="utf-8">
	 <meta http-equiv="X-UA-Compatible" content="IE=edge">
	 <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Member Login</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<!--  compiled and minified CSS --> 
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional Bootstrap theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!--  compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<!--  My Css File -->
<link rel="stylesheet" type="text/css" href="./css/main.css">
<!--  google fonts -->
<link href="https://fonts.googleapis.com/css?family=Bungee+Shade|Faster+One|Gloria+Hallelujah|Merienda|Oleo+Script:700|Yesteryear|Monoton|Srisakdi:400,700|Black+Ops+One&amp;subset=latin-ext" rel="stylesheet">
<style type="text/css">
	a{
		color: white;
	}
</style>
</head>
<body>
	<div id="header">
	<div class="logo" align="center">
 <a class="navbar-brand " href="index.html" id="logo"> <img src="images/logo.PNG" height="100px" weight="100px"></a>
	</div>
			<div class="menu">
				<ul>
                <li><a href="index.html">Home</a></li>
                <li><a href="#">About Us</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">Contact Us</a></li>                
				</ul>
			</div>
	</div>

	<div id="img" style="background:url(./images/login7.jpg); background-repeat: no-repeat; background-size: cover; ">
	

	
		<div class="login">
		<center><h2 style="color:white;">Member Login</h2></center>
		<form align="center" name="login" method="post" action="domemberlogin.htm">
			<b style="color:white;">Username&nbsp;:</b> <input class="box" type="text" name="username"><br><br>
			<b style="color:white;">Password&nbsp;:&nbsp;</b> <input class="box" type="password" name="password"><br><br>

			<input id="styled" type="submit" value="Log In">
		
		</form>
		<center>
		<a href="memberregistration.htm" style="color:DodgerBlue;"><span class="glyphicon  glyphicon glyphicon-user"></span>  Member Registration</a>
		</center>
		</div>
		
		
	</div>
	<div id="footer">
		<a href="#" style="display: inline; padding-left: 5%;">CMS Infotech</a>
  <a href="#" style="display: inline; padding-left: 5%;">Privacy & Terms</a>  
  <a href="#" style="display: inline; padding-left: 5%;">Need Help ?</a>    

    <a href="https://www.cognizant.com/" style="display: inline; float: right; padding-right: 5%;">Powered by Cognizant © 2019</a>
	</div>
	
</body>
</html>
