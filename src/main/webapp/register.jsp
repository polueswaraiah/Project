<!DOCTYPE html> 
<html> 
<head> 
<title>Welcome to JLCBookStore</title> 
</head> 
<body> 
 
<h2> Java Learning Center BookStore</h2> 
<h3> Rigistration Form</h3> 
<font color=red size=4>${MSG}</font>
 
<form action="myreg.jlc" method="post"> 
<table> 
<tr> 
<td> Full Name </td> 
<td> <input type="text" name="fullName"/> </td> 
</tr> 

<tr> 
<td> Email </td> 
<td> <input type="password" name="email"/> </td> 
</tr> 
<tr> 
<td>Phone </td> 
<td> <input type="password" name="phone"/> </td> 
</tr> 

<tr> 
<td>Date Of Birth</td> 
<td> <input type="password" name="dob"/> </td> 
</tr> 
<tr> 
<td> City </td> 
<td> <input type="password" name="city"/> </td> 
</tr> 

<tr> 
<td>Username </td> 
<td> <input type="password" name="username"/> </td> 
</tr> 
<tr> 
<td> password </td> 
<td> <input type="password" name="password"/> </td> 
</tr> 

<tr> 
<td colspan="2" align="center">  
<input type="submit" value="Login Now"/> </td> 
</tr> 

</table> 
</form> 
 
</body> 
</html>

<a href="register.jsp">New User SignUp</a>< || <a href="forgotpw.jsp">ForgotPassword</a>