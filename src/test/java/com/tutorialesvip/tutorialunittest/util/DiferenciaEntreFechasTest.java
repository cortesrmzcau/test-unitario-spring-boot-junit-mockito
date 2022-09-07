package com.tutorialesvip.tutorialunittest.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class DiferenciaEntreFechasTest {

    @Autowired
    DiferenciaEntreFechas diferenciaEntreFechas;

    @Test
    void calculateYearsOfIndependency() {
        diferenciaEntreFechas = new DiferenciaEntreFechas();
        LocalDate today = LocalDate.now();
        String fechaIndependencia = "27/02/1884";

        Period resultado = diferenciaEntreFechas.calculateYearsOfIndependency(fechaIndependencia);
        System.out.println(resultado);

        Assertions.assertEquals(6, resultado.getMonths());
        Assertions.assertEquals(10, resultado.getDays());
        Assertions.assertEquals(10, resultado.getDays());
    }
}