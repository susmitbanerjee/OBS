<%-- 
    Document   : test
    Created on : May 5, 2017, 9:29:27 PM
    Author     : Susmit
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="newjsp.jsp">
        <fieldset>
	<lebel for="email"><b>Email:</b></lebel><br/>
	<input type="text" name="email" id="email"><br/>
	<br/>
	<lebel for="password"><b>Password:</b></lebel><br/>
	<input type="password" name="password" id="password"><br/>
	<br/>
	<lebel for="confirm"><b>Confirm Password:</b></lebel><br/>
	<input type="password" name="confim" id="confirm"><br/>
	<br/>
	<lebel for="ph"><b>Phone number:</b></lebel><br/>
	<input type="text" name="ph" id="ph"><br/>
	<br/>
	<lebel for="firstname"><b>First name:</b></lebel><br/>
	<input type="text" name="firstname" id="firstname"><br/>
	<br/>
	<lebel for="lastname"><b>Last name:</b></lebel><br/>
	<input type="text" name="lastname" id="lastname"><br/>
	<br/>
	<lebel for="city"><b>City:</b></lebel><br/>
	<select name="city" id="city">
		<option value="delhi">Delhi</option>
		<option value="mumbai">Mumbai</option>
		<option value="kolkata">Kolkata</option>
		<option value="chennai">Chennai</option>
		<option value="bangalore">Bangalore</option>
		<option value="pune">Pune</option>
		<option value="hyd">Hyderabad</option>
		<option value="kochi">Kochi</option>
        </select>
	
        </fieldset>
        <br>
                <input type="submit" name="submit">

        </form>
    </body>
</html>
