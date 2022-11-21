package com.sebastianrod.concursoandroidspring.service;

import com.sebastianrod.concursoandroidspring.model.Marca;

import java.util.Collection;

public interface MarcaService {

    Collection<Marca> findAll();

    Marca findById(Integer marca_id);

}
