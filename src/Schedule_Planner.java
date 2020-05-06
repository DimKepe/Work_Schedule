import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.lang.Math;

public class Schedule_Planner {
	
	static HashMap<Integer, String> workers = new HashMap<>();
	static int d;
	static int s;
	
	
	public Schedule_Planner(HashMap<Integer, String> workers1) {
		workers = workers1;
	}
	
	public static void workersfill() {
		workers.put(0, "Dimitris");
		workers.put(1, "Stella");
		workers.put(2, "Vassilis");
		workers.put(3, "Giwrgos");
		workers.put(4, "Maria");
		workers.put(5, "Alexadra");
		workers.put(6, "Aggelos");
		workers.put(7, "Eirini");
		workers.put(8, "Sokratis");
		workers.put(9, "Kwstas");
		workers.put(10, "Xristos");
		workers.put(11, "Asterios");
		workers.put(12, "Xristina");
		workers.put(13, "Vasiliki");
		workers.put(14, "Morty");
		workers.put(15, "Rick");
		workers.put(16, "Herbi");
		workers.put(17, "Harry Potter");
		workers.put(18, "Snape");
		workers.put(19, "Gandalf");
	}
	
	@SuppressWarnings({ "unchecked"})
	public static void main(String[] args) {
		
		workersfill();
		HashMap<Integer, String> workclone = workers;
		
		int num_shifts = 3,
			num_days = 7,
			max = workers.size();
		int w = 0, i, j;
		boolean firsttime = true;
		Object[][] working = new Object[num_days][num_shifts];
/*
		for (i = 0; i < workers.size(); i++) {
			System.out.println(workers.get(i));
		}	
		
*/

		for (d = 0; d < num_days; d++) {
			workclone = (HashMap<Integer, String>) workers.clone();
			for (s = 0; s < num_shifts; s++) {
				working[d][s] = workclone.get(w);
				workclone.remove(w);
				w++;
				if(w == workclone.size())  w = 0;
			}
		}
		w = 0;
		
		for (d = 0; d < num_days; d++) {
			workclone = (HashMap<Integer, String>) workers.clone();
			for (s = 0; s < num_shifts; s++) {
				working[d][s] += "," + workclone.get(w);
				workclone.remove(w);
				w++;
				if(w == workclone.size())  w = 0;
			}
		}		
		
		for (d = 0; d < num_days; d++) {
			workclone = (HashMap<Integer,String>) workers.clone();
			for (s = 0; s < num_shifts; s++) {
				if (s == 2) {
					for (i = 0; i < 1; i++) {
						working[d][s] += "," + workclone.get(w);
						workclone.remove(w);
						w++;
						if(w == workclone.size())  w=0;
					}
				} else if (s == 1) {
					for (i = 0; i < 2; i++) {
						working[d][s] += "," + workclone.get(w);
						workclone.remove(w);
						w++;
						if(w == workclone.size())  w=0;
					}
				} else {
					for (i = 0; i < 4; i++) {
						working[d][s] += "," + workclone.get(w);
						workclone.remove(w);
						w++;
						if(w == workclone.size())  w=0;
					}
				}
			}

		}
			
	    for ( d = 0; d < working.length; ++d) {
	    	System.out.println("\f Day:" + (d + 1));
	        for( s = 0; s < working[d].length; ++s) {
	          System.out.printf("%-40s\t", working[d][s]);
	        }
	        System.out.println();
	    } 
	}
	
	public static Object addToTable(Object[][] table, String name) {
		if (table[d][s] == null) {
			table[d][s] += "," + name;
		} else {
			table[d][s] = name;
		}
		return table;
	}
} 
