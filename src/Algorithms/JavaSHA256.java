package Algorithms;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.Scanner;

public class JavaSHA256 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string to be hashed");
        String toBeHashed = scanner.next();

        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(toBeHashed.getBytes("UTF-8"));

                // Convert byte array into signum representation
//                BigInteger number = new BigInteger(1, hash);

                // Convert message digest into hex value
//                StringBuilder hexString = new StringBuilder(number.toString(16));

                // Pad with leading zeros
//                while (hexString.length() < 32)
//                {
//                    hexString.insert(0, '0');
//                }
//
//            System.out.println(hexString.toString());



            StringBuffer hexString = new StringBuffer();
            for(int i=0; i< hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                    hexString.append(hex);
                }
                System.out.println(hexString.toString());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
