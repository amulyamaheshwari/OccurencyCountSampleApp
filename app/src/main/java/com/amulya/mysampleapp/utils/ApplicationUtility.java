package com.amulya.mysampleapp.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.util.ArrayList;

public class ApplicationUtility {
    static final int MAX_CHAR = 256;

    /*
     Getting occurring number...
     */
    public static ArrayList<String> getOccuringChar(String str) {
        ArrayList<String> mOccuringChar = new ArrayList<>();
        int count[] = new int[MAX_CHAR];
        int len = str.length();

        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1) {
                mOccuringChar.add("Number of Occurrence of "
                        + "'" + str.charAt(i) + "'"
                        + " is:- " + count[str.charAt(i)]);
            }
        }
        return mOccuringChar;
    }

}
