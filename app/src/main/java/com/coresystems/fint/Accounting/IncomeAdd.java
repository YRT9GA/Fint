package com.coresystems.fint.Accounting;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.coresystems.fint.MainActivity;
import com.coresystems.fint.R;
import com.coresystems.fint.db.EmployeeDatabase;

import com.coresystems.fint.db.entity.Employee;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class IncomeAdd extends AppCompatActivity {

    Button saveIncomeBtn;
    TextView dateEt;

    final Calendar myCalendar = Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_income_add);
        // FintDatabase db Room.databaseBuilder(getApplicationContext(),FintDatabase.class, "fint-" +
        //         "database")

        String today = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(new Date());

        TextView dateset = findViewById(R.id.date_income_et);
        dateset.setText(today);


        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            private void updateLabel() {
                String myFormat = "dd.MM.yyyy"; //In which you need put here
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

                dateset.setText(sdf.format(myCalendar.getTime()));
            }

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };
        dateset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(IncomeAdd.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });




        }
    }


