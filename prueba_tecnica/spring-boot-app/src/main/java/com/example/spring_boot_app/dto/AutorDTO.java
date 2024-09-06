package com.example.spring_boot_app.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import com.example.spring_boot_app.model.Autor;

@Data
@NoArgsConstructor //Constructor para deserializar
public class AutorDTO {
    private Integer id;
    private String nombres;
    private String apellidos;
    private String telefono;

    //Permite convertir objetos de tipo Autor a AutorDTO para traer info desde la BD
    public AutorDTO(Autor autor) {
        this.id = autor.getId();
        this.nombres = autor.getNombres();
        this.apellidos = autor.getApellidos();
        this.telefono = autor.getTelefono();
        /*private List<LibroDTO> libroDTO;

        this.libroDTO = new ArrayList<>();
        autor.getLibros().forEach(
                libro -> libroDTO.add(new LibroDTO(libro))
        );
        */
    }

}
