package edu.wctc;

import org.apache.commons.codec.language.Soundex;

public class LastNameUtility {
    private static Soundex soundex = new Soundex();

    public static String encodeLastName(String lastName) throws MissingNameException{
        if(lastName == ""){
            throw new MissingNameException("Last name");
        }
        String encoding = soundex.encode(lastName);
        return encoding;
    }

}
