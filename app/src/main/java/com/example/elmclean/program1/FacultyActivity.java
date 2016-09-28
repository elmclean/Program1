package com.example.elmclean.program1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class FacultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Spinner spinner = (Spinner) findViewById(R.id.faculty_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.faculty_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                // An item was selected. You can retrieve the selected item using
                parent.getItemAtPosition(pos);
                if(pos == 0) {
                    ImageView facultyImage = (ImageView) findViewById(R.id.facultyImage);
                    facultyImage.setImageResource(R.drawable.il_hyung_cho);

                    TextView titleView = (TextView)findViewById(R.id.facultyTitle);
                    titleView.setText(getString(R.string.cho));

                    TextView bioView = (TextView) findViewById(R.id.facultyBio);
                    bioView.setText(getString(R.string.cho_bio));
                } else if(pos == 1) {
                    ImageView facultyImage = (ImageView) findViewById(R.id.facultyImage);
                    facultyImage.setImageResource(R.drawable.moe_bidgoli);

                    TextView titleView = (TextView)findViewById(R.id.facultyTitle);
                    titleView.setText(getString(R.string.bidgoli));

                    TextView bioView = (TextView) findViewById(R.id.facultyBio);
                    bioView.setText(getString(R.string.bidgoli_bio));
                } else if(pos == 2){
                    ImageView facultyImage = (ImageView) findViewById(R.id.facultyImage);
                    facultyImage.setImageResource(R.drawable.george_corser);

                    TextView titleView = (TextView)findViewById(R.id.facultyTitle);
                    titleView.setText(getString(R.string.corser));

                    TextView bioView = (TextView) findViewById(R.id.facultyBio);
                    bioView.setText(getString(R.string.corser_bio));
                } else {
                    ImageView facultyImage = (ImageView) findViewById(R.id.facultyImage);
                    facultyImage.setImageResource(R.drawable.poonam_dharam);

                    TextView titleView = (TextView)findViewById(R.id.facultyTitle);
                    titleView.setText(getString(R.string.dharam));

                    TextView bioView = (TextView) findViewById(R.id.facultyBio);
                    bioView.setText(getString(R.string.dharam_bio));
                }
            }

            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {
            case R.id.action_main:
                switchMain();
                return true;
            case R.id.action_faculty:
                switchFaculty();
                return true;
            case R.id.action_courses:
                switchCourses();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void switchMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void switchFaculty() {
        Intent intent = new Intent(this, FacultyActivity.class);
        startActivity(intent);
    }

    private void switchCourses() {
        Intent intent = new Intent(this, CourseGridActivity.class);
        startActivity(intent);
    }
}

