package FirstStepsInCodingExercise.FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double windwos = 1.5;

        double heightHouse = Double.parseDouble(scanner.nextLine());
        double lengthSideWall = Double.parseDouble(scanner.nextLine());
        double heightTriangleSides = Double.parseDouble(scanner.nextLine());

        // Квадратурата на страните на къщата без прозорците
        double areHouseSideWall = (heightHouse * lengthSideWall) * 2;
        double windowsArea = (windwos * windwos) * 2;
        double totalAreaSideWall = areHouseSideWall - windowsArea;

        //Квадратурата на предна и задна страна без вратата
        double areFrontAndBackSide = (heightHouse * heightHouse) *2;
        double areGate = 1.2 * 2;
        double totalAreFrondAndBackSode = areFrontAndBackSide - areGate;

        //Количество боя за стените
        double totalPaintForWalss = (totalAreaSideWall + totalAreFrondAndBackSode) / 3.4;

        //Квадратура на двете страни на покрива
        double areaCeilSides = (heightHouse * lengthSideWall) * 2;

        //Двата риъгълника на къщата
        double areTriangleSides = 2 * (heightHouse * heightTriangleSides / 2);

        double totalAreaTriangles = areaCeilSides + areTriangleSides;
        double totalPaintsForCeil = totalAreaTriangles / 4.3;

        System.out.printf("%.2f", totalPaintForWalss);
        System.out.println();
        System.out.printf("%.2f", totalPaintsForCeil);
    }
}
