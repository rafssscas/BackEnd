package com.backend.rac.Interface;

import com.backend.rac.Entidad.Persona;
import java.util.List;

public interface IPersonaServicio {
    //traer una persona
    public List<Persona> getPersona();
    //guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    //eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    //buscar una persona por ID
    public Persona findPersona(Long id);
    
}
