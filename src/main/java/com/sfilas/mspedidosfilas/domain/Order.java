package com.sfilas.mspedidosfilas.domain;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity(name = "request")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "REGIST_DATE", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar registDate;

    @Column
    private Long value;
    @Column
    private String state;

    public Order(Calendar registDate, Long value, String state) {

        this.registDate = registDate;
        this.value = value;
        this.state = state;
    }

}
