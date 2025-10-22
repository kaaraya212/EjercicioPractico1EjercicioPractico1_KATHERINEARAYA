package repository;

import domain.Queja;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kathe
 */
public interface QuejaRepository extends JpaRepository<Queja, Long> {

    List<Queja> findByTratadoFalse();
}
