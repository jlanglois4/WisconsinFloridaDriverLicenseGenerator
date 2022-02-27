package edu.wctc;

public class UnknownGenderCodeException extends Exception {
    public UnknownGenderCodeException(char genderCode){
        System.out.printf("%C is not a valid gender code.",genderCode);
    }
}
