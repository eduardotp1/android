package testing.gps_location;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class FormManager extends AppCompatActivity {

    private Button b;
    private EditText nameform;
    private EditText messageform;
    private EditText talkedtoform;
    private EditText salestatusform;
    private EditText companynameform;
    protected checkin checkin;
    private MainActivity MainActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_activity);
        b = (Button) findViewById(R.id.completeform);
        nameform = (EditText) findViewById(R.id.name);
        messageform = (EditText) findViewById(R.id.message);
        talkedtoform = (EditText) findViewById(R.id.talkedto);
        salestatusform = (EditText) findViewById(R.id.salesstatus);
        companynameform = (EditText) findViewById(R.id.companyname);
        checkin = MainActivity.checkin;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcampus();
            }
        });
    }
    private void gotomainactivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    private void checkcampus() {
        if (messageform.getText().toString().length() < 1 && companynameform.getText().toString().length() < 1) {
            //show modal
        }else{
            checkin.setClientname(companynameform.getText().toString());
            checkin.setMessage(messageform.getText().toString());
            checkin.setSalestatus(salestatusform.getText().toString());
            checkin.setProfessional(nameform.getText().toString());
            Calendar c = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String strDate = sdf.format(c.getTime());
            checkin.setTime(strDate);
            gotomainactivity();
        }
    }
}


