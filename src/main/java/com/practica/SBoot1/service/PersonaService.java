/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.SBoot1.service;

import com.practica.SBoot1.model.Persona;
import com.practica.SBoot1.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noelia Olea
 */
@Service
public class PersonaService implements IPersonaService {

    
    @Autowired
    public PersonaRepository persRepo;
    @Override
    public List<Persona> verPersonas() {
        return persRepo.findAll();
    }

    @Override
    public void crearPersona(Persona pers) {
        persRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persRepo.findById(id).orElse(null);
    }
    
}
