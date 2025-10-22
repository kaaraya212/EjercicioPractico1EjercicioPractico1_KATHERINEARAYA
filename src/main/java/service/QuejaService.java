package service;

import domain.Queja;
import repository.QuejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author kathe
 */
@Service
public class QuejaService {

    @Autowired
    private QuejaRepository quejaRepository;

    @Transactional(readOnly = true)
    public List<Queja> getNoTratadas() {
        return quejaRepository.findByTratadoFalse();
    }

    @Transactional
    public void save(Queja queja) {
        quejaRepository.save(queja);
    }
}
