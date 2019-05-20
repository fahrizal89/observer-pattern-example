package com.fahrizal.myprofit.display;

import com.fahrizal.myprofit.obeserver.DisplayElement;
import com.fahrizal.myprofit.obeserver.Observer;
import com.fahrizal.myprofit.obeserver.Subject;

import android.widget.TextView;

/**
 * @author Fahrizal Sentosa (fahrizal.sentosa@dana.id)
 * @version PureDisplay, v 0.1 20/05/19 21.54 by Fahrizal Sentosa
 */
public class ConclusionDisplay implements Observer, DisplayElement {

    Subject profitData;

    float conclusion;

    TextView textView;

    public ConclusionDisplay(Subject profitData, TextView textView) {
        this.profitData = profitData;
        this.textView = textView;
    }

    @Override
    public void display() {
        textView.setText("Profit : " + conclusion);
    }

    @Override
    public void update(float laundryIncome, float laundryExpenditure) {
        conclusion = laundryIncome - laundryExpenditure;
        display();
    }
}
