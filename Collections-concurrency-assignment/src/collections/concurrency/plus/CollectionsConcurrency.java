package collections.concurrency.plus;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.Spliterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CollectionsConcurrency {

	 public static void main(String[] args) {
		 	
		//Initializing ArrayList
		ArrayList<EmployeeData> l = new ArrayList<EmployeeData>();
		int EmployeeNum = 0;
		
		//Creating 100 Employees and adding them to the ArrayList
		for(int c=0;c<100;c++) {
			EmployeeData eData = new EmployeeData("Emp " + c, 50000.0 + c, 0.0);	
			l.add(eData);
		}
			
		//CountDown Latch
		CountDownLatch CDL = new CountDownLatch(10);
		
		//Executor Service
		ExecutorService executorSer = Executors.newFixedThreadPool(10);
		
		
		//Executing ten Employees at a time
		for(int a=1;a<11;a++) {
			executorSer.execute(new UpdatingData(CDL,l,EmployeeNum));
			EmployeeNum += 10;
		}
		
		try {
			//Waits until all the threads get done with the job
			CDL.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Iterating over ArrayList
		Iterator<EmployeeData> iterNew = l.listIterator();
		while(iterNew.hasNext()) {
			Object obj = iterNew.next();
			System.out.println(obj);
		}
		
		//Shutting down executor service
		if(executorSer.isShutdown()) {
			System.out.println("True");
		} else  {
			System.out.println("False");
		}
		executorSer.shutdown();
		
		//checking for shutdown
		System.out.println(executorSer.isShutdown());
	}
}

class UpdatingData implements Runnable {

	private int EmployeeNum;
	CountDownLatch latch;
	ArrayList<EmployeeData> arrList;
	
	//Constructor
	UpdatingData(CountDownLatch latch, ArrayList<EmployeeData> arrList, int EmployeeNum) {
		
		this.latch = latch;
		this.arrList = arrList;
		this.EmployeeNum = EmployeeNum;
	}
	
	@Override
	public void run() {
		for(int a=EmployeeNum;a<EmployeeNum + 10; a++) {
			arrList.set(a,new EmployeeData(arrList.get(a).getName(), arrList.get(a).getInitialSalary(),
					calculateSalary(arrList.get(a).getInitialSalary())));
		}
		latch.countDown();
	}
	
	//Getting Updated salary
	public static double calculateSalary(double oldSalary) {
		
		Double newSalary = oldSalary + (oldSalary * 0.10);
		return newSalary;
	}
}

