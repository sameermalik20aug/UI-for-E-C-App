package com.example.samee_mxpl382.uifore_commerceapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerViewAdapter recyclerViewAdapter;
    SearchView searchView;
    final Fragment fragment1 = new HomeFragment();
    final Fragment fragment2 = new DashboardFragment();
    final Fragment fragment3 = new NotificationFragment();
    final Fragment fragment4 = new MoreFragment();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragment1;
    ArrayList<String> arrayList=new ArrayList<>();
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        vp.setAdapter(new vpAdapter(MainActivity.this));
        searchView=findViewById(R.id.searchview);
        bottomNavigationView=findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fm.beginTransaction().add(R.id.main_container,fragment4,"4").hide(fragment4).commit();
        fm.beginTransaction().add(R.id.main_container, fragment3, "3").hide(fragment3).commit();
        fm.beginTransaction().add(R.id.main_container, fragment2, "2").hide(fragment2).commit();
        fm.beginTransaction().add(R.id.main_container,fragment1, "1").commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;

            }

            @Override
            public boolean onQueryTextChange(String s) {

                return false;
            }
        });
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fm.beginTransaction().hide(active).show(fragment1).commit();
                    active = fragment1;
                    return true;

                case R.id.navigation_dashboard:
                    fm.beginTransaction().hide(active).show(fragment2).commit();
                    active = fragment2;
//                    searchView.setVisibility(View.GONE);
                    return true;

                case R.id.navigation_notifications:
                    fm.beginTransaction().hide(active).show(fragment3).commit();
                    active = fragment3;
//                    searchView.setVisibility(View.GONE);
                    return true;
                    case  R.id.navigation_cart:
//                        searchView.setVisibility(View.GONE);
                        return true;
                case R.id.navigation_more:
                    fm.beginTransaction().hide(active).show(fragment4).commit();
                    active = fragment4;
//                    searchView.setVisibility(View.GONE);
                    return true;
            }
            return false;
        }
    };



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
        getMenuInflater().inflate(R.menu.main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_men) {
            Intent i = new Intent(MainActivity.this,GenericActivity.class);
            i.putExtra("object","men");
            startActivity(i);
            // Handle the camera action
        } else if (id == R.id.nav_women) {
            Intent i = new Intent(MainActivity.this,GenericActivity.class);
            i.putExtra("object","women");
            startActivity(i);

        } else if (id == R.id.nav_kids) {
            Intent i = new Intent(MainActivity.this,GenericActivity.class);
            i.putExtra("object","kids");
            startActivity(i);

        } else if (id == R.id.nav_electronics) {
            Intent i = new Intent(MainActivity.this,GenericActivity.class);
            i.putExtra("object","electronics");
            startActivity(i);
        } else if (id == R.id.nav_sports) {
            Intent i = new Intent(MainActivity.this,GenericActivity.class);
            i.putExtra("object","sports");
            startActivity(i);
        } else if (id == R.id.nav_homekitchen) {
            Intent i = new Intent(MainActivity.this,GenericActivity.class);
            i.putExtra("object","home");
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private class vpAdapter extends PagerAdapter {
        LayoutInflater layoutInflater;
        Context cxt;

        public vpAdapter(Context cxt) {
            this.cxt = cxt;
            layoutInflater=(LayoutInflater) cxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {

            return view==((LinearLayout)o);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            View view=layoutInflater.inflate(R.layout.vp_item,container,false);
            ImageView iv=view.findViewById(R.id.iv);
            Picasso.get().load("https://picsum.photos/200/300/?random").into(iv);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((LinearLayout) object);
        }
    }
}
