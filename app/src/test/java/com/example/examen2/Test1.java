package com.example.examen2;
import static org.junit.Assert.*;
import org.junit.Test;
public class Test1{
    // Pruebas unitarias para el método convertirNumero
    @Test
    public void testConvertirNumeroBinario() {
        assertEquals("El binario 101 debería ser 5 en decimal",5, Calculadora.convertirNumero("101", 0));
    }

    @Test
    public void testConvertirNumeroFormatoInvalido() {
        assertEquals("Una entrada hexadecimal inválida debería retornar -1",-1, Calculadora.convertirNumero("GHI", 3));
    }

    // Pruebas unitarias para el método realizarOperacion
    @Test
    public void testRealizarOperacionSuma() {
        assertEquals("La suma de 5 + 3 debería ser 8",8, Calculadora.realizarOperacion(5, 3, "+"));
    }

    @Test
    public void testRealizarOperacionDivisionPorCero() {
        assertThrows("División por cero debería lanzar ArithmeticException",ArithmeticException.class, () -> Calculadora.realizarOperacion(10, 0, "/"));
    }

    // Pruebas unitarias para el método convertirADestino
    @Test
    public void testConvertirADestinoBinario() {
        assertEquals("El decimal 5 debería ser 101 en binario","101", Calculadora.convertirADestino(5, 0));
    }

    @Test
    public void testConvertirADestinoBaseInvalida() {
        assertThrows("Base de destino inválida debería lanzar IllegalArgumentException",IllegalArgumentException.class, () -> Calculadora.convertirADestino(5, 4));
    }
}

