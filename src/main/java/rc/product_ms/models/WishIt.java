package rc.product_ms.models;

public class WishIt {
    private Integer idUser;
    private Integer idProduct;
    
    public WishIt(Integer idUser, Integer idProduct){
        this.idUser=idUser;
        this.idProduct=idProduct;
    }

    public Integer getIduser(){
        return this.idUser;
    }

    public Integer getIdProduct(){
        return this.idProduct;
    }
}
