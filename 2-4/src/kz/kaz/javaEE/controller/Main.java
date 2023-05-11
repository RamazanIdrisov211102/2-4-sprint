package kz.kaz.javaEE.controller;

import kz.kaz.javaEE.entity.Shop;
import kz.kaz.javaEE.list.List;

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
        ArrayList<Shop> shops = List.getAllShops();
        if (shops != null) {
            for (Shop shop : shops) {
                System.out.println(shop.getUser()+" "+shop.getProduct()+" "+shop.getProduct());
            }
        }

        Scanner in=new Scanner(System.in);
        String user=in.next();
        String product =in.next();
        int price=in.nextInt();
        Shop shop = new Shop(null, user, product, price);
        List.addShop(shop);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
