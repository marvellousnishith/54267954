package com.nisheeth.demo.rest;

import com.nisheeth.demo.entity.AEntity;
import com.nisheeth.demo.repo.ARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "a")
public class Controller {

    @Autowired
    private ARepository repository;

    @DeleteMapping(path = "{id}")
    public ResponseEntity delete(@PathVariable long id) {
        repository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Transactional(propagation = Propagation.REQUIRED)
    public ResponseEntity<AEntity> get(@PathVariable long id) {
        return ResponseEntity.ok(repository.findById(id).orElse(null));
    }
}
