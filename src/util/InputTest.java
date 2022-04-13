package util;

public class InputTest {

    public static void main(String[] args) {
        System.out.println(Input.getString("Enter a string: "));
        System.out.println(Input.getDouble(1, 29.999));
        System.out.println(Input.getInt(0, 50));
        System.out.println(Input.yesNo("E]Just enter y or yes "));

    }

}
