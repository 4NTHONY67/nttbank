package com.example.bank.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "companies")
public class CompanyModel {

    @Id
    private String id;
    private String nombre;
    private String rubro;
    private Integer telefono;
    private String direccion;
    private String ruc;
    private String correo;
    private String representante;

}
