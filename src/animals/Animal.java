package animals;

public abstract class Animal {
//    fields
    protected int numberOfLegs;
    protected String preferredClimate;


//    constructor
    public Animal(int numberOfLegs, String preferredClimate){
        this.numberOfLegs = numberOfLegs;
        this.preferredClimate = preferredClimate;
    }
//    public Animal(String colors, boolean hasTeeth){
//        this.colors = colors;
//        this.hasTeeth = hasTeeth;
//    }

//    properties
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getPreferredClimate() {
        return preferredClimate;
    }

    public void setPreferredClimate(String preferredClimate) {
        this.preferredClimate = preferredClimate;
    }
    abstract String getAnimalInfo();
}
