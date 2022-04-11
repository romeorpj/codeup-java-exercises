public class Person {
    public static void main(String[] args) {
Person person1 = new Person("Richard");
//person1.setName("Richard");
        person1.sayHello();
    }
    private String name;

    public void setName(String name){
//TODO: change the name field to the passed value
//        this.name is referring to the name property/field
//        = name is referring to the data being passed in via the parameter
        this.name=name;

    }
    public String getName(){
//TODO: return the person's name
//        returns what name has been "set" to in the setName method
return name;
    }


    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println(getName());
    }


    Person(String name){
//        TODO: My constructor func
        this.name=name;
    }
}
