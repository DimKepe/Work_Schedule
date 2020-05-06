import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.lang.Math;

public class Schedule_Planner {
	
	static HashMap<Integer, String> workers = new HashMap<>();  
	
	public Schedule_Planner(HashMap<Integer, String> workers1) {
		workers = workers1;
	}
	
	@SuppressWarnings({ "unchecked"})
	public static void main(String[] args) {
		
		workers.put(0, "Dimitris");
		workers.put(1, "Stella");
		workers.put(2, "Vassilis");
		workers.put(3, "Giwrgos");
		workers.put(4, "Maria");
		HashMap<Integer, String> workclone = workers;
		
		int num_days = 7,
			num_shifts = 3,
			max = workers.size();
		int d, w = 0, s, i, j;
		boolean firsttime = true;
		Object[][] working = new Object[num_days][num_shifts];
/*
		for (i = 0; i < workers.size(); i++) {
			System.out.println(workers.get(i));
		}	
*/	
	
/*		
		for (d = 0; d < num_days; d++) {
			workclone = (HashMap<Integer, String>) workers.clone();
			for (s = 0; s < num_shifts; s++) {
				working[d][s] = workclone.get(w);
				workclone.remove(w);
				w++;
				if(w == workclone.size())  w = 0;
			}
		}
*/
//		w = 0;
	
		for (d = 0; d < num_days; d++) {
			workclone = (HashMap<Integer,String>) workers.clone();
			for (s = 0; s < num_shifts; s++) {
				if (firsttime = true) {
						working[d][s] = workclone.get(w);
//						workclone.remove(w);
						w++;
						if(w == workclone.size())  w=0;
						firsttime = false;	
				} else {
					for (i = 0; i < 2; i++) {
						working[d][s] += "," + workclone.get(w);
//						workclone.remove(w);
						w++;
						if(w == workclone.size())  w=0;
					}
				}

			}
		}
		
		
		
	    for ( d = 0; d < working.length; ++d) {
	    	System.out.println("Day:" + (d + 1));
	        for( s = 0; s < working[d].length; ++s) {
	          System.out.printf("%-10s\t", working[d][s]);
	        }
	        System.out.println();
	    } 
	}
} 


