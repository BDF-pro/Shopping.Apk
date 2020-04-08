package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    Integer[] image = {R.drawable.aliexpress,R.drawable.gearbest,
            R.drawable.alibaba,R.drawable.banggood,R.drawable.amazon};
    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_recycler_view);
        getSupportActionBar().hide();

        list.add("AliExpress");
        list.add("GearBest");
        list.add("Alibaba");
        list.add("Banggood");
        list.add("Amazon");
        list.add("Sobre");
        /*list.add("Sobre");
        list.add("PagalWorld");*/

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(image,this,list,RecyclerViewActivity.this);
        recyclerView.setAdapter(adapter);
    }

    public void changeActivity(int adapterPosition) {
        Intent i;
        switch (adapterPosition){
            case 0:
                i = new Intent(RecyclerViewActivity.this,MainActivity.class);
                startActivity(i);
                break;
            case 1:
                i = new Intent(RecyclerViewActivity.this,GearBestActivity.class);
                startActivity(i);
                break;
            case 2:
                 i = new Intent(RecyclerViewActivity.this,AlibabaActivity.class);
                startActivity(i);
                break;
            case 3:
                i = new Intent(RecyclerViewActivity.this,BanggoodActivity.class);
                startActivity(i);
                break;
            case 4:
                i = new Intent(RecyclerViewActivity.this,AmazonActivity.class);
                startActivity(i);
                break;
            case 5:
                i = new Intent(RecyclerViewActivity.this,SobreActivity.class);
                startActivity(i);
                break;
            /*case 6:
                i = new Intent(RecyclerViewActivity.this,PagalworldActivity.class);
                startActivity(i);
                break;*/
        }
    }
}
