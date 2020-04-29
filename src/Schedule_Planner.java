import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class Schedule_Planner {
	
	static ArrayList<Object> workers = new ArrayList<Object>(); 

	@SuppressWarnings({ "null", "unchecked"})
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			workers.add(i+1);
		}
		ArrayList<Object> workclone = new ArrayList<Object>();
		
		int num_days = 7,
			num_shifts = 3;
		int d, w = 0, s, i, j;
		Object[][] working = new Object[num_shifts][num_days];
/*
		for (i = 0; i < workers.length; i++) {
			System.out.println(workers[i]);
		}		
*/		
		
		for (d = 0; d < num_days; d++) {
			workclone = (ArrayList<Object>) workers.clone();
			for (s = 0; s < num_shifts; s++) {
				working[s][d] = workclone.get(w);
				workclone.remove(w);
				w++;
				if(w == workclone.size()) w = 0;
			}
		}
	//	w = 0;
		
		for (d = 0; d < num_days; d++) {
			workclone = (ArrayList<Object>) workers.clone();
			for (s = 0; s < num_shifts; s++) {
				for (i = 0; i < 2; i++) {
					working[s][d] += "," + workclone.get(w);
				//	workclone.remove(w);
					w++;
					if(w == workclone.size()) w = 0;
				}
		    }
		}
			
		
	
	    for ( i = 0; i < working.length; ++i) {
	        for( j = 0; j < working[i].length; ++j) {
	          System.out.print(working[i][j] + "	");
	        }
	        System.out.println();
	    } 
	}
} 


