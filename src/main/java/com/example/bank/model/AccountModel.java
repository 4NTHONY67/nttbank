package com.example.bank.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "accounts")
public class AccountModel {

    @Id
    private String id;
    private BigDecimal deposito;
    private BigDecimal retiro;
    private String nroCuenta;
    private String tipo;
    private String apertura;
    private String cliente;

}
