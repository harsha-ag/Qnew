package com.example.qnew;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qnew.feedpost.postAdapter;
import com.example.qnew.feedpost.postdata;
import com.google.android.material.navigation.NavigationView;

import com.example.qnew.search.searchlists;

import java.util.ArrayList;
import java.util.List;

public class NavigateHome extends AppCompatActivity {
//////
private String[] names={"pradeep","pradeep1"};
    private int[] images={R.drawable.ic_menu_camera,R.drawable.ic_menu_gallery};
    private String[] questions={"asdfsasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf","jklk;jkl;jkl;jkjl;jkl;kj;jkl;jkl;kjl;jkl;jk;k;jlk;jkk;jkl;"};
    private String[] answers={"jklk;jkl;jkl;jkjl;jkl;kj;jkl;jkl;kjl;jkl;jk;k;jlk;jkk;jkl;","asdfsasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf"};
    private int[] lcounts={20,30};
    private int[] dcounts={2,3};
    private List<postdata> sData=new ArrayList<>();
    private RecyclerView recyclerView;
    ///////
    private AppBarConfiguration mAppBarConfiguration;
    private String searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
///////


        ///////
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigate_home, menu);
        MenuItem.OnActionExpandListener onActionExpandListener = new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                Log.d("TEST", "expanded");
                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                Log.d("TEST", "collapsed");
                return true;
            }
        };
        menu.findItem( R.id.search ).setOnActionExpandListener( onActionExpandListener );
        SearchView searchView=(SearchView) menu.findItem( R.id.search ).getActionView();
        searchView.setQueryHint( "Search data here....." );
        SearchManager searchManager = (SearchManager)getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo( searchManager.getSearchableInfo(getComponentName()));
    /////
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                getInput(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });
        /////

        return true;
    }

    private void getInput(String query) {
        Intent in = new Intent(NavigateHome.this, searchlists.class);
        in.putExtra("TITLE", query);
        startActivity(in);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    //////////

    //////////
}
