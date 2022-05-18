package tacos.data;

import org.springframework.data.jpa.repository.JpaRepository;
import tacos.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
