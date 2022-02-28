package rc.product_ms.repositories;
import rc.product_ms.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String>{
    Product findByName(String name);
}
