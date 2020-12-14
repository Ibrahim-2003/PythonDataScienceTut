package com.example.pythondatasciencetut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class datascience extends AppCompatActivity {

    EditText xNums, yNums;
    Button SubmitBtn;
    TextView Solution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datascience);

        xNums = (EditText) findViewById(R.id.x_Values);
        yNums = (EditText) findViewById(R.id.y_Values);
        SubmitBtn = (Button) findViewById(R.id.submitBtn);
        Solution = (TextView) findViewById(R.id.solution);

        if(!Python.isStarted())
            Python.start(new AndroidPlatform(this));

        Python py = Python.getInstance();
        final PyObject pyobj = py.getModule("android_data_science"); // Here, create the python in the app/src/main/python directory

        //Now we refer back to UI

        SubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PyObject obj = pyobj.callAttr("dataCalc", xNums.getText().toString(), yNums.getText().toString()); // This will call the function

                Solution.setText(obj.toString());

            }




        });
    }
}