/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCodes;

import java.util.InputMismatchException;

/**
 *
 * @author Gian Luca
 */
public class AutenticationCPF {

    protected String CPFtratado;

    public String MudarCaracter(String CPFBruto) {
        CPFtratado = CPFBruto.replace("-", "").replace(".", "");
        return CPFtratado;
    }

    public boolean ValidaCPF() {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPFtratado.equals("00000000000") || CPFtratado.equals("11111111111")
                || CPFtratado.equals("22222222222") || CPFtratado.equals("33333333333")
                || CPFtratado.equals("44444444444") || CPFtratado.equals("55555555555")
                || CPFtratado.equals("66666666666") || CPFtratado.equals("77777777777")
                || CPFtratado.equals("88888888888") || CPFtratado.equals("99999999999")
                || (CPFtratado.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
// converte o i-esimo caractere do CPF em um numero:
// por exemplo, transforma o caractere '0' no inteiro 0         
// (48 eh a posicao de '0' na tabela ASCII)         
                num = (int) (CPFtratado.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPFtratado.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

// Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPFtratado.charAt(9)) && (dig11 == CPFtratado.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }
}
