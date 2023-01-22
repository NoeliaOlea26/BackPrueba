package com.practica.SBoot1.Controller;

import com.practica.SBoot1.model.Persona;
import com.practica.SBoot1.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

    @Autowired
    private IPersonaService persServ;
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
    persServ.crearPersona(pers);
    }
    
    /**
     *
     * @return
     */
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
     return persServ.verPersonas();
    }
    
    @DeleteMapping("delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persServ.borrarPersona(id);
    }
}
