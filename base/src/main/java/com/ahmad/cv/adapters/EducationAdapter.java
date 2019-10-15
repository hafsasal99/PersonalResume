package com.ahmad.cv.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmad.cv.model.DemoItem;
import com.ahmad.cv.base.R;

import java.util.List;
public class EducationAdapter extends RecyclerView.Adapter
{
    private List<DemoItem> demoItemList;
    private Context context;
    private ImageView logo;
    public EducationAdapter(List<DemoItem> list,Context context)
    {
        this.demoItemList=list;
        this.context=context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.education,parent,false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

    }

    @Override
    public int getItemCount() {
        return demoItemList.size();
    }
    public class viewHolder extends RecyclerView.ViewHolder {
        viewHolder(View view)
        {
            super(view);
        }
    }
}
