package com.sophos.academy.model;

public class DateAndTime extends Date {

    private final String time;

    public DateAndTime(String year, String month, String day, String time) {
        super(year, month, day);
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}
