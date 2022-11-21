package com.sebastianrod.concursoandroidspring.rest;

import com.sebastianrod.concursoandroidspring.model.Marca;
import com.sebastianrod.concursoandroidspring.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("marca")
public class MarcaRestController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping("/all")
    public ResponseEntity<?> marca_get(){
        Collection<Marca> marcas = marcaService.findAll();
        if (marcas.isEmpty()){
            return new ResponseEntity<>("No hay marcas!", HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(marcas, HttpStatus.OK);
        }
    }

}
