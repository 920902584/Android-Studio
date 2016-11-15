package query.view.zone.sun.personview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr.Zou on 2016/9/13.
 */
public class ChoiceViews extends Activity{
    private TextView textView;
    private Button returnpagetow;
    private Spinner spinner;
    private ArrayAdapter<String> aspnViews;
    private List<String> allViews;
    private static final String[] mViews = {"请选择你查询的景点","万寿山","昆明湖","十七孔桥", "智慧海","乐寿堂","佛香阁"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.views_choice);
        find_and_modify_view();
        returnpagetow = (Button) findViewById(R.id.returnpagetow);
        textView = (TextView)findViewById(R.id.jtTextView);
        textView.setText("交通指南：新建宫门：\n公交374、437、704路；\n" +
                "东宫门：公交\n726、826、732、331、332、346、718路；\n" +
                "北宫门：公交\n384、375、393、817、808、801、697路。");
        returnpagetow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ChoiceViews.this, ViewMap.class);
                startActivity(intent);
            }
        });

    }
    private void find_and_modify_view(){

        spinner=(Spinner)findViewById(R.id.spinner);
        allViews =new ArrayList<String>();

        for(int i=0;i<mViews.length;i++){
            allViews.add(mViews[i]);
        }
        aspnViews=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,allViews);
        aspnViews.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aspnViews);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                if (arg3 == 1) {
                    Intent intent = new Intent();
                    intent.setClass(ChoiceViews.this, ViewOne.class);
                    startActivity(intent);
                } else if (arg3 == 2) {
                    Intent intent = new Intent();
                    intent.setClass(ChoiceViews.this, ViewTwo.class);
                    startActivity(intent);
                } else if (arg3 == 3) {
                    Intent intent = new Intent();
                    intent.setClass(ChoiceViews.this, ViewThree.class);
                    startActivity(intent);
                } else if (arg3 == 4) {
                    Intent intent = new Intent();
                    intent.setClass(ChoiceViews.this, ViewFour.class);
                    startActivity(intent);
                } else if (arg3 == 5) {
                    Intent intent = new Intent();
                    intent.setClass(ChoiceViews.this, ViewFive.class);
                    startActivity(intent);
                } else if (arg3 == 6) {
                    Intent intent = new Intent();
                    intent.setClass(ChoiceViews.this, ViewSix.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }
}

