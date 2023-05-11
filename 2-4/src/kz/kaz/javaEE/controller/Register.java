package kz.kaz.javaEE.controller;

import kz.kaz.javaEE.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/register.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirect = "/register";

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String group = request.getParameter("group");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String rePassword = request.getParameter("re_password");
        User checkUser = User.getUser(login);

        if(checkUser == null){
            if(password.equals(rePassword)){
                User.addUser(new User(null, name, surname, group, login, password));
                redirect = "/main";
            }
            else{
                redirect = "/register?passworderror";
            }
        }else{
            redirect = "/register?loginerror";
        }
        response.sendRedirect(redirect);
    }
}
