package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        ArrayList<Parallelepiped> parallelepipeds = new ArrayList<Parallelepiped>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number rectangles");
        int numberRectangle = 0;

        while (true) {
            try {
                numberRectangle = scanner.nextInt();
                break;
            } catch (Exception ex) {
                scanner.next();

            }
        }
        System.out.println("enter number parallelepipeds");
        int numberParallelepiped = 0;
        while (true) {
            try {
                numberParallelepiped = scanner.nextInt();
                break;
            } catch (Exception ex) {
                scanner.next();
            }
        }
        Random random = new Random();
        for (int i = 0; i < numberRectangle; i++) {
            Rectangle rectangle = new Rectangle(Trash.numbers[random.nextInt(6)], Trash.numbers[random.nextInt(6)]);
            rectangles.add(rectangle);
        }
        for (int i = 0; i < numberParallelepiped; i++) {
            Parallelepiped parallelepiped = new Parallelepiped(Trash.numbers[random.nextInt(6)], Trash.numbers[random.nextInt(6)], Trash.numbers[random.nextInt(6)]);
            parallelepipeds.add(parallelepiped);
        }
        //rectangle calculate
        double sumRecSquares = 0;
        int countRC = 0;
        for (Rectangle rectangle : rectangles) {
            sumRecSquares += rectangle.calculateSquare();
        }
        for (Rectangle rectangle : rectangles) {
            double square = rectangle.calculateSquare();
            countRC += square > (sumRecSquares / numberRectangle) ? 1 : 0;
        }
        //paralelepiped calculate
        int countPL = 0;
        for (Parallelepiped paralelepiped : parallelepipeds) {
            Boolean check = (paralelepiped.getHeight() - paralelepiped.getLength() == 0 && paralelepiped.getHeight() - paralelepiped.getWidth() == 0);
            if (check == true) {
                countPL++;
            }
        }
        System.out.println("number rectangles " + String.valueOf(countRC));
        System.out.println("number paralelepipeds " + String.valueOf(countPL));
    }


}
