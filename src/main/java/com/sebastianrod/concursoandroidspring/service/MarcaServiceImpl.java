package com.sebastianrod.concursoandroidspring.service;

import com.sebastianrod.concursoandroidspring.model.Marca;
import com.sebastianrod.concursoandroidspring.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MarcaServiceImpl implements MarcaService {

    @Autowired
    public MarcaRepository marcaRepository;

    @Override
    public Collection<Marca> findAll() {
        return marcaRepository.findAll();
    }

    @Override
    public Marca findById(Integer marca_id) {
        return marcaRepository.findById(marca_id).orElse(null);
    }


}
