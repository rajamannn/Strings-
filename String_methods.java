package com.company;

public class String_methods
{
    public static void main(String[] args) {
        String name = "AMAN JHA";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lowerstring = name.toLowerCase();
        System.out.println(lowerstring);

        String upperstring = name.toUpperCase();
        System.out.println(upperstring);

        String nonTrimmedString = "   AMAN JHA  ";
        System.out.println(nonTrimmedString);

        String TrimmedString = nonTrimmedString.trim();
        System.out.println(TrimmedString);
        System.out.println();


        System.out.println(name.substring(1));
        System.out.println(name.substring(3,7));
        System.out.println();

        System.out.println(name.replace('N', 'R'));
        System.out.println(name.replace("MAN","JAY"));

        System.out.println(name.startsWith("AM"));
        System.out.println(name.endsWith("HA"));

        System.out.println(name.charAt(1));
        String modifiedName = "AMANANANANANANA";
        System.out.println(modifiedName.indexOf("ANA"));
        System.out.println(modifiedName.indexOf("ANA",'2'));

        System.out.println(modifiedName.lastIndexOf("AN",'6'));
        System.out.println(name.equals("AMAN JHA"));
        System.out.println(name.equalsIgnoreCase("Aman jha"));

        System.out.println("I am AMAN JHA \" JHA AMAN");
        System.out.println("My name is\n AMAN");
    }
}
