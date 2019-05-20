package com.fahrizal.myprofit;

import com.fahrizal.myprofit.display.ConclusionDisplay;
import com.fahrizal.myprofit.display.PureDisplay;
import com.fahrizal.myprofit.profit.ProfitData;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView laundryProfitTv;

    TextView pulsaProfitTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        laundryProfitTv = findViewById(R.id.laundryProfitTv);
        pulsaProfitTv = findViewById(R.id.pulsaProfitTv);
        runProfit();
    }

    private void runProfit() {
        ProfitData profitData = new ProfitData();
        PureDisplay pureDisplay = new PureDisplay(profitData, laundryProfitTv);
        profitData.registerObserver(pureDisplay);

        ConclusionDisplay conclusionDisplay = new ConclusionDisplay(profitData, pulsaProfitTv);
        profitData.registerObserver(conclusionDisplay);

        //measurement
        profitData.setMeasurements(10000, 5000);
        profitData.setMeasurements(33000, 9000);
    }
}
