package com.JavaGradedAssignment;

import java.util.ArrayList;
import java.util.HashMap;

class Consumer {
    private HashMap<Project, ArrayList<Employee>> hMap;

    public Consumer(HashMap<Project, ArrayList<Employee>> hMap) {
        this.hMap = hMap;
    }

    public void deserialize() {
        synchronized (hMap) {
            System.out.println("Deserialize Called by Consumer");
            System.out.println("DeSerialized Data: ");
            System.out.println(hMap);
        }
    }
}