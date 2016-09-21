package com.example.elmclean.program1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FacultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
