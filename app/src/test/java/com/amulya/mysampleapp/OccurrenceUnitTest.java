package com.amulya.mysampleapp;

import android.app.Application;

import com.amulya.mysampleapp.ui.activity.MainActivity;
import com.amulya.mysampleapp.utils.AppClass;
import com.amulya.mysampleapp.utils.ApplicationUtility;
import com.amulya.mysampleapp.viewmodel.CountViewModel;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class OccurrenceUnitTest {

    @Test
    public void occurrence_isCorrect() {
        StringBuilder apendentStr = new StringBuilder();
        ArrayList<String> arrayStr =  ApplicationUtility.getOccuringChar("aam");
        for (String str : arrayStr) {
            apendentStr.append(str).append(" ");
        }
        assertEquals("Result : ", "Number of Occurrence of 'a' is:- 2 Number of Occurrence of 'm' is:- 1 ", apendentStr.toString());
    }
}