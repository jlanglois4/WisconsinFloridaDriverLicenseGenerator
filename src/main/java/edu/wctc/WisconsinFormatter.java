package edu.wctc;

public class WisconsinFormatter {

    public static String formatLicenseNumber(DriversLicense driversLicense) {

        String SSSS = driversLicense.getSoundexCode();
        int FFF = driversLicense.getFirstNameMiddleInitial();
        String YY = String.valueOf(driversLicense.getBirthYear());
        int DDD = driversLicense.getBirthMonthDayGender();
        int NN = driversLicense.getOverflow();

        String stringNN = NN + "0";
        YY = YY.charAt(0) + "-" + YY.charAt(1);

        return String.format("%s-%d%s%d-%s", SSSS, FFF, YY, DDD, stringNN);
    }
}
