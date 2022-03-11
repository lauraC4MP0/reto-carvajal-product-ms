package rc.product_ms.controllers;
//import rc.product_ms.exceptions.*;
import rc.product_ms.models.*;
//import rc.product_ms.repositories.UserRepository;
import rc.product_ms.repositories.*;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
public class WishItController {
    private final WishItRepository wishItRepository;
    //private final ProductRepository productRepository;
    public WishItController(WishItRepository wishItRepository){
        this.wishItRepository=wishItRepository;
        //this.productRepository=productRepository;
    }

    @GetMapping("/wishit/{idUser}")
    List<Product> getWishIt(@PathVariable Integer idUser){
        return wishItRepository.findByIdUser(idUser);
    }

    @PostMapping("/wishit")
    WishIt newWishIt(@RequestBody WishIt wishIt){
        return wishItRepository.save(wishIt);
    }
    
}
