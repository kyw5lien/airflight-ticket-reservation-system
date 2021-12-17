package tester_classes;

import models.Airplane;

public class AirplaneTester {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(1, "Boeing", "707", 189);
        System.out.println(airplane);
    }
}
