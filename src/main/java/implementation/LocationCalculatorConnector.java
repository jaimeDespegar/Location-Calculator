package implementation;

import model.Coordinate;
import model.LocationConnector;
import java.util.ArrayList;
import java.util.List;

public class LocationCalculatorConnector implements LocationConnector {

    @Override
    public Boolean isAvailable() {
        return Boolean.TRUE;
    }

    @Override
    public Boolean on() {
        return Boolean.TRUE;
    }

    @Override
    public Boolean off() {
        return Boolean.TRUE;
    }

    @Override
    public List<Coordinate> getData(Coordinate arrival, Coordinate departure) {
        Double arrivalX = arrival.getX();
        Double arrivalY = arrival.getY();
        Double departureX = departure.getX();
        Double departureY = departure.getY();

        List<Coordinate> road = new ArrayList<>();
        if(arrivalX < departureX) {
            for (int i = arrivalX.intValue(); i <= departureX; i++) {
                road.add(new Coordinate(i, arrivalY.intValue()));
            }
        } else {
            for (int i = arrivalX.intValue(); i >= departureX; i--) {
                road.add(new Coordinate(i, arrivalY.intValue()));
            }
        }
        road.remove(road.size()-1);
        if(arrivalY < departureY) {
            for (int i = arrivalY.intValue(); i <= departureY; i++) {
                road.add(new Coordinate(departureX.intValue(), i));
            }
        } else {
            for (int i = arrivalY.intValue(); i >= departureY; i--) {
                road.add(new Coordinate(departureX.intValue(), i));
            }
        }
        return road;
    }

}