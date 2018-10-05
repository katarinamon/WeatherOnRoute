package com.kpervan_pkbarba.weatheronroute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonGoClick() {
        EditText textBoxFrom = findViewById(R.id.textBoxFrom);
        String locationFrom = textBoxFrom.getText().toString();

        EditText textBoxTo = findViewById(R.id.textBoxTo);
        String locationTo = textBoxTo.getText().toString();

        WeatherInformationService service = new WeatherInformationService(locationFrom, locationTo);
    }
}
