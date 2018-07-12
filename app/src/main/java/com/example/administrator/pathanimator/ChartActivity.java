package com.example.administrator.pathanimator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.pathanimator.widget.chartView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChartActivity extends AppCompatActivity {

    //x轴坐标对应的数据
    private List<String> xValue = new ArrayList<>();
    //y轴坐标对应的数据
    private List<String> yValue = new ArrayList<>();
    //折线对应的数据
    private Map<String, String> value = new HashMap<>();
    //年份对应数据
    private List<String> yearvalue = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        chartView chartview = (chartView)findViewById(R.id.chartview);
        for (int i = 0; i < 12; i++) {
            xValue.add((i + 1) + "月");
            yearvalue.add("2018年");
            value.put((i + 1) + "月",  (Math.random() * 181 + 60)+"");//60--240
        }

        for (int i = 0; i < 6; i++) {
            yValue.add(i * 60 +"");
        }
        chartview.setValue(value, xValue, yValue, yearvalue);
    }
}
