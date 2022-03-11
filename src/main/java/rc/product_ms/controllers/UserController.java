package rc.product_ms.controllers;
//import rc.product_ms.exceptions.*;
import rc.product_ms.models.User;
import rc.product_ms.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserRepository userRepository;
    public UserController(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @GetMapping("/getUsers/{id}")
    User getUser(@PathVariable Integer id){
        User user=userRepository.findBy(id);
        return user;
    }

    @PostMapping("/users")
    User newUser(@RequestBody User user){
        return userRepository.save(user);
    }
    
}
