package rc.product_ms.models;

public class Product {
    private String name;
    private Integer price;
    private Integer stock;

    public Product(String name, Integer price, Integer stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
    }

    public String getName() {
        return name;        
    }

    public Integer getPrice(){
        return price;
    }

    public Integer getStock(){
        return stock;
    }

    public void setStock(Integer stock){
        this.stock=stock;
    }
}
