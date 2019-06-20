package com.dsimon;

public class Main {

    public static void main(String[] args) {
        System.out.println(DurationString.getDurationString(120, 10));
        System.out.println(DurationString.getDurationString(1000));
        System.out.println(DurationString.getDurationString(-30, 10));
        System.out.println(DurationString.getDurationString(-200));
    }
}
