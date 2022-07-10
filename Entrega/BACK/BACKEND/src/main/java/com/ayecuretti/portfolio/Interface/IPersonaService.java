
package com.ayecuretti.portfolio.Interface;

import com.ayecuretti.portfolio.entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List <Persona> getPersona();
            
    //Guardar un objeto de tipo Persoa
            public void savePersona(Persona persona);
            
     //Eliminar usuario
            public void deletePersona (Long id);
            
     //Buscar una persona por ID
            public Persona findPersona(Long id);
    
}
