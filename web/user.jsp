<%@page import="java.sql.*"%>
<html>
    <head>
  
        <title> JSP Page</title>
        <link rel="stylesheet" href="style.css?version=51">
    </head>
    <body>
        <div class="set"><hr>
<%
    
String result=request.getParameter("result");
String url="jdbc:derby://localhost:1527/muskan_thakur";
String username="muskan";
String password="muskan";
try{ 
Class.forName("org.apache.derby.jdbc.ClientDriver");
Connection con=DriverManager.getConnection(url,username,password);
Statement stt=con.createStatement();
ResultSet ress=stt.executeQuery("select *from compdata where id='"+result+"'");
while(ress.next())
{
 
    out.println("Id  = "+ress.getString("id")) ;%><br><br>
    <%out.println("Name = "+ress.getString("sname"));%><br><br>
    <%out.println("Company Name = "+ress.getString("cname"));%><br><br>
<%out.println("Year = "+ress.getString("yearr"));%><br><br>
<%out.println("Father Name = "+ress.getString("Fathername"));%><br><br>
<%out.println("Percentage = "+ress.getString("percentage"));%><br><br>
<%out.println("Age = "+ress.getString("age"));%><br><br>
<%out.println("E-mail = "+ress.getString("email"));%><br><br>
<%out.println("Phone-number = "+ress.getString("phone"));%><br><br>

<%
    }    
con.close();
}
catch(Exception e) {
System.out.println(e);
}


%>
<hr>
        </div>
    </body></html>