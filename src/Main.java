
/***********************************************************************
 Name :Liyanaarachchi L.D.K
 Index:21/ENG/068
 **********************************************************************/

import java.util.Random;
import java.util.Scanner;

class pieceType1 {
    String side1;

    public pieceType1(String clour1) {
        side1 = clour1;
    }
}

class pieceType2 {
    String side1;
    String side2;

    public pieceType2(String clour1, String clour2) {
        side1 = clour1;
        side2 = clour2;
    }
}

class pieceType3 {
    String side1;
    String side2;
    String side3;

    public pieceType3(String clour1, String clour2, String clour3) {

        side1 = clour1;
        side2 = clour2;
        side3 = clour3;
    }
}

class cube {

    // top layer of cube
    pieceType3 p1 = new pieceType3("G", "O", "R");
    pieceType2 p2 = new pieceType2("G", "R");
    pieceType3 p3 = new pieceType3("G", "Y", "R");
    pieceType2 p4 = new pieceType2("O", "R");
    pieceType1 p5 = new pieceType1("R");
    pieceType2 p6 = new pieceType2("Y", "R");
    pieceType3 p7 = new pieceType3("W", "O", "R");
    pieceType2 p8 = new pieceType2("W", "R");
    pieceType3 p9 = new pieceType3("W", "Y", "R");

    // middle layer of cube
    pieceType2 p10 = new pieceType2("G", "O");
    pieceType1 p11 = new pieceType1("G");
    pieceType2 p12 = new pieceType2("G", "Y");
    pieceType1 p13 = new pieceType1("O");
    pieceType1 p14 = new pieceType1("Y");
    pieceType2 p15 = new pieceType2("W", "O");
    pieceType1 p16 = new pieceType1("W");
    pieceType2 p17 = new pieceType2("W", "Y");

    // bottom layer of cube
    pieceType3 p18 = new pieceType3("G", "O", "B");
    pieceType2 p19 = new pieceType2("G", "B");
    pieceType3 p20 = new pieceType3("G", "Y", "B");
    pieceType2 p21 = new pieceType2("O", "B");
    pieceType1 p22 = new pieceType1("B");
    pieceType2 p23 = new pieceType2("Y", "B");
    pieceType3 p24 = new pieceType3("W", "O", "B");
    pieceType2 p25 = new pieceType2("W", "B");
    pieceType3 p26 = new pieceType3("W", "Y", "B");

}

public class Main {
    public static cube Cube = new cube();
    public static String clour_1, clour_2, clour_3;

    public static void printClour() {
        System.out.println("\n");
        System.out.println("\t\t " + Cube.p24.side1 + " " + Cube.p25.side1 + " " + Cube.p26.side1);
        System.out.println("\t\t " + Cube.p15.side1 + " " + Cube.p16.side1 + " " + Cube.p17.side1);
        System.out.println("\t\t " + Cube.p7.side1 + " " + Cube.p8.side1 + " " + Cube.p9.side1);

        System.out.println("   ");
        System.out.println(Cube.p24.side2 + " " + Cube.p15.side2 + " " + Cube.p7.side2 + " \t " + Cube.p7.side3 + " "
                + Cube.p8.side2 + " " + Cube.p9.side3 + " \t " + Cube.p9.side2 + " " + Cube.p17.side2 + " "
                + Cube.p26.side2);
        System.out.println(Cube.p21.side1 + " " + Cube.p13.side1 + " " + Cube.p4.side1 + " \t " + Cube.p4.side2 + " "
                + Cube.p5.side1 + " " + Cube.p6.side2 + " \t " + Cube.p6.side1 + " " + Cube.p14.side1 + " "
                + Cube.p23.side1);
        System.out.println(Cube.p18.side2 + " " + Cube.p10.side2 + " " + Cube.p1.side2 + " \t " + Cube.p1.side3 + " "
                + Cube.p2.side2 + " " + Cube.p3.side3 + " \t " + Cube.p3.side2 + " " + Cube.p12.side2 + " "
                + Cube.p20.side2);

        System.out.println("  ");
        System.out.println("\t\t " + Cube.p1.side1 + " " + Cube.p2.side1 + " " + Cube.p3.side1);
        System.out.println("\t\t " + Cube.p10.side1 + " " + Cube.p11.side1 + " " + Cube.p12.side1);
        System.out.println("\t\t " + Cube.p18.side1 + " " + Cube.p19.side1 + " " + Cube.p20.side1);

        System.out.println("  ");
        System.out.println("\t\t " + Cube.p18.side3 + " " + Cube.p19.side2 + " " + Cube.p20.side3);
        System.out.println("\t\t " + Cube.p21.side2 + " " + Cube.p22.side1 + " " + Cube.p23.side2);
        System.out.println("\t\t " + Cube.p24.side3 + " " + Cube.p25.side2 + " " + Cube.p26.side3);
    }

    public static void cubeIndicator() {
        int cheack = 0;
        // cheack backside of the cube
        if (Cube.p24.side1.equals(Cube.p16.side1) && Cube.p25.side1.equals(Cube.p16.side1)
                && Cube.p26.side1.equals(Cube.p16.side1) &&
                Cube.p15.side1.equals(Cube.p16.side1) && Cube.p17.side1.equals(Cube.p16.side1) &&
                Cube.p7.side1.equals(Cube.p16.side1) && Cube.p8.side1.equals(Cube.p16.side1)
                && Cube.p9.side1.equals(Cube.p16.side1)) {
            cheack++;
        }

        // cheack top side of the cube
        if (Cube.p7.side3.equals(Cube.p5.side1) && Cube.p8.side2.equals(Cube.p5.side1)
                && Cube.p9.side3.equals(Cube.p5.side1) &&
                Cube.p4.side2.equals(Cube.p5.side1) && Cube.p6.side2.equals(Cube.p5.side1) &&
                Cube.p1.side3.equals(Cube.p5.side1) && Cube.p2.side2.equals(Cube.p5.side1)
                && Cube.p3.side3.equals(Cube.p5.side1)) {
            cheack++;
        }

        // cheack front side of the cube
        if (Cube.p1.side1.equals(Cube.p11.side1) && Cube.p2.side1.equals(Cube.p11.side1)
                && Cube.p3.side1.equals(Cube.p11.side1) &&
                Cube.p10.side1.equals(Cube.p11.side1) && Cube.p12.side1.equals(Cube.p11.side1) &&
                Cube.p18.side1.equals(Cube.p11.side1) && Cube.p19.side1.equals(Cube.p11.side1)
                && Cube.p20.side1.equals(Cube.p11.side1)) {
            cheack++;
        }

        // cheack bottom side of the cube
        if (Cube.p18.side3.equals(Cube.p22.side1) && Cube.p19.side2.equals(Cube.p22.side1)
                && Cube.p20.side3.equals(Cube.p22.side1) &&
                Cube.p21.side2.equals(Cube.p22.side1) && Cube.p23.side2.equals(Cube.p22.side1) &&
                Cube.p24.side3.equals(Cube.p22.side1) && Cube.p25.side2.equals(Cube.p22.side1)
                && Cube.p26.side3.equals(Cube.p22.side1)) {
            cheack++;
        }

        // cheack the right side of the cube
        if (Cube.p9.side2.equals(Cube.p14.side1) && Cube.p17.side2.equals(Cube.p14.side1)
                && Cube.p26.side2.equals(Cube.p14.side1) &&
                Cube.p6.side1.equals(Cube.p14.side1) && Cube.p23.side1.equals(Cube.p14.side1) &&
                Cube.p3.side2.equals(Cube.p14.side1) && Cube.p12.side2.equals(Cube.p14.side1)
                && Cube.p20.side2.equals(Cube.p14.side1)) {
            cheack++;
        }
        // cheack the left side of the cube
        if (Cube.p24.side2.equals(Cube.p13.side1) && Cube.p15.side2.equals(Cube.p13.side1)
                && Cube.p7.side2.equals(Cube.p13.side1) &&
                Cube.p21.side1.equals(Cube.p13.side1) && Cube.p4.side1.equals(Cube.p13.side1) &&
                Cube.p18.side2.equals(Cube.p13.side1) && Cube.p10.side2.equals(Cube.p13.side1)
                && Cube.p1.side2.equals(Cube.p13.side1)) {
            cheack++;
        }

        if (cheack == 6) {
            System.out.print(
                    "*************************************\ncube is solved\n ********************************************************\nNEW game started\n\n");
            shuffelCube();
            printClour();
        }

    }

    public static void topClockwice() {
        rotateZ(Cube.p7, Cube.p8, Cube.p9, Cube.p4, Cube.p6, Cube.p1, Cube.p2, Cube.p3);
    }

    public static void topAntClockwice() {
        for (int i = 0; i < 3; i++) {
            rotateZ(Cube.p7, Cube.p8, Cube.p9, Cube.p4, Cube.p6, Cube.p1, Cube.p2, Cube.p3);
        }
    }

    public static void bottomClockwice() {
        rotateZ(Cube.p24, Cube.p25, Cube.p26, Cube.p21, Cube.p23, Cube.p18, Cube.p19, Cube.p20);
    }

    public static void bottomAntClockwice() {
        for (int i = 0; i < 3; i++) {
            rotateZ(Cube.p24, Cube.p25, Cube.p26, Cube.p21, Cube.p23, Cube.p18, Cube.p19, Cube.p20);
        }
    }

    public static void rightClockwice() {
        rotateY(Cube.p3, Cube.p6, Cube.p9, Cube.p12, Cube.p17, Cube.p20, Cube.p23, Cube.p26);
    }

    public static void rightAntClockwice() {
        for (int i = 0; i < 3; i++) {
            rotateY(Cube.p3, Cube.p6, Cube.p9, Cube.p12, Cube.p17, Cube.p20, Cube.p23, Cube.p26);
        }
    }

    public static void leftClockwice() {
        rotateY(Cube.p1, Cube.p4, Cube.p7, Cube.p10, Cube.p15, Cube.p18, Cube.p21, Cube.p24);
    }

    public static void leftAntClockwice() {
        for (int i = 0; i < 3; i++) {
            rotateY(Cube.p1, Cube.p4, Cube.p7, Cube.p10, Cube.p15, Cube.p18, Cube.p21, Cube.p24);
        }
    }

    public static void rotateX(pieceType3 A1, pieceType2 A2, pieceType3 A3, pieceType2 A4, pieceType2 A5, pieceType3 A6,
            pieceType2 A7, pieceType3 A8) {

        clour_1 = A1.side2;
        clour_2 = A1.side3;

        A1.side3 = A6.side2;
        A1.side2 = A6.side3;

        A6.side2 = A8.side3;
        A6.side3 = A8.side2;

        A8.side2 = A3.side3;
        A8.side3 = A3.side2;

        A3.side2 = clour_2;
        A3.side3 = clour_1;

        clour_3 = A2.side2;

        A2.side2 = A4.side2;

        A4.side2 = A7.side2;

        A7.side2 = A5.side2;

        A5.side2 = clour_3;
    }

    public static void rotateY(pieceType3 A1, pieceType2 A2, pieceType3 A3, pieceType2 A4, pieceType2 A5, pieceType3 A6,
            pieceType2 A7, pieceType3 A8) {

        clour_1 = A1.side1;
        clour_2 = A1.side3;

        A1.side3 = A6.side1;
        A1.side1 = A6.side3;

        A6.side1 = A8.side3;
        A6.side3 = A8.side1;

        A8.side1 = A3.side3;
        A8.side3 = A3.side1;

        A3.side1 = clour_2;
        A3.side3 = clour_1;

        clour_3 = A2.side2;

        A2.side2 = A4.side1;

        A4.side1 = A7.side2;

        A7.side2 = A5.side1;

        A5.side1 = clour_3;
    }

    public static void rotateZ(pieceType3 A1, pieceType2 A2, pieceType3 A3, pieceType2 A4, pieceType2 A5, pieceType3 A6,
            pieceType2 A7, pieceType3 A8) {

        clour_1 = A1.side1;
        clour_2 = A1.side2;

        A1.side1 = A6.side2;
        A1.side2 = A6.side1;

        A6.side1 = A8.side2;
        A6.side2 = A8.side1;

        A8.side1 = A3.side2;
        A8.side2 = A3.side1;

        A3.side1 = clour_2;
        A3.side2 = clour_1;

        clour_3 = A2.side1;

        A2.side1 = A4.side1;

        A4.side1 = A7.side1;

        A7.side1 = A5.side1;

        A5.side1 = clour_3;
    }

    public static void frontClockwice() {
        rotateX(Cube.p1, Cube.p2, Cube.p3, Cube.p10, Cube.p12, Cube.p18, Cube.p19, Cube.p20);
    }

    public static void frontAntClockwice() {
        for (int i = 0; i < 3; i++) {
            rotateX(Cube.p1, Cube.p2, Cube.p3, Cube.p10, Cube.p12, Cube.p18, Cube.p19, Cube.p20);
        }
    }

    public static void backClockwice() {
        rotateX(Cube.p7, Cube.p8, Cube.p9, Cube.p15, Cube.p17, Cube.p24, Cube.p25, Cube.p26);
    }

    public static void backAntClockwice() {
        for (int i = 0; i < 3; i++) {
            rotateX(Cube.p7, Cube.p8, Cube.p9, Cube.p15, Cube.p17, Cube.p24, Cube.p25, Cube.p26);
        }

    }

    public static void shuffelCube() {
        Random random = new Random();
        int randomNumber;

        for (int i = 0; i < 100; i++) {
            randomNumber = random.nextInt(12);

            if (randomNumber == 0) {
                frontClockwice();
            } else if (randomNumber == 1) {
                frontAntClockwice();
            } else if (randomNumber == 2) {
                backClockwice();
            } else if (randomNumber == 3) {
                backAntClockwice();
            } else if (randomNumber == 4) {
                rightClockwice();
            } else if (randomNumber == 5) {
                rightAntClockwice();
            } else if (randomNumber == 6) {
                leftClockwice();
            } else if (randomNumber == 7) {
                leftAntClockwice();
            } else if (randomNumber == 8) {
                topClockwice();
            } else if (randomNumber == 9) {
                topAntClockwice();
            } else if (randomNumber == 10) {
                bottomClockwice();
            } else {
                bottomAntClockwice();
            }
        }
    }

    public static void callOpareter(String oparator) {
        if (oparator.equals("U+")) {
            topClockwice();
            printClour();
        } else if (oparator.equals("U-")) {
            topAntClockwice();
            printClour();
        } else if (oparator.equals("B+")) {
            bottomClockwice();
            printClour();
        } else if (oparator.equals("B-")) {
            bottomAntClockwice();
            printClour();
        } else if (oparator.equals("R+")) {
            rightClockwice();
            printClour();

        } else if (oparator.equals("R-")) {
            rightAntClockwice();
            printClour();
        } else if (oparator.equals("L+")) {
            leftClockwice();
            printClour();
        } else if (oparator.equals("L-")) {
            leftAntClockwice();
            printClour();
        } else if (oparator.equals("F+")) {
            frontClockwice();
            printClour();
        } else if (oparator.equals("F-")) {
            frontAntClockwice();
            printClour();
        } else if (oparator.equals("E+")) {
            backClockwice();
            printClour();
        } else if (oparator.equals("E-")) {
            backAntClockwice();
            printClour();
        } else if (oparator.equals("RS")) {
            System.out.print("\nReshuffel the cube-NEW game started");
            shuffelCube();
            printClour();
        }

        else {
            System.out.println("Invalead oparetor.");

        }
    }

    public static void game() {

        Scanner scanner = new Scanner(System.in);
        String input = new String();
        input = " ";
        System.out.println("\nNew game");
        shuffelCube();
        printClour();
        while (!input.equals("EX")) {
            System.out.print("\nEnter the command : ");
            input = scanner.next().toUpperCase();
            if (input.equals("EX")) {
                System.out.println("Exit the programm.");
                break;

            } else {
                callOpareter(input);
                cubeIndicator();

            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println("commands using this program\n");
        System.out.println("U+ :Top layer is rotated in clockwise direction");
        System.out.println("U- :Top layer is rotated in ant-clockwise direction");
        System.out.println("B+ :Bottom layer is rotated in clockwise direction");
        System.out.println("B- :Bottom layer is rotated in ant-clockwise direction");

        System.out.println("R+ :Right hand side layer is rotated in clockwise direction");
        System.out.println("R- :Right hand side layer is rotated in ant-clockwise direction");
        System.out.println("L+ :Left hand side layer is rotated in clockwise direction");
        System.out.println("L- :Left hand side layer is rotated in ant-clockwise direction");

        System.out.println("F+ :Front layer is rotated in clockwise direction");
        System.out.println("F- :Front layer is rotated in ant-clockwise direction");
        System.out.println("E+ :Back layer is rotated in clockwise direction");
        System.out.println("E- :Back layer is rotated in ant-clockwise direction");

        System.out.println("\nRS : Reshuffle the cube");
        System.out.println("EX : Exit the programme");

        game();

    }
}