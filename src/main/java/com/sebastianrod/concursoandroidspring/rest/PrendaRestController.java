package com.sebastianrod.concursoandroidspring.rest;

import com.sebastianrod.concursoandroidspring.model.Marca;
import com.sebastianrod.concursoandroidspring.model.Prenda;
import com.sebastianrod.concursoandroidspring.service.MarcaService;
import com.sebastianrod.concursoandroidspring.service.PrendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("prenda")
public class PrendaRestController {

    @Autowired
    private PrendaService prendaService;

    @Autowired
    private MarcaService marcaService;

    @GetMapping("/all")
    public ResponseEntity<?> prenda_get(){
        Collection<Prenda> prendas = prendaService.findAll();
        if (prendas.isEmpty()){
            return new ResponseEntity<>("No hay marcas!", HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(prendas, HttpStatus.OK);
        }
    }


    @GetMapping("/all/{id}")
    public ResponseEntity<?> prenda_getById(@PathVariable(name = "id") Integer prenda_id){
        Prenda prenda = prendaService.findById(prenda_id);
        if (prenda != null) {
            return new ResponseEntity<>(prenda, HttpStatus.OK);
        } else{
            return new ResponseEntity<>("Prenda no encontrada!", HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/add")
    public ResponseEntity<?> prenda_post(@RequestBody Prenda prenda){

        if (marcaService.findById(prenda.getMarca().getMarca_id()) == null){
            return new ResponseEntity<>("Marca no encontrada!", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(prendaService.insert(prenda), HttpStatus.CREATED);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> prenda_put(@RequestBody Prenda prenda, @PathVariable(name = "id") Integer prenda_id){
        if (prendaService.findById(prenda_id) != null) {
            if (marcaService.findById(prenda.getMarca().getMarca_id()) == null){
                return new ResponseEntity<>("Marca no encontrada!", HttpStatus.NOT_FOUND);
            } else {
                prenda.setPrenda_id(prenda_id);
                prendaService.update(prenda);
                return new ResponseEntity<>("Prenda actualizada!", HttpStatus.OK);
            }
        } else{
            return new ResponseEntity<>("Prenda no encontrada!", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> prenda_delete(@PathVariable(name = "id") Integer prenda_id){
        if (prendaService.findById(prenda_id) != null) {
            prendaService.delete(prenda_id);
            return new ResponseEntity<>("Prenda eliminada correctamente", HttpStatus.OK);
        } else{
            return new ResponseEntity<>("Prenda no encontrada!", HttpStatus.NOT_FOUND);
        }
    }


}
