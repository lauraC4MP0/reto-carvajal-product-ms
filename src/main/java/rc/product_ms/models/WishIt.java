package rc.product_ms.models;

public class WishIt {
    private Integer idUser;
    private Product product;
    
    public WishIt(Integer idUser, Product product){
        this.idUser=idUser;
        this.product=product;
    }

    public Integer getIdUser(){
        return this.idUser;
    }

    public Product getProduct(){
        return this.product;
    }
}
