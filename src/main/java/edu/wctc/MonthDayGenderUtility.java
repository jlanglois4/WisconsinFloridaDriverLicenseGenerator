package edu.wctc;

import java.time.LocalDate;

public class MonthDayGenderUtility {
    private static final int MOD_MALE = 0;
    private static final int MOD_FEMALE = 500;
    private static final char CODE_MALE = 'M';
    private static final char CODE_FEMALE = 'F';


    public static int encodeMonthDayGender(int year, int month, int day, char genderCode)
            throws UnknownGenderCodeException, InvalidBirthdayException {

        int genderModConstant;

        if (genderCode != CODE_MALE && genderCode != CODE_FEMALE) {

            throw new UnknownGenderCodeException(genderCode);
        }

        try {
            LocalDate.of(year,month,day);
        } catch (Exception e){
            throw new InvalidBirthdayException(year,month,day);
        }

        if (genderCode == CODE_MALE){
            genderModConstant = MOD_MALE;
        } else {
            genderModConstant = MOD_FEMALE;
        }

            return (month -1) * 40 + day + genderModConstant;
    }


}
