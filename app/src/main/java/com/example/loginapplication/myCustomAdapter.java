package com.example.loginapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class myCustomAdapter extends RecyclerView.Adapter<myCustomAdapter.MyCustomViewHolder>
{
    String data1[], data2[];
    Context ct;
    private MainActivity2.RecyclerViewClickListener mListener;

    @Override
    public myCustomAdapter.MyCustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater mylayout = LayoutInflater.from(ct);
        View vi = mylayout.inflate(R.layout.activity_main2_1,parent,false);
        return new MyCustomViewHolder(vi);
    }

    public myCustomAdapter(Context ctx,MainActivity2.RecyclerViewClickListener mListener)
    {
        ct = ctx;
        data1 = ct.getResources().getStringArray(R.array.School_name);
        data2 = ct.getResources().getStringArray(R.array.Address);
        this.mListener=mListener;
    }

    @Override
    public void onBindViewHolder(myCustomAdapter.MyCustomViewHolder holder, int position)
    {
        /*holder.tv1.setText(data1[position]);
        holder.tv2.setText(data2[position]);
        holder.img1.findViewById(R.id.imageView);
        holder.img2.findViewById(R.id.imageView2);
        holder.img3.findViewById(R.id.imageView3);*/

        holder.setData(data1[position],data2[position],position);

    }

    @Override
    public int getItemCount()
    {
        return data1.length;
    }

    public class MyCustomViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv1, tv2;
        ImageView img1,img2,img3;
        public MyCustomViewHolder(View itemView)
        {
            super(itemView);
            tv1 = (TextView)itemView.findViewById(R.id.textView);
            tv2 = (TextView)itemView.findViewById(R.id.textView2);
            img1 = (ImageView)itemView.findViewById(R.id.imageView);
            img2 = (ImageView)itemView.findViewById(R.id.imageView2);
            img3 = (ImageView)itemView.findViewById(R.id.imageView3);
        }

        public void setData(String data,String data1,int position){
            tv1.setText(data);
            tv2.setText(data1);
            img3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    mListener.onClick();
                }
            });
        }
    }


}

