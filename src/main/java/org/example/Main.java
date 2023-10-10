package org.example;


import java.util.stream.Stream;

public class Main {
    public static void main (String[] args) {
        String string1 = "kaosasjdsajkd";
        String string2 = "xyz";

        String result = longestWithAnAnnouncement(string1, string2, "Loading");
        System.out.println("The longest string is " + result);
    }

    public static String longestWithAnAnnouncement (String x, String y, String ann) {
        System.out.println("Announcement" + ann);
        if (x.length() > y.length()) {
            return x;
        } else {
            return y;
        }
    }
}
