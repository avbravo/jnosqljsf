/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jnosqljsf.model;

import java.util.Objects;
import javax.validation.constraints.NotEmpty;
import javax.ws.rs.FormParam;
import org.jnosql.artemis.Column;
import org.jnosql.artemis.Embeddable;

/**
 *
 * @author avbravo
 */
@Embeddable
public class Direccion {

    @Column
    @NotEmpty
    private String pais;

    @Column
    @NotEmpty
    private String estado;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
      Direccion direccion = (Direccion) o;
        return Objects.equals(pais, direccion.pais)
                && Objects.equals(estado, direccion.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pais, estado);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Direccion{");
        sb.append("pais='").append(pais).append('\'');
        sb.append(", estado='").append(estado).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
