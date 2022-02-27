package edu.wctc;

public class FloridaFormatter {

    public static String formatLicenseNumber(DriversLicense driversLicense){

        String SSSS = driversLicense.getSoundexCode();
        int FFF = driversLicense.getFirstNameMiddleInitial();
        int YY = driversLicense.getBirthYear();
        int DDD = driversLicense.getBirthMonthDayGender();
        int N = driversLicense.getOverflow();

        return String.format("%s-%s-%s-%s-%s",SSSS,FFF,YY,DDD,N);
    }

}
