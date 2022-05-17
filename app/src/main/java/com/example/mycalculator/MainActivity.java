package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numberText;
    Button number0, number1, number2, number3, number4, number5, number6, number7, number8, number9,
            plus, minus, multiplication, division, equalsSign, clear, backspace, pmbutton, decimalPoint,
            bracket;
    String numberSave, numberSave2;
    int numberSumI, where=0;
    float numberSumF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText = findViewById(R.id.numberText);
        number0 = findViewById(R.id.number0);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 = findViewById(R.id.number3);
        number4 = findViewById(R.id.number4);
        number5 = findViewById(R.id.number5);
        number6 = findViewById(R.id.number6);
        number7 = findViewById(R.id.number7);
        number8 = findViewById(R.id.number8);
        number9 = findViewById(R.id.number9);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);
        equalsSign = findViewById(R.id.equalsSign);
        clear = findViewById(R.id.clear);
        backspace = findViewById(R.id.backspace);
        pmbutton = findViewById(R.id.pmbutton);
        decimalPoint = findViewById(R.id.decimalPoint);
        bracket = findViewById(R.id.bracket);
    }

    public void VariousButton(View view){
        if(view==number0){
            numberText.setText(numberText.getText().toString()+0);
            numberSave2 = numberText.getText().toString();
        }else if(view==number1){
            numberText.setText(numberText.getText().toString()+1);
            numberSave2 = numberText.getText().toString();
        }else if(view==number2){
            numberText.setText(numberText.getText().toString()+2);
            numberSave2 = numberText.getText().toString();
        }else if(view==number3){
            numberText.setText(numberText.getText().toString()+3);
            numberSave2 = numberText.getText().toString();
        }else if(view==number4){
            numberText.setText(numberText.getText().toString()+4);
            numberSave2 = numberText.getText().toString();
        }else if(view==number5){
            numberText.setText(numberText.getText().toString()+5);
            numberSave2 = numberText.getText().toString();
        }else if(view==number6){
            numberText.setText(numberText.getText().toString()+6);
            numberSave2 = numberText.getText().toString();
        }else if(view==number7){
            numberText.setText(numberText.getText().toString()+7);
            numberSave2 = numberText.getText().toString();
        }else if(view==number8){
            numberText.setText(numberText.getText().toString()+8);
            numberSave2 = numberText.getText().toString();
        }else if(view==number9){
            numberText.setText(numberText.getText().toString()+9);
            numberSave2 = numberText.getText().toString();
        }else if(view==plus){
            if(numberText.getText().toString() == ""){

            }else if(numberText.getText().toString() != null) {
                numberSave = numberText.getText().toString();
                numberText.setText("");
                where = 1;
            }
        }else if(view==minus){
            if(numberText.getText().toString() == ""){

            }else if(numberText.getText().toString() != null) {
                numberSave = numberText.getText().toString();
                numberText.setText("");
                where = 2;
            }
        }else if(view==multiplication){
            if(numberText.getText().toString() == ""){

            }else if(numberText.getText().toString() != null) {
                numberSave = numberText.getText().toString();
                numberText.setText("");
                where = 3;
            }
        }else if(view==division){
            if(numberText.getText().toString() == ""){

            }else if(numberText.getText().toString() != null) {
                numberSave = numberText.getText().toString();
                numberText.setText("");
                where = 4;
            }
        }else if(view==equalsSign){
            if(where==1){
//                if(numberText.getText().toString().contains(")")){
//
//                }
                if(numberSave.contains(".") || numberSave2.contains(".")){
                    numberSumF = Float.valueOf(numberSave) + Float.valueOf(numberSave2);
                    if(String.valueOf(numberSumF).contains(".0")){
                        numberSumI = (int)numberSumF;
                        numberText.setText(Integer.toString(numberSumI));
                        numberSave = numberSumI+"";
                    }else{
                        numberText.setText(Float.toString(numberSumF));
                        numberSave = numberSumF+"";
                    }
                }else {
                    numberSumI = Integer.valueOf(numberSave) + Integer.valueOf(numberSave2);
                    numberText.setText(Integer.toString(numberSumI));
                    numberSave = numberSumI+"";
                }
            }else if(where==2){
                if(numberSave.contains(".") || numberSave2.contains(".")){
                    numberSumF = Float.valueOf(numberSave) - Float.valueOf(numberSave2);
                    if(String.valueOf(numberSumF).contains(".0")){
                        numberSumI = (int)numberSumF;
                        numberText.setText(Integer.toString(numberSumI));
                        numberSave = numberSumI+"";
                    }else {
                        numberText.setText(Float.toString(numberSumF));
                        numberSave = numberSumF+"";
                    }
                }else {
                    numberSumI = Integer.valueOf(numberSave) - Integer.valueOf(numberSave2);
                    numberText.setText(Integer.toString(numberSumI));
                    numberSave = numberSumI+"";
                }
            }else if(where==3){
                if(numberSave.contains(".") || numberSave2.contains(".")){
                    numberSumF = Float.valueOf(numberSave) * Float.valueOf(numberSave2);
                    if(String.valueOf(numberSumF).contains(".0")){
                        numberSumI = (int)numberSumF;
                        numberText.setText(Integer.toString(numberSumI));
                        numberSave = numberSumI+"";
                    }else {
                        numberText.setText(Float.toString(numberSumF));
                        numberSave = numberSumF+"";
                    }
                }else {
                    numberSumI = Integer.valueOf(numberSave) * Integer.valueOf(numberSave2);
                    numberText.setText(Integer.toString(numberSumI));
                    numberSave = numberSumI+"";
                }
            }else if(where==4){
                if(numberSave.contains(".") || numberSave2.contains(".")){
                    numberSumF = Float.valueOf(numberSave) / Float.valueOf(numberSave2);
                    if(String.valueOf(numberSumF).contains(".0")){
                        numberSumI = (int)numberSumF;
                        numberText.setText(Integer.toString(numberSumI));
                        numberSave = numberSumI+"";
                    }else {
                        numberText.setText(Float.toString(numberSumF));
                        numberSave = numberSumF+"";
                    }
                }else {
                    numberSumI = Integer.valueOf(numberSave) / Integer.valueOf(numberSave2);
                    numberText.setText(Integer.toString(numberSumI));
                    numberSave = numberSumI+"";
                }
            }
        }
        else if(view==clear){
            numberText.setText("");
        }
        else if(view==backspace){
            if(numberText.getText().equals("")){
                numberText.setText("");
            }else{
                numberText.setText(numberText.getText().toString().substring(0,numberText.getText().toString().length()-1));
            }
        }
        else if(view==pmbutton){
            String numberstr = numberText.getText().toString();
            if(numberstr.contains("-")){
                numberstr = numberstr.replace("-","");
                numberText.setText(numberstr);
            }else {
                numberText.setText("-"+numberText.getText().toString());
            }
        }
        else if(view==decimalPoint){
            numberText.setText(numberText.getText().toString()+".");
        }
//        else if(view==bracket){
//            if(numberText.getText().toString().contains("(")){
//                numberText.setText(numberText.getText().toString()+")");
//            }else{
//                numberText.setText("(");
//            }
//        }
    }
}