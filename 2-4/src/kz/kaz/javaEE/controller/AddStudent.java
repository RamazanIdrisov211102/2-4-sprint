package kz.kaz.javaEE.controller;


import kz.kaz.javaEE.entity.Student;
import kz.kaz.javaEE.list.StudentList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addStudent")
public class AddStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/addStudent.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String group = req.getParameter("group");
        Student s = new Student(null, name, surname, group);
        StudentList.addStudent(s);
        resp.sendRedirect("/addStudent?success");
    }
}
