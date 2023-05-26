<%@page import ="java.sql.*"%>
<html>
    <head>
  
        <title> JSP Page</title>
        <link rel="stylesheet" href="style.css?version=51">
    </head>
    <body>

<%
    
   String companyname=request.getParameter("companies");
   String companyyear=request.getParameter("yrs");
   companyyear=companyyear.substring(0,4);
   String url="jdbc:derby://localhost:1527/muskan_thakur";
   String username="muskan";
   String password="muskan";
   try{
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       Connection connection=DriverManager.getConnection(url,username,password);
       Statement statement=connection.createStatement();
       ResultSet resultset=statement.executeQuery("select * from compdata where cname='"+companyname+"'and yearr='"+companyyear+"'");
       
%>
<form action="user.jsp">
   
  
                <select name="result" id="result">
        <%
            while(resultset.next())
            {
                %>
                   <option value="<%=resultset.getInt(("id"))%>"><%=resultset.getInt(("Id"))+"--------------->"+resultset.getString(("sname"))%></option>
                   <%}%>
                </select><br><br>
              <button type="Submit" >Login</button>
    
        </form>
               
                  
                <%
                    connection.close();
                    }
catch (Exception e)
{
out.println(e);
}
%>

</body></html>