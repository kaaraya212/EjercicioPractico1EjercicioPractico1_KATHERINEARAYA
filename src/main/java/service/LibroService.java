package service;

import domain.Libro;
import repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author kathe
 */
@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepo;

    public List<Libro> getLibrosDisponibles() {
        return libroRepo.findByDisponibleTrue();
    }

    public void save(Libro libro) {
        libroRepo.save(libro);
    }

    public void delete(Long id) {
        libroRepo.deleteById(id);
    }
}
