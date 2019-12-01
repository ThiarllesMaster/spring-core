package product;

import org.springframework.data.repository.CrudRepository;

public interface ProductService extends CrudRepository<Product, Long> {

}
