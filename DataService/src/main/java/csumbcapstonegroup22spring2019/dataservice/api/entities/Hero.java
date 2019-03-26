package csumbcapstonegroup22spring2019.dataservice.api.entities;

public class Hero {
    private Identity identity;
    private AlterEgo alterEgo;
    private Powers powers;
    private String id;

    public Hero (Identity identity, AlterEgo alterEgo, Powers powers) {
        this.id = id;
        this.identity = identity;
        this.alterEgo = alterEgo;
        this.powers = powers;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setIdentity (Identity identity) {
         this.identity = identity;
    }

    public Identity getIdentity() {
        return this.identity;
    }

    public void setAlterEgo (AlterEgo alterEgo) {
        this.alterEgo = alterEgo;
    }

    public AlterEgo getAlterEgo() {
        return this.alterEgo;
    }

    public void setPowers(Powers powers) {
        this.powers = powers;
    }

    public Powers getPowers() {
        return this.powers;
    }
}