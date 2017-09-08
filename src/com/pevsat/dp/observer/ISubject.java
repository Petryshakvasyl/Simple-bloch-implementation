package com.pevsat.dp.observer;

/**
 * Created by pevsat on 30.08.2017.
 */
public interface ISubject {

    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
}
