package tacos.data;

import org.springframework.data.jpa.repository.JpaRepository;
import tacos.model.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends JpaRepository<Taco, Long> {

}
