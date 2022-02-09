package main;

import services.SkyscraperConstruction;
import java.util.Scanner;

public class Skyscrapper {

    public static void main(String[] args) {
        System.out.println("Enter the total no of floors in the building");
        Scanner scanner = new Scanner(System.in);
        int totalFloors = scanner.nextInt();
        SkyscraperConstruction skyscraperConstruction = new SkyscraperConstruction(totalFloors);
        skyscraperConstruction.inputFloorDeliveryByDay(scanner);
        skyscraperConstruction.processAndShowOrderOfConstruction();
    }

}