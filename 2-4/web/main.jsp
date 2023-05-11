<%@ page import="kz.kaz.javaEE.entity.Student" %>
<%@ page import="kz.kaz.javaEE.entity.Book" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

</head>
<body>

<a href="/addStudent" class="btn btn-info btn-sm">Add Student</a>
<div class="container">
    <div class="row mt-5">
        <div class="col-sm-12">
            <table class="table">
                <thead>
                <tr>
                    <th>Name:</th>
                    <th>Surname:</th>
                    <th>Group:</th>
                </tr>
                </thead>
                <tbody>
                <%
                    ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("student");
                    if (students!= null){
                        for (Student s : students){
                %>
                <tr>

                    <td>
                        <%=s.getName()%>
                    </td>
                    <td>
                        <%=s.getSurname()%>
                    </td>
                    <td>
                        <%=s.getGroup()%>
                    </td>
                </tr>
                <%
                        }
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>

<a href="/addBook" class="btn btn-info btn-sm">Add Book</a>
<div class="container">
    <div class="row mt-5">
        <div class="col-sm-12">
            <table class="table">
                <thead>
                <tr>
                    <th>Title:</th>
                    <th>Author:</th>
                    <th>ISBN:</th>
                    <th>Year:</th>
                    <th>Quantity:</th>
                </tr>
                </thead>
                <tbody>
                <%
                    ArrayList<Book> books = (ArrayList<Book>) request.getAttribute("book");
                    if (books!= null){
                        for (Book b : books){
                %>
                <tr>

                    <td>
                        <%=b.getTitle()%>
                    </td>
                    <td>
                        <%=b.getAuthor()%>
                    </td>
                    <td>
                        <%=b.getIsbn()%>
                    </td>
                    <td>
                        <%=b.getYear()%>
                    </td>
                    <td>
                        <%=b.getQuantity()%>
                    </td>
                </tr>
                <%
                        }
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
