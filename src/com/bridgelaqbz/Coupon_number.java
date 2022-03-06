package com.bridgelaqbz;

public class Coupon_number {
    public static void main(String[] args) {

        char[] chars = "Jayant420parmar".toCharArray();
        int max = 100000000;
        int random = (int) (Math.random() * max);
        StringBuffer stringBuffer = new StringBuffer();

        while (random > 0) {
            stringBuffer.append(chars[random % chars.length]);
            random /= chars.length;
        }

        String couponCode = stringBuffer.toString();
        System.out.println("Coupon Code: " + couponCode);
    }

}

