<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book</title>
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

            <form action="/addBook" method="post">
                <div class="mb-3">
                    <label >Title:</label>
                    <input type="text" name="title" class="form-control" placeholder="Title">
                </div>
                <div class="form-group">
                    <label>Author:</label>
                    <input type="text" name="author" class="form-control" placeholder="Author">
                </div>
                <div class="form-group">
                    <label>ISBN:</label>
                    <input type="text" name="isbn" class="form-control" placeholder="ISBN">
                </div>
                <div class="form-group">
                    <label>Year:</label>
                    <input type="number" name="year" class="form-control" placeholder="Year">
                </div>
                <div class="form-group">
                    <label>Quantity:</label>
                    <input type="number" name="quantity" class="form-control" placeholder="Quantity">
                </div>

                <div class="form-group">
                    <button type="submit" class="btn btn-success">Add Book</button>
                </div>
            </form>
            <a class="btn btn-info btn-sm" href="/main">Go to main page</a>

        </div>
    </div>
</div>

</body>
</html>
