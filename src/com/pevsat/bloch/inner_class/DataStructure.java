package com.pevsat.bloch.inner_class;

import java.util.Iterator;

/**
 * Created by pevsat on 06.09.2017.
 */
public class DataStructure {

    private final static int SIZE = 15;
    private int[] arrays = new int[SIZE];

    public DataStructure(){
        for (int i = 0; i <SIZE; i++){
            arrays[i] = i;
        }
    }

    interface DataStructureIterator extends Iterator<Integer>{}

    private class EvenIterator implements DataStructureIterator{
        private int nextIndex = 0;

        @Override
        public Integer next() {
            Integer retValue = Integer.valueOf(arrays[nextIndex]);
            nextIndex+=2;
            return arrays[retValue];
        }

        @Override
        public boolean hasNext() {
            return (nextIndex <= SIZE-1);
        }
    }

    public void printEven(){
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
