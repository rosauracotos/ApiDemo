package com.example.demo.servicios;

import com.example.demo.entidades.Alumno;
import com.example.demo.repositorios.AlumnoRepository;
import com.example.demo.repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AlumnoServiceImpl extends BaseServiceImpl<Alumno, Long> implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(BaseRepository<Alumno, Long> baseRepository){
        super(baseRepository);
    }


}
