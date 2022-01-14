package com.sfilas.mspedidosfilas.infraestructure.db.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "items_requests")
@Entity
public class ItemRequest implements Serializable {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     private Integer amount;

     @ManyToOne(fetch = FetchType.LAZY)
     private Product product;
     private static final long serialVersionUID = 1L;

}
