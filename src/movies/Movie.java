package movies;

public class Movie {
//    Private properties
    private String name;
    private String category;


//    Movies constructor function
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

//    Getters and Setters
//    Set methods are more so re-setters in this case
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
