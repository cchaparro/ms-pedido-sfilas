package com.sfilas.mspedidosfilas.infraestructure.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "clients")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @NotNull
    @Column(unique = true)
    private String telephone;

    @Email
    @NotEmpty
    @NotNull
    private String mail;

    @NotEmpty
    @NotNull
    private String name;

    @NotEmpty
    @NotNull
    @Column(name = "last_name")
    private String lastName;

    private static final long serialVersionUID = 1L;

}
