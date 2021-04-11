package com.example.gestiononglets;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;

import com.example.gestiononglets.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter sectionsPagerAdapter;
    private ViewPager viewPager;
//    private TabLayout tabs;
    private Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
//        tabs = findViewById(R.id.tabs);
//        tabs.setupWithViewPager(viewPager);
        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
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
        int id = item.getItemId();

        String msg;
        switch (id) {
            case R.id.action_settings :
                msg = "You selected \"Settings\"";
                break;
            case R.id.action_accessibility :
                msg = "You selected \"Accessibility\"";
                break;
            case R.id.action_add_shopping_cart :
                msg = "You selected \"Add to Shopping Cart\"";
                break;
            case R.id.action_account :
                msg = "You selected \"My Account\"";
                break;
            case R.id.action_alarm :
                msg = "You selected \"Alarm\"";
                break;
            default:
                msg = "Unknown action";
        }
        Snackbar.make(viewPager, msg, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public ViewPager getViewPager() {
        return viewPager;
    }
}