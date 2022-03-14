package com.bridgelaqbz;
import java.util.Scanner;

public class StopWatch {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StopWatch object = new StopWatch();
        Scanner sc = new Scanner(System.in);

        object.stopWatchElapseTime();
    }

    public void stopWatchElapseTime() {
        double startTime, stopTime;
        System.out.print("Enter 1 To Start");
        scanner.nextInt();
        startTime = System.currentTimeMillis();
        System.out.println("started at" + startTime);
        System.out.println("Enter 2 To Stop");
        scanner.nextInt();
        stopTime = System.currentTimeMillis();
        System.out.println("stopped at" + stopTime);
        double timeElapsed = (stopTime - startTime) / 1000;
        System.out.println("Total time elapsed in milliseconds:" + timeElapsed);
    }
}


