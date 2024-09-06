package com.example.spring_boot_app.dto;


import com.example.spring_boot_app.model.Libro;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@NoArgsConstructor
public class LibroDTO {
    private Integer id;
    private String isbn;
    private String nombre;
    private String editorial;
    private String genero;
    private int numeroPaginas;
    private BigDecimal precio;
    private LocalDate fechaEdicion;
    private AutorDTO autorDto;
    private Integer idAutor;

    public LibroDTO(Libro libro) {
        this.id = libro.getId();
        this.isbn = libro.getIsbn();
        this.nombre = libro.getNombre();
        this.editorial = libro.getEditorial();
        this.genero = libro.getGenero();
        this.numeroPaginas = libro.getNumeroPaginas();
        this.precio = libro.getPrecio();
        this.fechaEdicion = libro.getFechaEdicion();
        //this.autorDto = new AutorDTO(libro.getAutor());
        this.idAutor = libro.getAutor().getId();  // Inicializa el idAutor
    }

        // Getter
        public Integer getIdAutor() {
            return idAutor;
        }
    
        // Setter para idAutor
        public void setIdAutor(Integer idAutor) {
            this.idAutor = idAutor;
        }
}
