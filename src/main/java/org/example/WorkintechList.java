package org.example;

import java.util.*;

public class WorkintechList extends ArrayList{


    @Override
    public boolean add(Object o) {
        boolean donus = false;

        if(!this.contains(o)) {
            super.add(o);
            this.sort();
        }
        return donus;
    }


    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        boolean donus = false;

        if(this.contains(o)) {
            super.remove(o);
            this.sort();
            donus = true;
        }

        return donus;
    }
}
