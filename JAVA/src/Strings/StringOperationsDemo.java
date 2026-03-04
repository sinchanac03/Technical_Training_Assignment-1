package Strings;

public class StringOperationsDemo
{
    public static void main(String[] args)
    {
        //created strings
        //string literal
        String s1="Java";

        //string object
        String s2=new String("Java");

        System.out.println("String Literal: " + s1);
        System.out.println("String object: " + s2);

        //length()
        System.out.println("\nLength function: " + s1.length());

        //charAt()
        System.out.println("\nCharacter at index 2 in Java is: " + s1.charAt(2));

        //isblank()
        String str=" ";
        System.out.println("\nIs blank function: " + str.isBlank());

        //toUpperCase()
        String str1="hi";
        System.out.println("\nTo uppercase: " + str1.toUpperCase());

        //toLowercase()
        String str2="HI";
        System.out.println("\nTo lowercase: " + str2.toLowerCase());

        //equals()
        System.out.println("\nEquals function: " + s1.equals(s2));

        //==()
        System.out.println("\nIs s1==s2? " + (s1==s2));

        //compareTo()
        System.out.println("\nCompareTo function:\n(Java,Java): " +s1.compareTo(s2));
        String str3="Java",str4="Programming";
        System.out.println("(Java,Programming): " + str3.compareTo(str4));
        String str5="Programming",str6="Java";
        System.out.println("(Programming, Java): " + str5.compareTo(str6));

        //substring()
        System.out.println("\nSub String: " + s1.substring(0,1));

        //contains()
        System.out.println("\nContains function: " + s1.contains("av"));

        //indexOf()
        System.out.println("\nIndex of 'J': " + s1.indexOf("J"));

        //replace()
        String str7="Java Programming";
        System.out.println("\nReplace Java with Python: " + str7.replace("Java","Python"));

        //startsWith()
        System.out.println("\nStartsWith: " +str7.startsWith("Ja"));

        //endsWith()
        System.out.println("\nEndsWith: " +str7.endsWith("ing"));

        //trim()
        System.out.println("\nBefore Trim: " +str7);
        System.out.println("\nAfter Trim: " +str7.trim());

        //concat()
        System.out.println("\nConcat function: " + str7.concat("Language"));

        //isEmpty()
        String sttr="";
        System.out.println("\nIs empty? " + sttr.isEmpty() + "\n");

        //split()
        String sentence="Java is a very easy language to learn";
        String[] arr=sentence.split(" ");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

        //split() using for-each
        /*String sentence1="Java is a very easy language to learn";
        String[] arr1=sentence1.split(" ");
        for(String i: arr1)
            System.out.println(i);*/
    }
}
