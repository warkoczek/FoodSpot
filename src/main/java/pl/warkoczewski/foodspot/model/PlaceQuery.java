package pl.warkoczewski.foodspot.model;

import pl.warkoczewski.foodspot.model.enums.PLACE_TYPE;

public class PlaceQuery {
    private Location location;
    private Long radius;
    private PLACE_TYPE place_type;
    private String keyword;

    public PlaceQuery() {
    }

    public PlaceQuery(Location location, Long radius, PLACE_TYPE place_type, String keyword) {
        this.location = location;
        this.radius = radius;
        this.place_type = place_type;
        this.keyword = keyword;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Long getRadius() {
        return radius;
    }

    public void setRadius(Long radius) {
        this.radius = radius;
    }

    public PLACE_TYPE getPlace_type() {
        return place_type;
    }

    public void setPlace_type(PLACE_TYPE place_type) {
        this.place_type = place_type;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
