package com.caren.chatme;

/**
 * Created by Caren on 8/11/14.
 */
public class Contact {

    String name;
    String number;

    public Contact(String cName, String cNumber) {
        name = cName;
        number = cNumber;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

}
