
package com.portafolio.seba.Repositorio;

import com.portafolio.seba.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends JpaRepository<Persona,Long> {
    
}
