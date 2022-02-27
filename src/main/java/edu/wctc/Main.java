package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DriversLicense driversLicense = new DriversLicense();
        System.out.println("Enter your last name.");

        try {
            String name = LastNameUtility.encodeLastName(scanner.nextLine());
            driversLicense.setSoundexCode(name);
        } catch (Exception e) {
            System.exit(0);
        }

        System.out.println("Enter your first name.");
        String firstName = scanner.nextLine().toUpperCase();
        System.out.println("Enter your middle initial. Leave blank if needed.");
        String middleInitial = scanner.nextLine().toUpperCase();

        try {
          int firstMiddle = FirstNameUtility.encodeFirstName(firstName, middleInitial);
          driversLicense.setFirstNameMiddleInitial(firstMiddle);
        } catch (Exception e) {
            System.exit(0);
        }


        System.out.println("Enter your month of birth. (1-12)");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your day of birth. (1-31)");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your year of birth.");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your gender (M/F)");
        String genderString = scanner.nextLine();
        String stringGender = genderString.toUpperCase();
        char gender = stringGender.charAt(0);

        try {
           int monthDayGender = MonthDayGenderUtility.encodeMonthDayGender(year, month, day, gender);
           driversLicense.setBirthMonthDayGender(monthDayGender);
        } catch (Exception e) {
            System.exit(0);
        }
        String yearString = (year+"");
        String yearInt = String.valueOf(yearString.charAt(2)) + yearString.charAt(3);

        driversLicense.setBirthYear(Integer.parseInt(yearInt));

        System.out.println(WisconsinFormatter.formatLicenseNumber(driversLicense));
        System.out.println(FloridaFormatter.formatLicenseNumber(driversLicense));
    }
}
