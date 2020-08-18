package implementation;

import model.Coordinate;
import model.Location;
import java.util.List;

public class LocationGoogleFail implements Location {

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
    public List<Coordinate> getData(Coordinate coordinate, Coordinate coordinate1) {
        throw new RuntimeException("Google is not available now");
    }

}