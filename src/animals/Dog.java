package animals;

public class Dog extends Animal{
private boolean needsAttention = true;
public Dog(int numberOfLegs, String preferredClimate){
    super(numberOfLegs, preferredClimate);
}

public boolean isNeedsAttention(){
    return needsAttention;
}
public void setNeedsAttention(boolean needsAttention){
    this.needsAttention = needsAttention;
}

@Override
public String getAnimalInfo(){
    return "Dog Details: " +
            "Number of legs: " + numberOfLegs +
            "Preferred Climate: " + preferredClimate +
            "Needs attention" + needsAttention;
}
}
