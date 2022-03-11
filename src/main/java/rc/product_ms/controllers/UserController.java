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

    @GetMapping("/getUsers/{id}")
    User getUser(@PathVariable Integer id){
        try{
        System.out.println(id+"");
        System.out.println(userRepository.findBy(id));
        //System.out.println(user.toString());
        return null;
        }catch(UserNotFoundException e){
            e.getMessage();
            throw new UserNotFoundException("No existe ningún usuario con el id "+id);
        }
    }

    @PostMapping("/users")
    User newUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/users/update/{userId}")
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
