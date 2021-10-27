package com.example.demo.controladores;

import com.example.demo.entidades.Alumno;
import com.example.demo.servicios.AlumnoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/alumno")
public class AlumnoController extends BaseControllerImpl<Alumno, AlumnoServiceImpl>{
}
