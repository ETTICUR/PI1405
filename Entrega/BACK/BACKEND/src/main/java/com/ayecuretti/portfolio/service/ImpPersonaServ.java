
package com.ayecuretti.portfolio.service;

import com.ayecuretti.portfolio.Interface.IPersonaService;
import com.ayecuretti.portfolio.entity.Persona;
import com.ayecuretti.portfolio.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaServ implements IPersonaService {
    @Autowired IPersonaRepository IPersonaRepository;

@Override
public List<Persona> getPersona(){
    List<Persona> persona =IPersonaRepository.findAll();
    return persona;
            }

@Override
public void savePersona (Persona persona){
    IPersonaRepository.save(persona);
    }
@Override
public void deletePersona (Long id){
    IPersonaRepository.deleteById(id);
}

public Persona findePersona(Long id){
    Persona persona = IPersonaRepository.fyndById(id).orElse(null);
                return persona;
}

    @Override
    public Persona findPersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    
     
    

