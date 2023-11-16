package com.example.lab2b_fabian;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    public Integer[] thumbImages = {
            R.drawable.pic01,
            R.drawable.pic02,
            R.drawable.pic03,
            R.drawable.pic04,
            R.drawable.pic05,
            R.drawable.pic06,
            R.drawable.pic07,
            R.drawable.pic08,
            R.drawable.pic09,
            R.drawable.pic10,
            R.drawable.pic11,
            R.drawable.pic12,
            R.drawable.pic13,
            R.drawable.pic14,
            R.drawable.pic15,
            R.drawable.pic16,
            R.drawable.pic17,
            R.drawable.pic18,
            R.drawable.pic19,
            R.drawable.pic20,
            R.drawable.pic21,
    };

    public ImageAdapter(Context c){mContext = c;}

    @Override
    public int getCount(){return thumbImages.length;}

    @Override
    public Object getItem(int position){return thumbImages[position];}

    @Override
    public long getItemId(int position){return 0;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
}
