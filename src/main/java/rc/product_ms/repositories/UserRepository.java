package rc.product_ms.repositories;
import rc.product_ms.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer>{
    User findBy(Integer id);
}
