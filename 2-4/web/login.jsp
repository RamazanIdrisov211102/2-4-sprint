<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

</head>
<body>

<div class="container">
    <div class="row mt-5">
        <div class="col-sm-6 offset-3">
            <%
                String error = (String)request.getAttribute("error");
                if(error!=null){
            %>
            <div class="alert alert-success alert-dismissible fade show" role="alert">
                Error
            </div>

            <%
                }
            %>

            <form action="/login" method="post">
                <div class="form-group">
                    <label >Login:</label>
                    <input type="text" name="Login" class="form-control" placeholder="login">
                </div>
                <div class="form-group">
                    <label>Password:</label>
                    <input type="text" name="password" class="form-control" placeholder="password">
                </div>
                <br>
                <div class="form-group">
                    <button type="submit" class="btn btn-success">Sign In</button>
                </div>
            </form>

        </div>
    </div>
</div>

</body>
</html>
