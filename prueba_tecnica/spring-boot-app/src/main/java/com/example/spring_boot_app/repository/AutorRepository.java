package com.example.spring_boot_app.repository;

import org.springframework.stereotype.Repository;
import com.example.spring_boot_app.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer>{
}
