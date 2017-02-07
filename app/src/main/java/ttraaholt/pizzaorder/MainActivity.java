package ttraaholt.pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton rdSmall, rdMedium, rdLarge;
    CheckBox cbAddCheese;
    CheckBox cbDelivery;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdSmall = (RadioButton) findViewById(R.id.radioSmall);
        rdMedium = (RadioButton) findViewById(R.id.radioMedium);
        rdLarge = (RadioButton) findViewById(R.id.radioLarge);
        cbAddCheese = (CheckBox) findViewById(R.id.checkBoxAddCheese);
        cbDelivery = (CheckBox) findViewById(R.id.checkBoxDelivery);
        tvResult = (TextView) findViewById(R.id.textViewResult);
    }

    public void onClickCalculate(View view){
        Double total = 0.00;
        if(rdMedium.isChecked()) {
            total = 9.00;
        } else if(rdSmall.isChecked()){
            total = 7.00;
        } else if(rdLarge.isChecked()){
            total = 13.00;
        }
        if(cbAddCheese.isChecked()){
            total = total + 1.75;
        }
        if(cbDelivery.isChecked()){
            total = total + 2.50;
        }
        tvResult.setText(String.format("Your Total is $%.2f", total));

    }
}
