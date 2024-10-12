package br.com.pratali.coffee_shop.repository;

import br.com.pratali.coffee_shop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
