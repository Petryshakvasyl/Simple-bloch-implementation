package com.pevsat.solid.liskovsp.badpractice;

/**
 * Created by pevsat on 28.08.2017.
 */
public class SubstituteTeacher extends Teacher {

    @Override
    public void teach() {
        /*IF SubstituteTeacher don't teach but only  performOtherResponsibilities
         * so you can only do like this:
        // do nothing...
        ore you can throw Exception
        but it is the bad practice and violate LSP
        */

    }
}
