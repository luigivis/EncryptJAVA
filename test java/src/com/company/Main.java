package com.company;

import javax.crypto.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
	// write your code here
        double num1 = 5, num2 = 10;
        double total = num1+num2;
        for (int i = 1; i<= 15; i++) {
            total = total * i;
            System.out.println(total+" "+i);
        }

        Function function = new Function();
        function.generateKey(128);
    }


}
