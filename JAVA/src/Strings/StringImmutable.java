package Strings;

public class StringImmutable
{
    public static void main(String[] args) {
        String str="Hello";
        str.concat("World"); //cannot modify the same variable in string
        System.out.println(str);

        str=str.concat(" World");// overrode the same variable assigning the concat function
        System.out.println(str);
    }
}
 //strings are not modifiable