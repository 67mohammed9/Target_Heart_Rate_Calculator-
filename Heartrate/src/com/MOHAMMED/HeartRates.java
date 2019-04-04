/*Heart Rate Class file*/

package com.MOHAMMED;

import java.time.*;
public class HeartRates {
    private String first;
    private String last;
    private int month;
    private int day;
    private int year;

    public HeartRates(String first, String last, int month, int day, int year) {
        this.first = first;
        this.last = last;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getDay() {return day;}

    public int getMonth() {return month;}

    public int getYear() {return year;}

    public String getFirst() {return first;}

    public String getLast() {return last;}

    public void setDay(int day) {this.day = day;}

    public void setFirst(String first) {this.first = first;}

    public void setLast(String last) {this.last = last;}

    public void setMonth(int month) {this.month = month;}

    public void setYear(int year) {this.year = year;}

    public int age()
    {
        LocalDate today = LocalDate.now();
        int b_year = year;
        int b_day = day;
        int b_month = month;
        LocalDate birthday = LocalDate.of(b_year, b_month, b_day );
        int age = Period.between(birthday, today).getYears();
        return age;
    }
    public int max_heartRate(){
        int max = 220 - age();
        return max;
    }
    public String target_heartrate(){
        int lowerBound = (50 * max_heartRate())/100;
        int upperBound = (85 * max_heartRate())/100;
        String range = "Between " + lowerBound + "(bpm) and " + upperBound+"(bpm)";
        return range;
    }
}