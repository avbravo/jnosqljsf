package com.avbravo.jnosqljsf.persistence;

import org.jnosql.artemis.Repository;


import com.avbravo.jnosqljsf.model.Persona;

import java.util.List;

public interface PersonaRepository extends Repository<Persona, String> {

    List<Persona> findAll();
}
