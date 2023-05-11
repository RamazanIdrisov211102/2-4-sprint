package kz.kaz.javaEE.controller;

import kz.kaz.javaEE.entity.Book;
import kz.kaz.javaEE.entity.Shop;
import kz.kaz.javaEE.entity.Student;
import kz.kaz.javaEE.list.BookList;
import kz.kaz.javaEE.list.List;
import kz.kaz.javaEE.list.StudentList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

@WebServlet("/main")
public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ArrayList<Student> students = StudentList.getAllStudents();
            req.setAttribute("student", students);

            ArrayList<Book> books= BookList.getAllBooks();
            req.setAttribute("book", books);
        req.getRequestDispatcher("/main.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
