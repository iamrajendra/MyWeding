package com.iamrajendra.wedding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.iamrajendra.wedding.adapter.ProgrameAdapter;
import com.iamrajendra.wedding.model.Programe;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private RecyclerView mRecyclerView_programeList;
    private Activity mActivity;
    private Context mContext;
    protected ProgrameAdapter mProgrameAdapter_programeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        configToolbar();
        populateProgrameList();


    }

    private void populateProgrameList() {
        mProgrameAdapter_programeList = new ProgrameAdapter(mContext, mActivity, getProgrameList()) {
            @Override
            protected void onClick(int position) {
                callCardActivity();

            }
        };
        mRecyclerView_programeList.setAdapter(mProgrameAdapter_programeList);
        mRecyclerView_programeList.addItemDecoration(new SpacesItemDecoration(2));

    }

    private void callCardActivity() {
    Intent intent_cardActivity = new Intent(mContext,Card.class);
        startActivity(intent_cardActivity);
    }

    private void configToolbar() {

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


    }

    private void init() {
        mActivity = this;
        mContext = getApplicationContext();
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        mRecyclerView_programeList = (RecyclerView) findViewById(R.id.activity_main_programe_list_rva);
        mRecyclerView_programeList.setLayoutManager(new LinearLayoutManager(mContext));
    }

    public List<Programe> getProgrameList() {
        List<Programe> programes = new ArrayList<>();
        programes.add(new Programe(R.drawable.bg_barat, "Tilak","11 november 2016"));
        programes.add(new Programe(R.drawable.bg_maan, "Maan","12 november 2016"));
        programes.add(new Programe(R.drawable.bg_barat, "Baarat","13 november 2016"));
        programes.add(new Programe(R.drawable.bg_barat, "Reception","14 november 2016"));
        return programes;
    }
}
