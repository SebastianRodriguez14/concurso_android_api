package com.sebastianrod.concursoandroidspring.service;

import com.sebastianrod.concursoandroidspring.model.Prenda;
import com.sebastianrod.concursoandroidspring.repository.PrendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PrendaServiceImpl implements PrendaService {

    @Autowired
    private PrendaRepository prendaRepository;

    @Override
    public Collection<Prenda> findAll() {
        return prendaRepository.findAll();
    }

    @Override
    public Prenda findById(Integer prenda_id) {
        return prendaRepository.findById(prenda_id).orElse(null);
    }

    @Override
    public Prenda insert(Prenda prenda) {
        return prendaRepository.save(prenda);
    }

    @Override
    public Prenda update(Prenda prenda) {
        return prendaRepository.save(prenda);
    }

    @Override
    public void delete(Integer prenda_id) {
        prendaRepository.deleteById(prenda_id);
    }
}
