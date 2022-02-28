package rc.product_ms.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
@ResponseBody
public class ProductNoLongerAvailableAdvice {
    @ResponseBody
    @ExceptionHandler(ProductNoLongerAvailableException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntityNotFoundAdvice(ProductNoLongerAvailableException ex){
        return ex.getMessage();
    }
}
