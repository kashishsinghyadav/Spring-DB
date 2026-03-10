<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Result</title>


</head>
<body>

<div class="container">

    <h2>Result</h2>

    <p>The Sum is: <strong>$<%=session.getAttribute("result")%></strong></p>

    <a href="/">Go Back</a>

</div>

</body>
</html>