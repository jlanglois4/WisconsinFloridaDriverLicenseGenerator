package edu.wctc;

public class MissingNameException extends Exception{
    public MissingNameException(String nameType){
        System.out.printf("%s may not be blank.\n",nameType);
    }
}
