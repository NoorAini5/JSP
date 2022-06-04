<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*" %>
<%@ page import="id.ac.uns.vokasi.jdbc.*" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	MahasiswaData md=new MahasiswaData();
	ArrayList<MahasiswaModel> mdTampil=new ArrayList<>();
	mdTampil.addAll(md.getData());
	
	for(int i=0;i<mdTampil.size();i++){
		out.print(mdTampil.get(i).getNim()+""+mdTampil.get(i).getNama());
		out.print("<br>");
		out.print(mdTampil.get(i).getGender());
		out.print("<br>");
		out.print(mdTampil.get(i).getTglLahir());
		out.print("<br>");
		out.print(mdTampil.get(i).getAlamat());
		out.print("<br>");
		out.print(mdTampil.get(i).getProdi());
	}
%>
</body>
</html>