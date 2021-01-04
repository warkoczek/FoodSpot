package pl.warkoczewski.foodspot.dto;

import pl.warkoczewski.foodspot.model.PLACE_TYPE;
import pl.warkoczewski.foodspot.validation.constraints.Latitude;
import pl.warkoczewski.foodspot.validation.constraints.Longitude;

public class PlaceQueryDTO {
    @Latitude
    private String lat;
    @Longitude
    private String lon;
    private Long radius;
    private PLACE_TYPE place_type;
    private String keyword;

    public PlaceQueryDTO() {
    }

    public PlaceQueryDTO(String lat, String lon, Long radius, PLACE_TYPE place_type, String keyword) {
        this.lat = lat;
        this.lon = lon;
        this.radius = radius;
        this.place_type = place_type;
        this.keyword = keyword;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
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

    @Override
    public String toString() {
        return "PlaceQueryDTO{" +
                "lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", radius=" + radius +
                ", place_type=" + place_type +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
