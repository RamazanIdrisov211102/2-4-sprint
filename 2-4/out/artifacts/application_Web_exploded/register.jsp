<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10.03.2023
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

</head>
<body>

<div class="container">
    <div class="row mt-5">
        <div class="col-sm-6 offset-3">
            <%
                String loginError =request.getParameter("loginerror");
                String passwordError =request.getParameter("passworderror");
            %>
            <%
                if(loginError!=null){
            %>
            <div class="alert alert-success alert-dismissible fade show" role="alert">
                This login already exists!
            </div>
            <%
                }if(passwordError!=null){
            %>
            <div class="alert alert-success alert-dismissible fade show" role="alert">
                Password doesn't match!
            </div>
            <%
                }
            %>

            <form action="/register" method="post">
                <div class="form-group">
                    <label >Name:</label>
                    <input type="text" name="name" class="form-control" placeholder="Name">
                </div>
                <div class="form-group">
                    <label>Surname:</label>
                    <input type="text" name="surname" class="form-control" placeholder="Surname">
                </div>
                <div class="form-group">
                    <label>Group:</label>
                    <input type="text" name="group" class="form-control" placeholder="Group">
                </div>
                <div class="form-group">
                    <label>Login:</label>
                    <input type="text" name="login" class="form-control" placeholder="Login">
                </div>
                <div class="form-group">
                    <label>Password:</label>
                    <input type="text" name="password" class="form-control" placeholder="Password">
                </div>
                <div class="form-group">
                    <label>Retype password:</label>
                    <input type="text" name="re_password" class="form-control" placeholder="Retype password">
                </div>
                <br>
                <div class="form-group">
                    <button type="submit" class="btn btn-success">Sign Up</button>
                </div>
            </form>

        </div>
    </div>
</div>

</body>
</html>
