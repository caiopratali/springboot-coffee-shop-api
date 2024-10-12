package br.com.pratali.coffee_shop.repository;

import br.com.pratali.coffee_shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
