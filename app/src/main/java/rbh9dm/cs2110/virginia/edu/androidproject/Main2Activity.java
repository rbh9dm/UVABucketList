package rbh9dm.cs2110.virginia.edu.androidproject;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import android.content.Intent;

public class Main2Activity extends Activity {
public int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        TextView aux = (TextView) findViewById(R.id.description);
        aux.setText(MainActivity.items.get(position).getDescription());
        aux = (TextView) findViewById(R.id.title);
        aux.setText(MainActivity.items.get(position).getName());
        CheckBox chk = (CheckBox) findViewById(R.id.checkBox);
        chk.setChecked(MainActivity.items.get(position).isComplete());
    }

    public void clicked(View view){
        switch(view.getId()){
            case R.id.checkBox:
                // changes the state of the item
                CheckBox chk = (CheckBox) findViewById(R.id.checkBox);
                MainActivity.items.get(position).setComplete(chk.isChecked());
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("id", 1);
                setResult(RESULT_OK, intent);
                break;
        }
    }
}
