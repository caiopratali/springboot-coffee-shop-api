package br.com.pratali.coffee_shop.repository;

import br.com.pratali.coffee_shop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
