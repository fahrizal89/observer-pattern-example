package com.fahrizal.myprofit.profit;

import com.fahrizal.myprofit.obeserver.Observer;
import com.fahrizal.myprofit.obeserver.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fahrizal Sentosa (fahrizal.sentosa@dana.id)
 * @version ProfitData, v 0.1 20/05/19 07.52 by Fahrizal Sentosa
 */
public class ProfitData implements Subject {

    float income;

    float expenditure;

    private List<Observer> observers;

    public ProfitData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(income, expenditure);
        }
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurements(float income, float expenditure) {
        this.income = income;
        this.expenditure = expenditure;
        measurementChanged();
    }
}
