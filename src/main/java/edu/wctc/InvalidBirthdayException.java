package edu.wctc;

public class InvalidBirthdayException extends Exception {
    public InvalidBirthdayException(int year, int month, int day){
            System.out.printf("%d/%d/%d is an invalid date.\n", month, day, year);
    }
}
