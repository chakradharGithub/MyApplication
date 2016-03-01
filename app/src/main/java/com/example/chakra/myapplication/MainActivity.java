package com.example.chakra.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        EditText a1 = (EditText) findViewById(R.id.TFnumber1);
        EditText a2 = (EditText) findViewById(R.id.TFnumber2);
        double n1, n2, res;
        n1 = Double.parseDouble(a1.getText().toString());
        n2 = Double.parseDouble(a2.getText().toString());
        TextView t = (TextView) findViewById(R.id.TVresult);



    if (v.getId() == R.id.Badd) {

        if ((a1 != null) && (a2 != null)) {
            res = n1 + n2;
            t.setText("" + res);
        } else {
            t.setText("Please provide required input...");
        }
    }
    if (v.getId() == R.id.Bsub) {
        if ((a1 == null) || (a2 == null))
            t.setText("Please provide required input...");
        else {
            if (n1 > n2)
                res = n1 - n2;
            else
                res = n2 - n1;
            t.setText("" + res);
        }
    }
    if (v.getId() == R.id.Bmul) {
        if ((a1 == null) || (a2 == null))
            t.setText("Please provide required input...");
        else {
            res = n1 * n2;
            t.setText("" + res);
        }
    }
    if (v.getId() == R.id.Bdiv) {
        if ((a1 == null) || (a2 == null))
            t.setText("Please provide required input...");
        else {
            if (n1 > n2) {
                res = n1 / n2;
                t.setText("" + res);
            } else
                t.setText("Can NOT be Divided !");
        }
    }
    if (v.getId() == R.id.Bsqr) {

        try {
            if ((a1 == null) || (a2 == null))
                t.setText("Please provide required input...");
            else {
                res = n1;
                for (int x = 2; x <= n2; x++)
                    res *= n1;
                t.setText("" + res);
            }
        } catch (Exception e) {
            t.setText(e.getMessage());
        }

    }
    if (v.getId() == R.id.Bclr) {
        a1.setText("");
        a2.setText("");
        t.setText("");
    }



    }

    /*
    public void onAddClick(View a)
    {
        if (a.getId() == R.id.Badd)
        {
            EditText a1 = (EditText) findViewById(R.id.TFnumber1);
            EditText a2 = (EditText) findViewById(R.id.TFnumber2);

            double n1, n2, res=0;

            n1 = Double.parseDouble(a1.getText().toString());
            n2 = Double.parseDouble(a2.getText().toString());

            res=n1+n2;

            TextView t = (TextView) findViewById(R.id.TVresult);
            t.setText(""+res);
        }

    }*/
}
