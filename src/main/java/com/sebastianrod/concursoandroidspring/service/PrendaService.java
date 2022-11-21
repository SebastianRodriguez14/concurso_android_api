package com.sebastianrod.concursoandroidspring.service;

import com.sebastianrod.concursoandroidspring.model.Prenda;

import java.util.Collection;

public interface PrendaService {

    Collection<Prenda> findAll();
    Prenda findById(Integer prenda_id);
    Prenda insert(Prenda prenda);
    Prenda update(Prenda prenda);
    void delete(Integer prenda_id);

}
