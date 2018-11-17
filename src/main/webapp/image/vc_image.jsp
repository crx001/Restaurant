<%@ page  contentType="image/jpeg" %>
<%@page import="java.io.OutputStream"%>
<%@page import="javax.imageio.ImageIO"%>
<jsp:useBean id="image" scope="session" class="com.restaurant.tools.ImageTool"></jsp:useBean>
<%   
out.clear();
ImageIO.write(image.creatImage(),"jpeg",response.getOutputStream());
String rand=image.sRand;
session.setAttribute("rand", rand);
%>