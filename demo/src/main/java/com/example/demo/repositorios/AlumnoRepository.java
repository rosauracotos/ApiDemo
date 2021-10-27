package com.example.demo.repositorios;

import com.example.demo.entidades.Alumno;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends BaseRepository<Alumno, Long> {
}
