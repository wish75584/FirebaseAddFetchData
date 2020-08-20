package com.stubborn.firebaseaddfetchdata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DataActivity extends AppCompatActivity {

    private TextView id, name, email, contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        id = findViewById(R.id.getID);
        name = findViewById(R.id.getName);
        email = findViewById(R.id.getEmail);
        contact = findViewById(R.id.getContact);

        Intent intent = getIntent();
//
//        String ID = intent.getStringExtra("idKey");
//        id.setText(ID);
//
//        String NAME = intent.getStringExtra("nameKey");
//        name.setText(NAME);
//
//        String EMAIL = intent.getStringExtra("emailKey");
//        email.setText(EMAIL);
//
//        String CONTACT = intent.getStringExtra("contactKey");
//        contact.setText(CONTACT);
    }
}
