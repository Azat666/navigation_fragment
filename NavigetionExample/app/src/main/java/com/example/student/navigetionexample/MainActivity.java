package com.example.student.navigetionexample;

import android.content.ClipData;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.student.navigetionexample.Fragments.FoureFragment;
import com.example.student.navigetionexample.Fragments.OneFragment;
import com.example.student.navigetionexample.Fragments.ThreeFragment;
import com.example.student.navigetionexample.Fragments.TwoFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FragmentManager fragmentManager = getSupportFragmentManager();


        BottomNavigationView menu = (BottomNavigationView) findViewById(R.id.navigation);
        menu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()) {
                    case R.id.navigation_dashboard:
                        fragmentManager.beginTransaction().replace(R.id.content,new TwoFragment()).commit();
                        return true;
                    case R.id.navigation_home:
                        fragmentManager.beginTransaction().replace(R.id.content,new OneFragment()).commit();
                        return true;
                    case R.id.navigation_notifications:
                        fragmentManager.beginTransaction().replace(R.id.content,new ThreeFragment()).commit();
                        return true;
                    case R.id.navigation_dowundlods:
                        fragmentManager.beginTransaction().replace(R.id.content,new FoureFragment()).commit();
                        return true;
                }
                return false;
            }
        });


    }

}
