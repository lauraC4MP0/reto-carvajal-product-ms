package rc.product_ms.exceptions;

public class ProductNoLongerAvailableException extends RuntimeException {
    public  ProductNoLongerAvailableException(String message){
        super(message);
    }
}
