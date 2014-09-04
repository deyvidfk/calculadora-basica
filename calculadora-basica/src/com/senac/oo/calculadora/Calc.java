package com.senac.oo.calculadora;

public class Calc {

    public float soma(float numero1, float numero2) {

        return numero1 + numero2;
    }

    public float menos(float numero1, float numero2) {

        return numero1 - numero2;
    }

    public float mult(float numero1, float numero2) {

        return numero1 * numero2;

    }

    public float divisao(float numero1, float numero2) {

        return numero1 / numero2;
    }

    public float potencia(float numero1, float numero2) {

        return (float) Math.pow(numero1, numero2);
    }
}
