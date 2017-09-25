<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test JavaMail</title>
</head>
<body>
<form action="RegisterServlet" method="post">
    <label for="usermail">邮箱：</label>
    <input type="text" name="usermail" id="usermail"><br>
    <label for="delmail">删除：</label>
    <input type="text" name="delmail" id="delmail"><br>
    <input type="submit" value="submit">
    <button><a href="DeleteServlet">delete</a></button>
</form>
</body>
</html>
