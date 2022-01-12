package com.sfilas.mspedidosfilas.models.entity;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity(name = "requests")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "REGIST_DATE", updatable = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar registDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @Column
    private Long value;
    @Column
    private String state;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "item_request_id")
    List<ItemRequest> listItemsRequests;

    public Request(Calendar registDate, Long value, String state) {

        this.registDate = registDate;
        this.value = value;
        this.state = state;
    }

    public void addItemRequest(ItemRequest itemRequest) {

        listItemsRequests.add(itemRequest);
    }

}
