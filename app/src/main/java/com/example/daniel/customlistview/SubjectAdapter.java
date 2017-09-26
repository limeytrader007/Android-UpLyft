package com.example.daniel.customlistview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Daniel on 9/26/2017.
 */

public class SubjectAdapter extends ArrayAdapter<SchoolSubject> {

    Context context;
    int resource;
    ArrayList<SchoolSubject> subjects = null;

    public static final int FAVORITE_SUBJECT = 0;
    public static final int REGULAR_SUBJECT = 1;

    public SubjectAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<SchoolSubject> subjects) {
        super(context, resource, subjects);

        this.context = context;
        this.resource = resource;
        this.subjects = subjects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        SchoolSubject subject = subjects.get(position);
        if(convertView == null){
            if(getItemViewType(position) == REGULAR_SUBJECT) {
                convertView = LayoutInflater.from(context).inflate(R.layout.customlayout, parent, false);
            } else {
                convertView = LayoutInflater.from(context).inflate(R.layout.row_layout, parent, false);
            }
        }

        if(getItemViewType(position) == REGULAR_SUBJECT){
            TextView subjectName = (TextView)convertView.findViewById(R.id.textView_name);
            TextView description = (TextView)convertView.findViewById(R.id.textView_desc);
            ImageView imageView = (ImageView)convertView.findViewById(R.id.imageView2);

            subjectName.setText(subject.name);
            imageView.setImageResource(subject.imageId);
        }
        
        return convertView;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        SchoolSubject subject = subjects.get(position);
        if(subject.isFavorite)
            return FAVORITE_SUBJECT;
        else
            return REGULAR_SUBJECT;
    }
}
