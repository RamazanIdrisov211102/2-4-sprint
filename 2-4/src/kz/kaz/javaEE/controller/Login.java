package kz.kaz.javaEE.controller;

import kz.kaz.javaEE.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirect = "/login";

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        User checkUser = User.getUser(login);

        if(checkUser!=null){

            if(checkUser.getPassword().equals(password)){
                redirect = "/main";
                HttpSession session = request.getSession();
                session.setAttribute("Current_User", checkUser);
            }else{
                redirect = "/login?passworderror";
            }
        }else{
            redirect = "/login?loginerror";
        }
        response.sendRedirect(redirect);
    }
}


