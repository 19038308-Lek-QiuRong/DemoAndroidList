package sg.edu.rp.c346.id19036308.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroid;
    ArrayList<AndroidVersion> androidList;
//    ArrayAdapter<AndroidVersion> aaAndroid;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.listViewAndroid);
        androidList = new ArrayList();
        AndroidVersion av1 = new AndroidVersion("Pie", "9.0");
        androidList.add(av1);
        androidList.add(new AndroidVersion("Oreo", "8.0"));
        androidList.add(new AndroidVersion("Nougat", "7.0"));
        androidList.add(new AndroidVersion("Marshmellow", "6.0"));

//        aaAndroid = new ArrayAdapter(this,R.layout.row,androidList);
        adapter = new CustomAdapter(this,R.layout.row,androidList);
        //lvAndroid.setAdapter(aaAndroid);
        lvAndroid.setAdapter(adapter);
    }
}
