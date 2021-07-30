package com.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private int save = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();
        textView = findViewById(R.id.textView);
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        instanceState.putSerializable("key" , save);
    }
    protected void onRestoreInstanceState(@NonNull Bundle instanceState) {
        super.onRestoreInstanceState(instanceState);
        save = (int)instanceState.getSerializable("key");
        textView.setText(String.valueOf(save));
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonOne:
                save = save*10+1;
                textView.setText(String.valueOf(save));
                break;
            case R.id.buttonTwo:
                save = save*10+2;
                textView.setText(String.valueOf(save));
                break;
            case R.id.buttonThree:
                save = save*10+3;
                textView.setText(String.valueOf(save));
                break;
            case R.id.buttonFour:
                save = save*10+4;
                textView.setText(String.valueOf(save));
                break;
            case R.id.buttonFive:
                save = save*10+5;
                textView.setText(String.valueOf(save));
                break;
            case R.id.buttonSix:
                save = save*10+6;
                textView.setText(String.valueOf(save));
                break;
            case R.id.buttonSeven:
                save = save*10+7;
                textView.setText(String.valueOf(save));
                break;
            case R.id.buttonEight:
                save = save*10+8;
                textView.setText(String.valueOf(save));
                break;
            case R.id.buttonNine:
                save = save*10+9;
                textView.setText(String.valueOf(save));
                break;
            case R.id.buttonZero:
                save = save*10;
                textView.setText(String.valueOf(save));
                break;
            case R.id.buttonSum:
                Toast.makeText(getApplicationContext(), "Ждите суммируем...", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonDif:
                Toast.makeText(getApplicationContext(), "Ждите вычитаем...", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonCom:
                Toast.makeText(getApplicationContext(), "Ждите умнажаем...", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonDiv:
                Toast.makeText(getApplicationContext(), "Ждите делим...", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonEqual:
                Toast.makeText(getApplicationContext(), "Просто ждите...", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonClear:
                save = 0;
                textView.setText(String.valueOf(save));
                Toast.makeText(getApplicationContext(), "Очищено", Toast.LENGTH_LONG).show();
                break;
        }
        if(save > Integer.MAX_VALUE/100){
            save = 0;
            Toast.makeText(getApplicationContext(), "Очищено", Toast.LENGTH_LONG).show();
        }
    }
    private void initButton() {
        Button buttonOne = findViewById(R.id.buttonOne);
        Button buttonTwo = findViewById(R.id.buttonTwo);
        Button buttonThree = findViewById(R.id.buttonThree);
        Button buttonFour = findViewById(R.id.buttonFour);
        Button buttonEqual = findViewById(R.id.buttonEqual);
        Button buttonFive = findViewById(R.id.buttonFive);
        Button buttonSix = findViewById(R.id.buttonSix);
        Button buttonSeven = findViewById(R.id.buttonSeven);
        Button buttonEight = findViewById(R.id.buttonEight);
        Button buttonNine = findViewById(R.id.buttonNine);
        Button buttonZero = findViewById(R.id.buttonZero);
        Button buttonSum = findViewById(R.id.buttonSum);
        Button buttonDif = findViewById(R.id.buttonDif);
        Button buttonDiv = findViewById(R.id.buttonDiv);
        Button buttonCom = findViewById(R.id.buttonCom);
        Button buttonClear = findViewById(R.id.buttonClear);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonZero.setOnClickListener(this);
        buttonSum.setOnClickListener(this);
        buttonDif.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonCom.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
    }
}