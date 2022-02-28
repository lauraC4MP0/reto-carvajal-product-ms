package rc.product_ms.models;

public class WishIt {
    private User user;
    private Integer idProduct;
    
    public WishIt(User user, Integer idProduct){
        this.user=user;
        this.idProduct=idProduct;
    }

    public User getuser(){
        return this.user;
    }

    public Integer getIdProduct(){
        return this.idProduct;
    }
}
