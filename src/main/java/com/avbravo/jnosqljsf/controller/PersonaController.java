package com.avbravo.jnosqljsf.controller;

import com.avbravo.jnosqljsf.model.Persona;
import com.avbravo.jnosqljsf.persistence.PersonaRepository;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import java.util.List;
import java.util.function.Supplier;

import javax.inject.Inject;

import javax.ws.rs.WebApplicationException;

import org.jnosql.artemis.Database;
import org.jnosql.artemis.DatabaseType;

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class PersonaController implements Serializable {

    List<Persona> personaList = new ArrayList<>();
    Persona persona = new Persona();
    private static final Supplier<WebApplicationException> NOT_FOUND_EXCEPTION = () -> new WebApplicationException(NOT_FOUND);

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Inject
    @Database(DatabaseType.DOCUMENT)
    private PersonaRepository repository;

    public List<Persona> list() {
        return repository.findAll();
    }

    public String save() {
        repository.save(persona);
        addMessage("Guaraddo");
        return "";
    }

    public String update() {

        repository.save(persona);
        return "";
    }

    public String delete() {

        repository.deleteById(persona.getId());
        return "";
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
