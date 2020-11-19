<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<form action="EmployeeController" method="post">
<div class="container">
<div class="row justify-content-center">
<h2>Registration Form</h2>
</div>
<div class="row justify-content-center">
<div class="form-group col-4">
<label for="name">Employee ID:</label>
<input type="text" class="form-control" name="id" placeholder="Id:" readonly="readonly">
</div></div>
<div class="row justify-content-center">
<div class="form-group col-4">
<label for="name">UserName:</label>
<input type="text" class="form-control"  placeholder="USERNAME:" name="username" required="required">
</div></div>
<div class="row justify-content-center">
<div class="form-group col-4">
<label for="name">Passowrd</label>
<input type="text" class="form-control"  placeholder="PASSWORD:" name="password" required="required" >
</div></div>
<div class="row justify-content-center">
<div class="form-group col-4">
<label for="name">Address:</label>
<input type="text" class="form-control"  placeholder="ADDRESS:" name="address" required="required">
</div></div>
<div class="row justify-content-center">
<div class="form-group col-4">
<label for="name">Email:</label>
<input type="text" class="form-control"  placeholder="EMAIL:" name="email" required="required">
</div></div>
<div class="row justify-content-center">
<div class="form-group col-4">
<label for="name">Date Of Birth:</label>
<input type="text" class="form-control"  placeholder="Date Of Birth:" name="dob" required="required">
</div></div>
<div class="row justify-content-center">
<div class="form-group">
<input type="submit" class="btn btn-primary" value="REGISTRATION">
<a href="loginController"><input type="button" class="btn btn-primary" value="Login"></a>
</form>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>