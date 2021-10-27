package com.example.demo.servicios;

import com.example.demo.entidades.Persona;
import com.example.demo.repositorios.BaseRepository;
import com.example.demo.repositorios.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicioImpl extends BaseServiceImpl<Persona ,Long> implements PersonaService {
    @Autowired
    private PersonaRepositorio personaRepositorio;

    public PersonaServicioImpl(BaseRepository<Persona, Long> baseRepository){
       super(baseRepository);
    }

}
