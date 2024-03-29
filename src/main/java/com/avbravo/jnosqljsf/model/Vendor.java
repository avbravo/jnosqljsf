/*
 * Copyright (c) 2019 Otávio Santana and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 * You may elect to redistribute this code under either of these licenses.
 *
 * Contributors:
 *
 * Otavio Santana
 */

package com.avbravo.jnosqljsf.model;

import org.jnosql.artemis.Column;
import org.jnosql.artemis.Convert;
import org.jnosql.artemis.Entity;
import org.jnosql.artemis.Id;
import org.bson.types.Binary;

import java.util.Date;
import java.util.Set;

@Entity
public class Vendor {
    @Id
    private String name;

    @Column
    private Set<String> prefixes;

    @Column
    private Binary logo;

    @Column
    private String logoMimeType;

    @Column
    private Date logoLastModified;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getPrefixes() {
        return prefixes;
    }

    public void setPrefixes(Set<String> prefixes) {
        this.prefixes = prefixes;
    }

    public Binary getLogo() {
        return logo;
    }

    public void setLogo(Binary logo) {
        this.logo = logo;
    }

    public String getLogoMimeType() {
        return logoMimeType;
    }

    public void setLogoMimeType(String logoMimeType) {
        this.logoMimeType = logoMimeType;
    }

    public Date getLogoLastModified() {
        return logoLastModified;
    }

    public void setLogoLastModified(Date logoLastModified) {
        this.logoLastModified = logoLastModified;
    }

}
