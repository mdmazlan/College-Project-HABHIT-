package com.www.habhit.edu.bd;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;

public class HabhitMainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jononata_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        gridView = (GridView) findViewById(R.id.grid_view);
        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // Sending image id to FullScreenActivity

                // passing array index
                //i.putExtra("id", position);
                if(position==0) {
                    Intent SoronioBaktitto = new Intent(getApplicationContext(), SoronioBaktittoActivity.class);
                    startActivity(SoronioBaktitto);
                }else if (position==1) {
                    Intent ProtisthanPoriciti = new Intent(getApplicationContext(), ProtisthanPoricitiActivity.class);
                    startActivity(ProtisthanPoriciti);
                }
                else if (position==2) {
                    Intent ProtisthanPoriciti = new Intent(getApplicationContext(), HabhiterBishesottoActivity.class);
                    startActivity(ProtisthanPoriciti);
                }
                else if (position==3) {
                    Intent ProtisthanPoriciti = new Intent(getApplicationContext(),AmaderUddessoActivity.class);
                    startActivity(ProtisthanPoriciti);
                }
                else if (position==4) {
                    Intent ProtisthanPoriciti = new Intent(getApplicationContext(), DiplomaUdesshoActivity.class);
                    startActivity(ProtisthanPoriciti);
                }
                else if (position==5) {
                    Intent ProtisthanPoriciti = new Intent(getApplicationContext(), HabhitCourseSomuhoActivity.class);
                    startActivity(ProtisthanPoriciti);
                }
                else if (position==6) {
                    Intent ProtisthanPoriciti = new Intent(getApplicationContext(), ShikkhartiderKoronioActivity.class);
                    startActivity(ProtisthanPoriciti);
                }
                else if (position==7) {
                    //Intent ProtisthanPoriciti = new Intent(getApplicationContext(), CourseSomuhMainActivity.class);
                    Intent ProtisthanPoriciti = new Intent(getApplicationContext(), TechnologySomuhActivity.class);
                    startActivity(ProtisthanPoriciti);
                }
                else if (position==8) {
                    Intent ProtisthanPoriciti = new Intent(getApplicationContext(), DressCodeActivity.class);
                    startActivity(ProtisthanPoriciti);
                }
                else if (position==9) {
                    Intent ProtisthanPoriciti = new Intent(getApplicationContext(), OnnanoProtisthanSomuhActivity.class);
                    startActivity(ProtisthanPoriciti);
                }
                else if (position==10) {
                    Intent ProtisthanPoriciti = new Intent(getApplicationContext(), AboutUsActivity.class);
                    startActivity(ProtisthanPoriciti);
                }
                else if (position==11) {
                    Intent ProtisthanPoriciti = new Intent(getApplicationContext(), AboutUsActivity.class);
                    startActivity(ProtisthanPoriciti);
                }
            }
            });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "this page is still under construction.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent FloatingActionButton = new Intent(getApplicationContext(), FloatingActionButton.class);

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.jononata_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent constructionActivity = new Intent(getApplicationContext(), constructionActivity.class);
            startActivity(constructionActivity);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent constructionActivity = new Intent(getApplicationContext(), constructionActivity.class);
            startActivity(constructionActivity);

        } else if (id == R.id.nav_gallery) {
            Intent constructionActivity = new Intent(getApplicationContext(), constructionActivity.class);
            startActivity(constructionActivity);


        } else if (id == R.id.nav_location) {
            Intent constructionActivity = new Intent(getApplicationContext(), maps.class);
            startActivity(constructionActivity);


        } else if (id == R.id.nav_share) {
            Intent constructionActivity = new Intent(getApplicationContext(), constructionActivity.class);
            startActivity(constructionActivity);


        } else if (id == R.id.nav_send) {
            Intent constructionActivity = new Intent(getApplicationContext(), constructionActivity.class);
            startActivity(constructionActivity);


        } else if (id == R.id.nav_about) {
            Intent about = new Intent(getApplicationContext(), AboutUsActivity.class);
            startActivity(about);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}