package com.example.demo.repositorios;

import com.example.demo.entidades.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepositories extends BaseRepository<Autor, Long>{
}
