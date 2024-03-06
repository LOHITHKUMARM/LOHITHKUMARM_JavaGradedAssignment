package com.JavaGradedAssignment;

import java.util.ArrayList;
import java.util.HashMap;

class Producer {
    private HashMap<Project, ArrayList<Employee>> hMap;

    public Producer(HashMap<Project, ArrayList<Employee>> hMap) {
        this.hMap = hMap;
    }

    public void serialize() {
        synchronized (hMap) {
            System.out.println("Serialize called by Producer");
            System.out.println("Serialized Data: ");
            System.out.println(hMap);
        }
    }
}
