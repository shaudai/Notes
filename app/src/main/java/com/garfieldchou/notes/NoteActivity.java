package com.garfieldchou.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class NoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        Intent intent = getIntent();

        EditText editText = (EditText) findViewById(R.id.editText);

        editText.setText(MainActivity.noteList.get(intent.getIntExtra("noteIdx", 0)));

        editText.setSelection(editText.getText().length());

    }
}
