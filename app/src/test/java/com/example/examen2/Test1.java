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


        // Pruebas unitarias para el método convertirNumero
        @Test
        public void testConvertirNumeroOctal() {
            assertEquals("El octal 12 debería ser 10 en decimal", 10, Calculadora.convertirNumero("12", 1));
        }

        @Test
        public void testConvertirNumeroDecimalNegativo() {
            assertEquals("El número decimal -15 debería ser -15 en decimal", -15, Calculadora.convertirNumero("-15", 2));
        }

        // Pruebas unitarias para el método realizarOperacion
        @Test
        public void testRealizarOperacionRestaPositivos() {
            assertEquals("La resta de 10 - 3 debería ser 7", 7, Calculadora.realizarOperacion(10, 3, "-"));
        }

        @Test
        public void testRealizarOperacionMultiplicacionNegativos() {
            assertEquals("La multiplicación de -4 * -2 debería ser 8", 8, Calculadora.realizarOperacion(-4, -2, "*"));
        }

        // Pruebas unitarias para el método convertirADestino
        @Test
        public void testConvertirADestinoOctal() {
            assertEquals("El decimal 25 debería ser 31 en octal", "31", Calculadora.convertirADestino(25, 1));
        }

        @Test
        public void testConvertirADestinoHexadecimal() {
            assertEquals("El decimal 255 debería ser ff en hexadecimal", "ff", Calculadora.convertirADestino(255, 3));
        }


}

