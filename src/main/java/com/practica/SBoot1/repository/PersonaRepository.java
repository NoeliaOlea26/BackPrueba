/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica.SBoot1.repository;

import com.practica.SBoot1.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Noelia Olea
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
