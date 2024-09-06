//Esto va a permitir que podamos poder acceder a las base de datos para los diferentes métodos CRUD

package com.example.spring_boot_app.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring_boot_app.model.Libro;


@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{
}

