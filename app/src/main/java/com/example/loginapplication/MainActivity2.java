package com.example.loginapplication;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView rc;

    myCustomAdapter cus; /*myCustomAdapter is the name of class*/

    public static interface RecyclerViewClickListener{
        void onClick();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rc = (RecyclerView)findViewById(R.id.mycycle);
        //mycycle is the id name of recycler view
        cus = new myCustomAdapter(this,new RecyclerViewClickListener(){
            @Override
            public void onClick(){
                System.out.println("dnfn");
                Intent i1 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(i1);
            }
        });
        rc.setAdapter(cus);
        rc.setLayoutManager(new LinearLayoutManager(this));



    }





}
