package kz.kaz.javaEE.entity;

public class Shop {
    Long id;
    String user;
    String product;
    int price;

    public Shop(){}

    public Shop(Long id, String user, String product, int price) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
