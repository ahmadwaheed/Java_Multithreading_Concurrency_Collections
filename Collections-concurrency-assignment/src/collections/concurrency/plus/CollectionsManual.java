package collections.concurrency.plus;

//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Set;

public class CollectionsManual {
/*
	 LinkedHashMap hMap = new LinkedHashMap(101);
	 
	 
	 EmployeeData eData1 = (EmployeeData)new EmployeeData("Emp1", 12.3);
	 EmployeeData eData2 = (EmployeeData)new EmployeeData("Emp2", 12.4);
	 EmployeeData eData3 = (EmployeeData)new EmployeeData("Emp3", 12.5);
	 EmployeeData eData4 = (EmployeeData)new EmployeeData("Emp4", 12.37);
	 EmployeeData eData5 = (EmployeeData)new EmployeeData("Emp5", 12.33);
	 EmployeeData eData6 = (EmployeeData)new EmployeeData("Emp6", 12.56);
	 EmployeeData eData7 = (EmployeeData)new EmployeeData("Emp7", 12.7);
	 EmployeeData eData8 = (EmployeeData)new EmployeeData("Emp8", 12.34);
	 EmployeeData eData9 = (EmployeeData)new EmployeeData("Emp9", 12.8);
	 EmployeeData eData10 = (EmployeeData)new EmployeeData("Emp10", 12.09);
	 
	 EmployeeData eData11 = (EmployeeData)new EmployeeData("Emp11", 14.3);
	 EmployeeData eData12 = (EmployeeData)new EmployeeData("Emp12", 14.4);
	 EmployeeData eData13 = (EmployeeData)new EmployeeData("Emp13", 14.1);
	 EmployeeData eData14 = (EmployeeData)new EmployeeData("Emp14", 14.6);
	 EmployeeData eData15 = (EmployeeData)new EmployeeData("Emp15", 14.375);
	 EmployeeData eData16 = (EmployeeData)new EmployeeData("Emp16", 14.343);
	 EmployeeData eData17 = (EmployeeData)new EmployeeData("Emp17", 14.66);
	 EmployeeData eData18 = (EmployeeData)new EmployeeData("Emp18", 14.77);
	 EmployeeData eData19 = (EmployeeData)new EmployeeData("Emp19", 14.8);
	 EmployeeData eData20 = (EmployeeData)new EmployeeData("Emp20", 14.23);
	 
	 EmployeeData eData21 = (EmployeeData)new EmployeeData("Emp21", 16.45);
	 EmployeeData eData22 = (EmployeeData)new EmployeeData("Emp22", 16.5);
	 EmployeeData eData23 = (EmployeeData)new EmployeeData("Emp23", 16.3);
	 EmployeeData eData24 = (EmployeeData)new EmployeeData("Emp24", 16.7);
	 EmployeeData eData25 = (EmployeeData)new EmployeeData("Emp25", 16.77);
	 EmployeeData eData26 = (EmployeeData)new EmployeeData("Emp26", 16.2);
	 EmployeeData eData27 = (EmployeeData)new EmployeeData("Emp27", 16.23);
	 EmployeeData eData28 = (EmployeeData)new EmployeeData("Emp28", 16.11);
	 EmployeeData eData29 = (EmployeeData)new EmployeeData("Emp29", 16.7);
	 EmployeeData eData30 = (EmployeeData)new EmployeeData("Emp30", 16.8);
	 
	 EmployeeData eData31 = (EmployeeData)new EmployeeData("Emp31", 20.3);
	 EmployeeData eData32 = (EmployeeData)new EmployeeData("Emp32", 20.31);
	 EmployeeData eData33 = (EmployeeData)new EmployeeData("Emp33", 20.65);
	 EmployeeData eData34 = (EmployeeData)new EmployeeData("Emp34", 20.7);
	 EmployeeData eData35 = (EmployeeData)new EmployeeData("Emp35", 20.8);
	 EmployeeData eData36 = (EmployeeData)new EmployeeData("Emp36", 20.1);
	 EmployeeData eData37 = (EmployeeData)new EmployeeData("Emp37", 20.76);
	 EmployeeData eData38 = (EmployeeData)new EmployeeData("Emp38", 20.7);
	 EmployeeData eData39 = (EmployeeData)new EmployeeData("Emp39", 20.32);
	 EmployeeData eData40 = (EmployeeData)new EmployeeData("Emp40", 20.03);
	 
	 EmployeeData eData41 = (EmployeeData)new EmployeeData("Emp41", 22.3);
	 EmployeeData eData42 = (EmployeeData)new EmployeeData("Emp42", 22.54);
	 EmployeeData eData43 = (EmployeeData)new EmployeeData("Emp43", 22.2);
	 EmployeeData eData44 = (EmployeeData)new EmployeeData("Emp44", 22.44);
	 EmployeeData eData45 = (EmployeeData)new EmployeeData("Emp45", 22.42);
	 EmployeeData eData46 = (EmployeeData)new EmployeeData("Emp46", 22.11);
	 EmployeeData eData47 = (EmployeeData)new EmployeeData("Emp47", 22.76);
	 EmployeeData eData48 = (EmployeeData)new EmployeeData("Emp48", 22.31);
	 EmployeeData eData49 = (EmployeeData)new EmployeeData("Emp49", 22.03);
	 EmployeeData eData50 = (EmployeeData)new EmployeeData("Emp50", 22.55);
	 
	 EmployeeData eData51 = (EmployeeData)new EmployeeData("Emp51", 25.3);
	 EmployeeData eData52 = (EmployeeData)new EmployeeData("Emp52", 25.34);
	 EmployeeData eData53 = (EmployeeData)new EmployeeData("Emp53", 25.67);
	 EmployeeData eData54 = (EmployeeData)new EmployeeData("Emp54", 25.12);
	 EmployeeData eData55 = (EmployeeData)new EmployeeData("Emp55", 25.45);
	 EmployeeData eData56 = (EmployeeData)new EmployeeData("Emp56", 26.3);
	 EmployeeData eData57 = (EmployeeData)new EmployeeData("Emp57", 26.67);
	 EmployeeData eData58 = (EmployeeData)new EmployeeData("Emp58", 26.45);
	 EmployeeData eData59 = (EmployeeData)new EmployeeData("Emp59", 26.32);
	 EmployeeData eData60 = (EmployeeData)new EmployeeData("Emp60", 26.322);
	 
	 EmployeeData eData61 = (EmployeeData)new EmployeeData("Emp61", 27.3);
	 EmployeeData eData62 = (EmployeeData)new EmployeeData("Emp62", 27.323);
	 EmployeeData eData63 = (EmployeeData)new EmployeeData("Emp63", 27.2);
	 EmployeeData eData64 = (EmployeeData)new EmployeeData("Emp64", 27.63);
	 EmployeeData eData65 = (EmployeeData)new EmployeeData("Emp65", 27.64);
	 EmployeeData eData66 = (EmployeeData)new EmployeeData("Emp66", 28.21);
	 EmployeeData eData67 = (EmployeeData)new EmployeeData("Emp67", 28.35);
	 EmployeeData eData68 = (EmployeeData)new EmployeeData("Emp68", 28.77);
	 EmployeeData eData69 = (EmployeeData)new EmployeeData("Emp69", 28.12);
	 EmployeeData eData70 = (EmployeeData)new EmployeeData("Emp70", 28.78);
	 
	 EmployeeData eData71 = (EmployeeData)new EmployeeData("Emp71", 32.45);
	 EmployeeData eData72 = (EmployeeData)new EmployeeData("Emp72", 34.56);
	 EmployeeData eData73 = (EmployeeData)new EmployeeData("Emp73", 35.76);
	 EmployeeData eData74 = (EmployeeData)new EmployeeData("Emp74", 35.21);
	 EmployeeData eData75 = (EmployeeData)new EmployeeData("Emp75", 34.565);
	 EmployeeData eData76 = (EmployeeData)new EmployeeData("Emp76", 35.09);
	 EmployeeData eData77 = (EmployeeData)new EmployeeData("Emp77", 32.45);
	 EmployeeData eData78 = (EmployeeData)new EmployeeData("Emp78", 31.24);
	 EmployeeData eData79 = (EmployeeData)new EmployeeData("Emp79", 39.22);
	 EmployeeData eData80 = (EmployeeData)new EmployeeData("Emp80", 37.22);
	 
	 EmployeeData eData81 = (EmployeeData)new EmployeeData("Emp81", 44.21);
	 EmployeeData eData82 = (EmployeeData)new EmployeeData("Emp82", 44.56);
	 EmployeeData eData83 = (EmployeeData)new EmployeeData("Emp83", 43.453);
	 EmployeeData eData84 = (EmployeeData)new EmployeeData("Emp84", 43.78);
	 EmployeeData eData85 = (EmployeeData)new EmployeeData("Emp85", 43.778);
	 EmployeeData eData86 = (EmployeeData)new EmployeeData("Emp86", 43.66);
	 EmployeeData eData87 = (EmployeeData)new EmployeeData("Emp87", 43.56);
	 EmployeeData eData88 = (EmployeeData)new EmployeeData("Emp88", 43.64);
	 EmployeeData eData89 = (EmployeeData)new EmployeeData("Emp89", 43.76);
	 EmployeeData eData90 = (EmployeeData)new EmployeeData("Emp90", 43.90);
	 
	 EmployeeData eData91 = (EmployeeData)new EmployeeData("Emp91", 12.3);
	 EmployeeData eData92 = (EmployeeData)new EmployeeData("Emp92", 12.3);
	 EmployeeData eData93 = (EmployeeData)new EmployeeData("Emp93", 12.3);
	 EmployeeData eData94 = (EmployeeData)new EmployeeData("Emp94", 12.3);
	 EmployeeData eData95 = (EmployeeData)new EmployeeData("Emp95", 12.3);
	 EmployeeData eData96 = (EmployeeData)new EmployeeData("Emp96", 12.3);
	 EmployeeData eData97 = (EmployeeData)new EmployeeData("Emp97", 12.3);
	 EmployeeData eData98 = (EmployeeData)hMap.put(98, new EmployeeData("Emp98", 12.3));
	 EmployeeData eData99 = (EmployeeData) hMap.put(99, new EmployeeData("Emp99", 12.3));
	 EmployeeData eData100 = (EmployeeData) hMap.put(100, new EmployeeData("Emp100", 12.3));
	 
	
	 
	 
	 for(Object obj : hMap.entrySet()) {
			Map.Entry entry = (Map.Entry) obj;
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	

*/
}
