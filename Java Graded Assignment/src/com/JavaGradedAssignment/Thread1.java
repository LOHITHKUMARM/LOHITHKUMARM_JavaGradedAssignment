package com.JavaGradedAssignment;

import java.util.ArrayList;
import java.util.HashMap;

class Thread1 implements Runnable{
	HashMap <Project,ArrayList <Employee>> hMap;
	
	public Thread1(HashMap <Project,ArrayList <Employee>> hMap) {
		this.hMap=hMap;
	}
	@Override
	public void run() {
        Producer producer = new Producer(hMap);
        producer.serialize();
        Consumer consumer = new Consumer(hMap);
        consumer.deserialize();
    }

		
	}
