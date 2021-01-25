package com.example.qnew;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class AddquestionActivity extends Activity implements AdapterView.OnItemSelectedListener {
    Button button;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_addquestion );
        button = findViewById(R.id.bt_addquestion_add);
        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner_addquestion_dropdown );
//create a list of items for the spinner.
        String[] items = new String[]{"Sports", "Movies", "Tech"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);
        Spinner spinner = (Spinner) findViewById(R.id.spinner_addquestion_dropdown );
        spinner.setOnItemSelectedListener(  this );

        button.setOnClickListener( view -> Log.d("DROP",s ) );

    }
    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
          s=parent.getItemAtPosition(pos).toString();

    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}