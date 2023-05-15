
package com.portafolio.seba.Servicio;

import com.portafolio.seba.Entidad.Persona;
import com.portafolio.seba.Interfaz.IPersonaServ;
import com.portafolio.seba.Repositorio.IPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ImpPersonaServ implements IPersonaServ{
        @Autowired IPersona ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona ;
        
    }

    @Override
    public void savePersona(Persona persona) {

           ipersonaRepository.save(persona);
           

    }

    @Override
    public void deletePersona(Long id) {
            ipersonaRepository.deleteById(id);


    }

    @Override
    public Persona findPersona(Long id) {

           Persona persona = ipersonaRepository.findById(id).orElse(null);
           return persona;
           
    }
    
}
