package com.wp.reservas.web;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidacionError {
    private String campo;
    private String mensaje;
    private Object valorRechazado;
}