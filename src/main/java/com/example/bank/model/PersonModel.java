package com.example.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "persons")
public class PersonModel {

    @Id
    private String id;
    private String dni;
    private String nombres;
    private String apellidos;
    private String email;
    private Integer telefono;
    private String direccion;
    private BigDecimal salario;
}
