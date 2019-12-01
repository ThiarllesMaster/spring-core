package product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

	@Autowired
	ProductService productService;
	
	public void saveProduct(Product product) {
		productService.save(product);
	}
}
