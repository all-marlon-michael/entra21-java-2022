package com.entra21.springproject.controller;

import com.entra21.springproject.model.entity.FranquiaEntity;
import com.entra21.springproject.view.repository.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/franquias")
public class FranquiaRestController {
    @Autowired // create a singleton of FranquiaRepository
    private FranquiaRepository franquiaRepository;

    @GetMapping
    public List<FranquiaEntity> getFranquias(){
        return franquiaRepository.;
    }

    @PostMapping
    public void addFranquia(@RequestBody FranquiaEntity entity){
        franquiaRepository.save(entity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FranquiaEntity> getFranquia(@PathVariable(name = "id") Long id){
        Optional<FranquiaEntity> franquia = franquiaRepository.findById(id);
        if (franquia.isPresent()) return ResponseEntity.ok(franquia.get());
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public void deleteFranquia(@PathVariable(name = "id") Long id){
        franquiaRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateFranquia(@PathVariable(name = "id") Long id, @RequestBody FranquiaEntity entity){
        franquiaRepository.
    }
}
