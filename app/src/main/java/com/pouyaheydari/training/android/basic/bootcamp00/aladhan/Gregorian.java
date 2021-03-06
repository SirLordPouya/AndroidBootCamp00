
package com.pouyaheydari.training.android.basic.bootcamp00.aladhan;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gregorian {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("weekday")
    @Expose
    private Weekday__1 weekday;
    @SerializedName("month")
    @Expose
    private Month__1 month;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("designation")
    @Expose
    private Designation__1 designation;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Weekday__1 getWeekday() {
        return weekday;
    }

    public void setWeekday(Weekday__1 weekday) {
        this.weekday = weekday;
    }

    public Month__1 getMonth() {
        return month;
    }

    public void setMonth(Month__1 month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Designation__1 getDesignation() {
        return designation;
    }

    public void setDesignation(Designation__1 designation) {
        this.designation = designation;
    }

}
