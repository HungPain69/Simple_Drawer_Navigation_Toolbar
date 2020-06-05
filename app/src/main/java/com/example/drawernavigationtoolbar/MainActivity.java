package com.example.drawernavigationtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements  NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    ActionBarDrawerToggle mToggle;
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }

    private void Init() {
        mDrawerLayout = findViewById(R.id.drawer);
        mNavigationView = findViewById(R.id.navigation_view);
        mToolbar = findViewById(R.id.toolbar);

        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setNavigationIcon(R.drawable.ic_menu);
        setSupportActionBar(mToolbar);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}