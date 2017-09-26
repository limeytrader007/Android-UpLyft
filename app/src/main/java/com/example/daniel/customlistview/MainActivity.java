package com.example.daniel.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.mural1, R.drawable.mural1, R.drawable.mural1, R.drawable.mural1, R.drawable.mural1, R.drawable.mural1};

    String[] names = {"Example 1", "Example 2", "Example 3", "Example 4", "Example 5", "Example 6"};
    String[] descriptions = {"Desc1", "Desc2", "Desc3", "Desc4", "Desc5", "Desc6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = (ListView)findViewById(R.id.listview);
        ArrayList<SchoolSubject> schoolSubjects = new ArrayList<SchoolSubject>();

        SchoolSubject subject1 = new SchoolSubject("Math", false, R.drawable.mural1, true);
        SchoolSubject subject2 = new SchoolSubject("Science", false, R.drawable.mural1, false);
        SchoolSubject subject3 = new SchoolSubject("History", false, R.drawable.mural1, true);
        SchoolSubject subject4 = new SchoolSubject("Geography", false, R.drawable.mural1, false);

        schoolSubjects.add(subject1);
        schoolSubjects.add(subject2);
        schoolSubjects.add(subject3);
        schoolSubjects.add(subject4);

        SubjectAdapter adapter = new SubjectAdapter(getApplicationContext(), R.layout.customlayout, schoolSubjects);
        listview.setAdapter(adapter);
    }

}
