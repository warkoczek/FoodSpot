package pl.warkoczewski.foodspot.dto;

public class DisplayPlaceDTO {
    private String name;

    public DisplayPlaceDTO() {
    }

    public DisplayPlaceDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
