package com.example.spring_boot_app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.spring_boot_app.dto.LibroDTO;
import com.example.spring_boot_app.service.LibroService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/v1/biblioteca/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping
    public ResponseEntity<LibroDTO> save(@RequestBody LibroDTO libroDTO){
        try{
            return  new ResponseEntity<>(libroService.save(libroDTO), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    //Metodo para que retorne todos los libros
    @GetMapping
    public ResponseEntity<List<LibroDTO>> findAll(){
        return new ResponseEntity<>(libroService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibroDTO> findById(@PathVariable Integer id){
        try{
            return new ResponseEntity<>(libroService.findById(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id ){
        try{
            libroService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}