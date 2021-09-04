package com.amulya.mysampleapp.viewmodel;

import android.app.Application;

import androidx.databinding.ObservableField;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.amulya.mysampleapp.utility.bindings.OnTextChangedListener;
import com.amulya.mysampleapp.utils.ApplicationUtility;

public class CountViewModel extends ViewModel {

    public final ObservableField<String> errorInputno = new ObservableField<>();
    public final ObservableField<String> testResult = new ObservableField<>();
    public final ObservableField<String> inputnumber = new ObservableField<>();

    public CountViewModel() {
        super();
    }

    public String getInputnumber() {
        return inputnumber.get();
    }


    public OnTextChangedListener getTextChanged() {
        return text -> {
            inputnumber.set(text.trim());
        };
    }

    public void onButtonClicked() {
        if (inputnumber.get() == null || inputnumber.get().equals("")) {
            errorInputno.set("Input field is blank.");
            testResult.set("");
        } else {
            errorInputno.set("");
            StringBuilder apendentStr = new StringBuilder();
            for (String str : ApplicationUtility.getOccuringChar(inputnumber.get())) {
                apendentStr.append(str).append("\n");
            }
            testResult.set(apendentStr.toString());
        }

    }

}