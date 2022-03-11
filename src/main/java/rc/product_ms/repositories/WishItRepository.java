package rc.product_ms.repositories;
import rc.product_ms.models.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface WishItRepository extends MongoRepository<WishIt, Integer>{
    List<Product> findByIdUser(Integer idUser);
}
