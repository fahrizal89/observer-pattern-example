package com.fahrizal.myprofit.obeserver;

/**
 * @author Fahrizal Sentosa (fahrizal.sentosa@dana.id)
 * @version Subject, v 0.1 20/05/19 07.39 by Fahrizal Sentosa
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
