package location.calculator.impl;

import model.Coordinate;

public class Main {

    public static void main(String[] args) {
        LocationCalculatorConnector l = new LocationCalculatorConnector();
        l.getData(new Coordinate(7, 3), new Coordinate(7, 2))
         .forEach(i -> System.out.println(i.getX()+" - "+i.getY()));

        System.out.println();

        l.getData(new Coordinate(4, 3), new Coordinate(2, 1))
                .forEach(i -> System.out.println(i.getX()+" - "+i.getY()));
    }

}