package dk.kea.spring_mvc.repository;

import Model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    //collection for handling test data
    private List<Product> products = new ArrayList<>();

    public ProductRepository(){
        //fill in test data
        this.products.add(new Product(1, "Æble", 5, "Pink Lady"));
        this.products.add(new Product(2, "Mælk", 9, "Arla"));
        this.products.add(new Product(3, "Cola", 10, "Coca-cola"));
    }

    public List<Product> readAll(){
        return products;
    }

    //add new animal to collection
    public void create(Product product){
        products.add(product);
    }
}
