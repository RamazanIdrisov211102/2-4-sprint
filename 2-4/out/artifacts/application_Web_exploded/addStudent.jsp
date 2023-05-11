<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

</head>
<body>

<div class="container">
    <div class="row mt-5">
        <div class="col-sm-6 offset-3">
            <%
                String success = request.getParameter("success");
                if (success!=null){
            %>

            <div class="alert alert-success alert-dismissible fade show" role="alert">
                Added successfully!
            </div>

            <%
                }
            %>

            <form action="/addStudent" method="post">
                <div class="mb-3">
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
                    <button type="submit" class="btn btn-success">Add Student</button>
                </div>
            </form>
                <a class="btn btn-info btn-sm" href="/main">Go to main page</a>

        </div>
    </div>
</div>

</body>
</html>
