package com.example.hw7.models;

import android.app.Activity;
import android.content.Context;

import com.example.hw7.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum AttributeEnum {

    // Need to match the service values
    Unknown(0),

    Attack(1),

    Defense(2),

    Speed(3);

    // Returns the Localized String
    // Make sure all strings are in the string table
    @Override
    public String toString() {
        switch(this){
            case Unknown:
                return "Unknown";
            case Attack:
                return "Attack";
            case Defense:
                return "Defense";
            case Speed:
                return "Speed";
        }
        return "Unknown";
    }

    private int intValue;
    private static final List<String> VALUES;

    static {
        VALUES = new ArrayList<>();
        for (AttributeEnum someEnum : AttributeEnum.values()) {
            VALUES.add(someEnum.toString());
        }
    }

    public static List<String> getValues() {
        return Collections.unmodifiableList(VALUES);
    }

    AttributeEnum(int value) {
        intValue = value;
    }

    // Lookup the string for the value
    public static String getString(int value){
        for (AttributeEnum item : AttributeEnum.values()) {
            if (value == item.intValue){
                return item.toString();
            }
        }
        return null;
    }

    // Lookup the value for the string
    public static int getValue(String string){
        for (AttributeEnum item : AttributeEnum.values()) {
            if (string.equals(item.toString())){
                return item.intValue;
            }
        }
        return -1;
    }
}