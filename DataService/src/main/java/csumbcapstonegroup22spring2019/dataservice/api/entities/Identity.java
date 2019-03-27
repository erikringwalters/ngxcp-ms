package csumbcapstonegroup22spring2019.dataservice.api.entities;

public class Identity {
    private String name;

    public Identity (String name) {
        this.name = name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

}