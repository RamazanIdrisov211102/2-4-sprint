package kz.kaz.javaEE.list;

import kz.kaz.javaEE.entity.Shop;

import java.util.ArrayList;

import static java.lang.System.out;

public class List {
    private static ArrayList<Shop> shops= new ArrayList<>();


    static
    {
        shops.add(new Shop(1L, "Akmaral Izbasarova", "Microwave", 100000));
        shops.add(new Shop(2L, "Sanzhar Uali", "TV", 200000));
        shops.add(new Shop(3L, "Aituar Torebekov", "Oven", 150000));
        shops.add(new Shop(4L, "Samal Rymbayeva", "Laptop", 300000));

    }



    private static Long id = 5L;
    public static void addShop(Shop shop){
        shop.setId(id);
        shops.add(shop);
        id++;
    }
    public static ArrayList<Shop> getAllShops(){
        return shops;
    }





}
