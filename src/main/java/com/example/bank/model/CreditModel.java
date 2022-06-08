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
@Document(collection = "credits")
public class CreditModel {

    @Id
    private String id;
    private String fechaCredito;
    private String fechaPago;
    private String nroCredito;
    private String tipo;
    private BigDecimal monto;
    private Integer cuotas;
    private String solicitante;
}
