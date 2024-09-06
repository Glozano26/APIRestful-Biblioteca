package com.example.spring_boot_app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.spring_boot_app.dto.LibroDTO;
import com.example.spring_boot_app.model.Libro;

@Service
public class FabricaLibroService {
        public Libro crearLibro(LibroDTO libroDTO) {
        return new Libro(libroDTO);
    }

    public LibroDTO crearLibroDTO(Libro libro) {
        return new LibroDTO(libro);
    }

    //Esta lista recibe como parametro una lista de objetos libros
    public List<LibroDTO> crearLibrosDTO(List<Libro> libros) {
        List<LibroDTO> libroDTOS = new ArrayList<>();
        libros.stream().forEach(
                libro -> {
                    libroDTOS.add(new LibroDTO(libro));
                }
        );
        return libroDTOS;

    }
}
