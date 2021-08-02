package com.company;

import javax.crypto.*;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        try {
            final String claveEncriptacion = "Hacker*_*";
            String datosOriginales = "Mateo Aguilar";

            Function encriptador = new Function();

            String encriptado = encriptador.encriptar(datosOriginales, claveEncriptacion);
            String desencriptado = encriptador.desencriptar(encriptado, claveEncriptacion);

            System.out.println("Cadena Original: " + datosOriginales);
            System.out.println("Encriptado     : " + encriptado);
            System.out.println("Desencriptado  : " + desencriptado);

        } catch (NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException | UnsupportedEncodingException ex) {

        }
    }


}
