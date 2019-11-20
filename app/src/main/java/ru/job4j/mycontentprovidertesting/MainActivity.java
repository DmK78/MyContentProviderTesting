package ru.job4j.mycontentprovidertesting;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final Uri CONTENT_URI = Uri.parse("content://ru.job4j.todolist/tasks");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cursor cursor = this.getContentResolver()
                .query(CONTENT_URI, null, null, null, null, null);
        while (cursor.moveToNext()) {
            Log.d("ContentProvider", cursor.getString(1));
        }
    }
}
