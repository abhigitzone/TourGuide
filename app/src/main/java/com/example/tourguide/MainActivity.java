package com.example.tourguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_container);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.Navigation_drawer_open, R.string.Navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(this);

        //Default Page to show
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, new FragmentHome()).commit();
            navigationView.setCheckedItem(R.id.home);

        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, new FragmentHome()).commit();
                toolbar.setTitle(R.string.home);
                break;
            case R.id.cafe:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, new FragmentCafe()).commit();
                toolbar.setTitle(R.string.eat_and_drink);
                break;
            case R.id.hotel:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, new FragmentHotel()).commit();
                toolbar.setTitle(R.string.stay);
                break;
            case R.id.events:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, new FragmentEvent()).commit();
                toolbar.setTitle(R.string.events_and_festival);
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
