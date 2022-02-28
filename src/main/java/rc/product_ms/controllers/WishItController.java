package rc.product_ms.controllers;
//import rc.product_ms.exceptions.*;
import rc.product_ms.models.*;
import rc.product_ms.repositories.UserRepository;
import rc.product_ms.repositories.WishItRepository;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
public class WishItController {
    private final WishItRepository wishItRepository;
    private final UserRepository userRepository;
    public WishItController(WishItRepository wishItRepository, UserRepository userRepository){
        this.wishItRepository=wishItRepository;
        this.userRepository=userRepository;
    }

    @GetMapping("/wishit/{idUser}")
        List<Product> getWishIt(@PathVariable Integer idUser){
            User user=(User) userRepository.findBy(idUser);
            List<Product> products=wishItRepository.findByUser(user);
            return products;
    }
    
}
