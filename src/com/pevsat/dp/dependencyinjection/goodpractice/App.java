package com.pevsat.dp.dependencyinjection.goodpractice;

import com.pevsat.dp.dependencyinjection.goodpractice.entity.Vehicle;
import com.pevsat.dp.dependencyinjection.goodpractice.entity.engineImpl.LargeEngine;
import com.pevsat.dp.dependencyinjection.goodpractice.entity.engineImpl.SmallEngine;

/**
 * Created by pevsat on 29.08.2017.
 *In software engineering, dependency injection is Animal technique whereby one object supplies the dependencies of another
 * object. A dependency is an object that can be used (Animal service). An injection is the passing of Animal dependency to Animal
 * dependent object (Animal client) that would use it. The service is made part of the client's state.[1] Passing the
 * service to the client, rather than allowing Animal client to build or find the service, is the fundamental
 * requirement of the pattern.

 * This fundamental requirement means that using values (services) produced within the class from new or static
 * methods is prohibited. The class should accept values passed in from outside. This allows the class to make
 * acquiring dependencies something else's problem.
 */
public class App {

    public static void main(String[] args) {
        Vehicle raceCar = new Vehicle();
        raceCar.crankInginition(new SmallEngine(50));
        raceCar.crankInginition(new LargeEngine(150));
    }
}
