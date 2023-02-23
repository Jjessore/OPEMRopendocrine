package com.opemr.endocrine_opassess.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PKkey implements Serializable {

    @Column(name="EO_UHID")
    private int UHID;

    @Column(name = "EO_ENCOUNTERID")
    private String encounterid;

}
