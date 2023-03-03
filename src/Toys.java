public class Toys implements Toy{
    private Integer ID;
    private String name;
    private Double chance;


    public Toys(Integer ID, String name, Double chance) {
        this.ID = ID;
        this.name = name;
        this.chance = chance;
    }

    public Toys(){

    }

    public Double getChance() {
        return chance;
    }

    public void setChance(Double chance) {
        this.chance = chance;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Toys: " +
                "ID- " + ID +
                ", name- '" + name + '\'' +
                ", chance-" + chance + ".";
    }

    @Override
    public Integer toyID(Integer ID) {
        return ID;
    }

    @Override
    public String toyName(String name) {
        return name;
    }



    @Override
    public Double chance(Double chance) {
        return chance;
    }
}
