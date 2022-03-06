package com.bridgelaqbz;

public class Reversenumber
{
    public static void main(String[] args)
    {
        int remaining, reverse = 0, number = 54321;
        while (number != 0) {
            remaining = number % 10;
            reverse = reverse * 10 + remaining;
            number = number / 10;
        }
        System.out.println("Reverse Number is:-" + reverse);

    }
}




