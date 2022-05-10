package tacos.repository;
import tacos.entity.Taco;
import org.springframework.data.repository.CrudRepository;
public interface TacoRepository extends CrudRepository<Taco,Long>{

}
