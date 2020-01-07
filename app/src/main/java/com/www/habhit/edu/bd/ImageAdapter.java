package com.www.habhit.edu.bd;

/**
 * Created by MAZLAN on 10/4/2017.
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds ={
            R.drawable.btn1, R.drawable.btn2,
            R.drawable.btn3, R.drawable.btn4,
            R.drawable.btn5, R.drawable.btn6,
            R.drawable.btn7, R.drawable.btn8,
            R.drawable.btn9, R.drawable.btn10,
    };

    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount()
    {
        return mThumbIds.length;
    }
    @Override
    public Object getItem(int position)
    {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
        return imageView;
    }

}
