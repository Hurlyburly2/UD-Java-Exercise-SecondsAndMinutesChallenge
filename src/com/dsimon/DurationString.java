package com.dsimon;

import com.sun.jdi.Value;

public class DurationString {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        minutes = minutes + (seconds / 60);
        seconds = seconds % 60;

        int hours = minutes / 60;
        minutes = minutes % 60;

        String outputString = "";
        if (hours < 10) {
            outputString += "0" + hours;
        } else {
            outputString += hours;
        }
        if (minutes < 10) {
            outputString += "H 0" + minutes;
        } else {
            outputString += "H " + minutes;
        }
        if (seconds < 10) {
            outputString += "M 0" + seconds + "S";
        } else {
            outputString += "M " + seconds + "S";
        }
        return outputString;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }
}
