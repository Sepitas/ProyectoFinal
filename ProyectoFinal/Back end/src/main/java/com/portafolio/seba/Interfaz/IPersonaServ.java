
package com.portafolio.seba.Interfaz;

import com.portafolio.seba.Entidad.Persona;
import java.util.List;



public interface IPersonaServ {
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
    
}
