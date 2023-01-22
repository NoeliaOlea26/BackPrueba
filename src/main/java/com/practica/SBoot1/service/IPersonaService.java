/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica.SBoot1.service;

import com.practica.SBoot1.model.Persona;
import java.util.List;

/**
 *
 * @author Noelia Olea
 */
public interface IPersonaService {
    public List<Persona> verPersonas ();
    
    public void crearPersona (Persona pers);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona (Long id);
    
}
