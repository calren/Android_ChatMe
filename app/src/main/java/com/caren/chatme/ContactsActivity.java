package com.caren.chatme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.caren.chatme.R;

import java.util.ArrayList;

public class ContactsActivity extends Activity {

    ListView lvContacts;
    ArrayAdapter<Contact> itemsAdapter;
    ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        lvContacts = (ListView) findViewById(R.id.lv);
        itemsAdapter = new ArrayAdapter<Contact> (this, android.R.layout.simple_list_item_1, contacts);
        lvContacts.setAdapter(itemsAdapter);
    }


    public void setUpViewListener() {
        lvContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

//                Intent i = new Intent(TodoActivity.this, EditItemActivity.class);
//                i.putExtra("oldItem", items.get(position));
//                i.putExtra("position", position);
//                startActivityForResult(i, REQUEST_CODE);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.contacts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
