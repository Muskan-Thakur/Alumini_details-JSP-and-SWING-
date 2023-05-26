<%@page import="java.util.Date,java.text.SimpleDateFormat"%>
<html>
    <head>
  
        <title> JSP Page</title>
        <link rel="stylesheet"  href="style.css?version=51">
    </head>
    <body>
<%
SimpleDateFormat dd=new SimpleDateFormat("ddMMyyyy");
Date d=new Date();
String CDate=dd.format(d);
String username=request.getParameter("username");
String password=request.getParameter("password");
if(username.equals("muskan") && password.equals(CDate))
{

%>

<form action="resultpage.jsp">
    
    <label>COMPANY</label>
<hr >
        <select name ="companies" id="company">
<option value="Microsoft">Microsoft</option>
        <option value="Netflix">NetFlix</option>
        <option value="Amazon">Amazon</option>
        <option value="Flipkart">Flipkart</option>
        <option value="Google">Google</option>
    </select><br><br>
   
               
<label>YEAR</label>
<hr>
<select name ="yrs" id="yrs">
 <option value="2000-2001">2000-2001</option>
        <option value="2001-2002">2001-2002</option>
        <option value="2002-2003">2002-2003</option>
        <option value="2003-2004">2003-2004</option>
        <option value="2004-2005">2004-2005</option>
           </select> 
<br><br>                
<button type="Submit" >Login</button>
</form>
<%}
else
{
%>
 <form action="login.jsp">
            <button type="Submit" >TRY AGAIN</button></form>
 <%
   
}
%>
    </body>
</html>