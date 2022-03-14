package rc.product_ms.controllers;
import rc.product_ms.exceptions.ProductNoLongerAvailableException;
import rc.product_ms.exceptions.UserNotFoundException;
//import rc.product_ms.exceptions.*;
import rc.product_ms.models.User;
import rc.product_ms.repositories.ProductRepository;
import rc.product_ms.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    public UserController(UserRepository userRepository, ProductRepository productRepository){
        this.userRepository=userRepository;
        this.productRepository=productRepository;
    }

    @GetMapping("/user/getUser/{userId}")
    User getUser(@PathVariable Integer userId){
        System.out.println(userId);
        User user=userRepository.findBy(userId);
        System.out.println(user);
        return user;
    }

    @PostMapping("/user")
    User newUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/user/update/{userId}")
    User updateUser(@RequestAttribute Integer userId, String productName){
        try{
            User user=userRepository.findBy(userId);
            try{
                System.out.println(user.getWishIt());
                user.getWishIt().add(productRepository.findByName(productName));
                return user;
            }catch(ProductNoLongerAvailableException e){
                throw new ProductNoLongerAvailableException("No existe ningún producto con el nombre "+productName);
            }
        }catch(UserNotFoundException e){
            throw new UserNotFoundException("No existe ningún usuario con el id "+userId);
        }
    }
    
}
