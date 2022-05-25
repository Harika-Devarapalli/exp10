package com.example.exp10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {
    private DrawerLayout drawer;
    public NavigationView navigationview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationview=findViewById(R.id.nav_view);
        navigationview.setNavigationItemSelectedListener(this);
        drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
 switch(item.getItemId())
 {
     case R.id.exp5:
         Toast.makeText(this,"exp5 is clicked",Toast.LENGTH_LONG).show();
         Intent i5=new Intent(getApplicationContext(),exp5main.class);
         startActivity(i5);
         break;
     case R.id.exp9:
         Toast.makeText(this,"exp9 clicked",Toast.LENGTH_LONG).show();
         Intent i9=new Intent(getApplicationContext(),exp9main.class);
         startActivity(i9);
         break;
     case R.id.exp4:
         Toast.makeText(this,"exp4 clicked",Toast.LENGTH_LONG).show();
         Intent i4=new Intent(getApplicationContext(),exp4main.class);
         startActivity(i4);
         break;
     case R.id.exp6:
         Toast.makeText(this,"exp6 clicked",Toast.LENGTH_LONG).show();
         Intent i6=new Intent(getApplicationContext(),exp6main.class);
         startActivity(i6);
         break;
     case R.id.exp7:
         Toast.makeText(this,"exp7 clicked",Toast.LENGTH_LONG).show();
         Intent i7=new Intent(getApplicationContext(),exp7main.class);
         startActivity(i7);
         break;

 }
 drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}