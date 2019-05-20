package com.fahrizal.myprofit.display;

import com.fahrizal.myprofit.obeserver.DisplayElement;
import com.fahrizal.myprofit.obeserver.Observer;
import com.fahrizal.myprofit.obeserver.Subject;

import android.widget.TextView;

/**
 * @author Fahrizal Sentosa (fahrizal.sentosa@dana.id)
 * @version PureDisplay, v 0.1 20/05/19 21.54 by Fahrizal Sentosa
 */
public class PureDisplay implements Observer, DisplayElement {

    Subject profitData;

    float income;

    float expenditure;

    TextView textView;

    public PureDisplay(Subject profitData, TextView textView) {
        this.profitData = profitData;
        this.textView = textView;
    }

    @Override
    public void display() {
        textView
            .setText("Sales\nIncome : " + income + "\nExpenditure :" + expenditure);
    }

    @Override
    public void update(float laundryIncome, float laundryExpenditure) {
        this.income = laundryIncome;
        this.expenditure = laundryExpenditure;
        display();
    }
}
