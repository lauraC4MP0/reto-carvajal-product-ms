package rc.product_ms.controllers;
//import rc.product_ms.exceptions.*;
import rc.product_ms.models.Product;
import rc.product_ms.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private final ProductRepository productRepository;
    public ProductController(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    
    @GetMapping("/products/{name}")
    Product getProduct(@PathVariable String name){
        Product product=productRepository.findByName(name);
        //.orElseThrow(()->new ProductNoLongerAvailableAdvice());
        return product;
    }

    @PostMapping("/products")
    Product newProduct(@RequestBody Product product){
        Product p=product;
        p.setName(product.getName());
        p.setPrice(product.getPrice());
        p.setStock(product.getStock());
        return productRepository.save(p);
    }

    @PutMapping("product/update/{name}")
    Product updateProduct(@RequestBody Product product){
        Product p=productRepository.findByName(product.getName());
        //.orElseThrow(()->new ProductNoLongerAvailableAdvice("Desafortunadamente, ya no tenemos disponibilidad del producto "+name));
        p.setStock(product.getStock());
        productRepository.save(p);
        return p;
    }
}

