package com.sebastianrod.concursoandroidspring.repository;

import com.sebastianrod.concursoandroidspring.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
