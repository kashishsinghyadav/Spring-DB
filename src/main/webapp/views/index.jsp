<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Add Two Numbers</title>

    <!-- Linking CSS -->
    <link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>

<div class="container">

    <h2>Add Two Numbers</h2>

    <form action="adddetails">

        <input type="number" name="sno" id="sno" placeholder="RollNo Number" required>
        <br>

        <input type="text" name="sname" id="sname" placeholder="Second Number" required>
        <br>

        <button type="submit">Add</button>

    </form>

</div>

</body>
</html>