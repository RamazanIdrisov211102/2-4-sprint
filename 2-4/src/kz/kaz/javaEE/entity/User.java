package kz.kaz.javaEE.entity;

import java.util.ArrayList;

public class User {
    static Long id;
    String name;
    String surname;
    String group;
    String login;
    String password;

    public User() {}

    public User(Long id, String name, String surname, String group, String login, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User(1L, "Nazarov", "Nurlybek", "IT1-2004","nnnurlybek003@gmail.com","qwerty123"));
        users.add(new User(2L, "Cristiano", "Ronaldo", "CR-7","cristiano7@gmail.com","cr7777777"));
        users.add(new User(3L, "Messi", "Lionel", "LM-123","messi@mail.ru","leomessi"));
        users.add(new User(4L, "Samat", "Samatov", "SIS1-2020","saamat01@gmail.com","samat2022"));
    }

    public static User getUser(String login){
        for(User user : users){
            if(user.getLogin() == login){
                return user;
            }
        }
        return null;
    }

    public static void addUser(User u){
        u.setId(id);
        users.add(u);
        id++;
    }
}


