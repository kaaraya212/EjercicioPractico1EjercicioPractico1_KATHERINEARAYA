package repository;

import domain.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kathe
 */
public interface LibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findByDisponibleTrue();
}
