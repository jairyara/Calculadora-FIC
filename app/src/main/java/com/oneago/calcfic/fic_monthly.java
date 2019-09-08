package com.oneago.calcfic;

import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class fic_monthly extends AppCompatActivity {

    TextInputEditText workers;
    TextView finalresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fic_monthly);
        workers = findViewById(R.id.editText_workers);
        finalresult = findViewById(R.id.textView_result_fic_month);
        workers.requestFocus();
        InputMethodManager keyboard = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        keyboard.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
    }

    @Override
    protected void onStart() {
        super.onStart();
        workers.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    double result = (double) 781242 / 40 * Double.parseDouble(String.valueOf(s));
                    Log.d("Valor de resultado", String.valueOf(result));
                    String format = new DecimalFormat("##,###,###.00").format(result);
                    finalresult.setText(" $ " + format);
                } catch (Exception ignore) {
                    finalresult.setText(" $ 0");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


}
