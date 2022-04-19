import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        TODO: Java arrays must be defined by data type
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        TODO: Create an empty array
       String[] person = new String[3];
//        TODO: Populate array, must be equal to predefined size of array
        person[0] = "Lady Mizuki";
        person[1] = "Sir Tokaro";
        person[2] = "Sir Tekashi";
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        System.out.println(Arrays.toString(addPerson(person, "Rich")));
    }

    public static String[] addPerson(String[] person, String singlePerson) {
        String[] newPersons = new String[person.length + 1];
        for (int i = 0; i < person.length; i++) {
            newPersons[i] = person[i];
        }
        newPersons[person.length] = singlePerson;
        return newPersons;
    }
}