package com.example.demo.repositorios;


import org.springframework.stereotype.Repository;
import com.example.demo.entidades.Persona;

@Repository
public interface PersonaRepositorio extends BaseRepository<Persona,Long> {
}
