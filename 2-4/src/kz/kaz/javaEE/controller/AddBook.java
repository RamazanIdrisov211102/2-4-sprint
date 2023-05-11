package kz.kaz.javaEE.controller;


import kz.kaz.javaEE.entity.Book;
import kz.kaz.javaEE.list.BookList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addBook")
public class AddBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/addBook.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String isbn = req.getParameter("isbn");
        int year = Integer.parseInt(req.getParameter("year"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        Book b = new Book(null, title, author, isbn, year, quantity);
        BookList.addBook(b);
        resp.sendRedirect("/addBook?success");
    }
}
