<%-- 
    Document   : calculator
    Created on : Dec 26, 2020, 8:26:45 PM
    Author     : Rahul Barthwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
                if(session.getAttribute("adminemail")==null)
                {
                    response.sendRedirect("adminlogin.jsp");
                }
 %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        
	<script> 
		//function that display value 
		function dis(val) 
		{ 
			document.getElementById("result").value+=val;
		} 
		
		function solve() 
		{ 
			let x = document.getElementById("result").value;
			let y = eval(x); 
			document.getElementById("result").value = y;
		}
		function clr() 
		{ 
			document.getElementById("result").value = ""; 
		} 
	</script> 
	 
</head> 
<body style="background-color: #A3FC7B"> 
<center>
    <img src="images/calculator.svg" style="width: 30px; height: 45px;" >
	<table class="table responsive table-bordered" style="width:200px;height: 250px;margin-top: 10px;"> 
            <tbody>
		<tr> 
			<td colspan="3"><input type="text" style="font-size: 20px" id="result"/></td> 
			<!-- clr() function will call clr to clear all value -->
			<td><input type="button" style="font-size: 20px;width: 50px;" value="c" onclick="clr()"/> </td> 
		</tr> 
		<tr> 
			<!-- create button and assign value to each button -->
			<!-- dis("1") will call function dis to display value -->
			<td><input type="button" style="font-size: 20px;width: 50px;" value="1" onclick="dis('1')"/> </td> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="2" onclick="dis('2')"/> </td> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="3" onclick="dis('3')"/> </td> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="/" onclick="dis('/')"/> </td> 
		</tr> 
		<tr> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="4" onclick="dis('4')"/> </td> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="5" onclick="dis('5')"/> </td> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="6" onclick="dis('6')"/> </td> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="-" onclick="dis('-')"/> </td> 
		</tr> 
		<tr> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="7" onclick="dis('7')"/> </td> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="8" onclick="dis('8')"/> </td> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="9" onclick="dis('9')"/> </td> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="+" onclick="dis('+')"/> </td> 
		</tr> 
		<tr> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="." onclick="dis('.')"/> </td> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="0" onclick="dis('0')"/> </td> 
			
			<td><input type="button" style="font-size: 20px;width: 50px;" value="=" onclick="solve()"/> </td> 
			<td><input type="button" style="font-size: 20px;width: 50px;" value="*" onclick="dis('*')"/> </td> 
		</tr> 
            </tbody>
	</table> 
    </center>

</body> 
</html> 
