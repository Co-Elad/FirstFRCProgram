package org.example;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    ;


    public static boolean isValidDate(Date dateOfBirt) {
        if (dateOfBirt.month > 12 || dateOfBirt.month < 1) {
            dateOfBirt = new Date();


            return false;
        } else if (dateOfBirt.year < 0) {
            dateOfBirt = new Date();

            return false;
        } else if ((dateOfBirt.day < 0 || dateOfBirt.day > 31)) {
            dateOfBirt = new Date();

            return false;
        } else if ((dateOfBirt.month == 4 || dateOfBirt.month == 6 || dateOfBirt.month == 9 || dateOfBirt.month == 11 && dateOfBirt.day > 30)) {
            dateOfBirt = new Date();

            return false;
        } else if ((dateOfBirt.month == 1 || dateOfBirt.month == 3 || dateOfBirt.month == 5 || dateOfBirt.month == 7 || dateOfBirt.month == 8 || dateOfBirt.month == 10 || dateOfBirt.month == 12 && dateOfBirt.day > 31)) {
            dateOfBirt = new Date();

            return false;
        } else if ((dateOfBirt.isLeapYear(dateOfBirt.year) && dateOfBirt.month == 2 && dateOfBirt.day > 28)) {
            dateOfBirt = new Date();
            return false;
        }
        return true;


    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? true : false;

    }

    public String toString() {

        return day + "/" + month + "/" + year;
    }

    private boolean equals(Date other) {

        return this.day == other.day && this.month == other.month && this.year == other.year;
    }

    public boolean before(Date other) {
        if (this.day == other.day && this.month == other.month && this.year == other.year) {
            return true;
        }
        return false;
    }

    public void addDays(int daysToAdd) {
        int daysInMonth = 0;

        int finalDays = this.day + daysToAdd;
        switch (this.month) {
            case 1, 3, 5, 7, 8, 10, 12 -> daysInMonth = 31;
            case 4, 6, 9, 11 -> daysInMonth = 30;
            case 2 -> {
                if (isLeapYear(this.year)) daysInMonth = 29;
                else daysInMonth = 28;

            }

        }


    }

    private int daysToAddToMonth(int days, int daysInMonth) {
        if (days < daysInMonth) {
            return 0;
        }
        int monthToAdd = days / daysInMonth;
        if (monthToAdd + this.month < 12) {
            return 0;


        }
        int yearsToAdd = monthToAdd/this.month;
        return 0;

    }


}







