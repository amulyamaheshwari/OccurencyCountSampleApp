package com.amulya.mysampleapp.utility.bindings;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.databinding.BindingAdapter;

public class EditTextBindings {

    @BindingAdapter("onTextChanged")
    public static void setOnTextChangedListener(EditText editText, final OnTextChangedListener listener) {
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (listener != null) {
                    listener.onTextChanged(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}