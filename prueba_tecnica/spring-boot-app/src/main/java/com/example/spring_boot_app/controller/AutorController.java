package com.example.spring_boot_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_app.dto.AutorDTO;
import com.example.spring_boot_app.service.AutorService;


@RestController
@RequestMapping("/api/v1/biblioteca")
public class AutorController {
    
    @Autowired
    private AutorService autorService;

    //Método para guardar autores y recibir como parámetro un objeto de tipo autor
    @PostMapping
    public ResponseEntity<AutorDTO> save(@RequestBody AutorDTO autorDTO) {
        return new ResponseEntity<>( autorService.save(autorDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AutorDTO>> findAll() {
        return new ResponseEntity<>(autorService.findAll(), HttpStatus.OK);
    }

    //La anotación path variable recibe como parámetro lo que viene en la Url en el elemento id
    @GetMapping("/{id}")
    public ResponseEntity<AutorDTO> findById(@PathVariable Integer id){
        try{
            return  new ResponseEntity<>(autorService.findById(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById( @PathVariable Integer id){
        try
        {
            autorService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
