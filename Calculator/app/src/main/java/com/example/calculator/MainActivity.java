package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String operator;
    String oldNum;
    Boolean isTrue = true;
    EditText editInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editInput = findViewById(R.id.editInput);
    }

    public void ClickNumber(View view) {
        if(isTrue)
            editInput.setText("");
        isTrue = false;
        String number = editInput.getText().toString();
        switch (view.getId()) {
            case R.id.bu1:
                number = number + "1";
                break;
            case R.id.bu2:
                number = number + "2";
                break;
            case R.id.bu3:
                number = number + "3";
                break;
            case R.id.bu4:
                number = number + "4";
                break;
            case R.id.bu5:
                number = number + "5";
                break;
            case R.id.bu6:
                number = number + "6";
                break;
            case R.id.bu7:
                number = number + "7";
                break;
            case R.id.bu8:
                number = number + "8";
                break;
            case R.id.bu9:
                number = number + "9";
                break;
            case R.id.bu0:
                number = number + "0";
                break;
        }
        editInput.setText(number);
    }

    public void operation(View view) {
        isTrue = true;
        oldNum = editInput.getText().toString();
        switch (view.getId()) {
            case R.id.buMultiply:
                operator: operator = operator="*";
                break;
            case R.id.buMinus:
                operator: operator = operator="-";
                break;
            case R.id.buPlus:
                operator: operator = operator="+";
                break;
            case R.id.buDivide:
                operator: operator = operator="/";
                break;
        }
    }

    public void clickEqual(View view) {
        String newNum = editInput.getText().toString();
        Double result = 0.0;
        switch (operator) {
            case "-" :
                result= Double.parseDouble(oldNum) - Double.parseDouble(newNum);
                break;
            case "+" :
                result= Double.parseDouble(oldNum) + Double.parseDouble(newNum);
                break;
            case "/" :
                result= Double.parseDouble(oldNum) / Double.parseDouble(newNum);
                break;
            case "*" :
                result= Double.parseDouble(oldNum) * Double.parseDouble(newNum);
                break;

        }
        editInput.setText(result+"");
    }

    public void clickCancel(View view) {
        isTrue = true;
        editInput.setText("0");
    }
}