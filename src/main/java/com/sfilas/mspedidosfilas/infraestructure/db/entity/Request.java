package com.sfilas.mspedidosfilas.infraestructure.db.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity(name = "requests")
public class Request implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "REGIST_DATE", updatable = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar registDate;

    @Column
    private Long value;
    @Column
    private String state;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "requests_id")
    List<ItemRequest> listItemsRequests;

    public void addItemRequest(ItemRequest itemRequest) {

        listItemsRequests.add(itemRequest);
    }

    private static final long serialVersionUID = 1L;

}
