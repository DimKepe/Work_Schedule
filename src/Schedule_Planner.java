import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
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
		workers.put(17, "Harry");
		workers.put(18, "Snape");
		workers.put(19, "Gandalf");
	}
	
	@SuppressWarnings({ "unchecked"})
	public static void main(String[] args) {
		
		workersfill();
		
		
		HashMap<Integer, String> workclone = workers;
		
		int num_shifts = 3,
			num_days = 7,
			num_weeks,	
			day_shift,
			noon_shift,
			night_shift,
			num_workers = workers.size();
		int w = 0, i, j;
		String worker;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gia poses evdomades theleis na einai to programma");
		System.out.print("\f");
		num_weeks = sc.nextInt();
		num_days = num_days*num_weeks;
		
		System.out.println("Posoi ergazomenoi theleis na douleyoun stin prwini vardia?");
		System.out.print("\f");
		day_shift = sc.nextInt();
		
		System.out.println("Posoi ergazomenoi theleis na douleyoun stin mesimerianh vardia?");
		System.out.print("\f");
		noon_shift = sc.nextInt();
		
		System.out.println("Posoi ergazomenoi theleis na douleyoun stin vradinh vardia?");
		System.out.print("\f");
		night_shift = sc.nextInt();
		
		Object[][] working = new Object[num_days][num_shifts];
		
		ArrayList<String> working_day = new ArrayList<String>();
		ArrayList<String> working_noon = new ArrayList<String>();
		ArrayList<String> working_night = new ArrayList<String>();
		

		for (d = 0; d < num_days; d++) {
			workclone = (HashMap<Integer,String>) workers.clone();
			for (s = 0; s < num_shifts; s++) {				
				if (s == 0 && day_shift > 1) {
					for (i = 0; i < day_shift; i++) {
						working[d][s] += "," + workclone.get(w);
						workclone.remove(w);
						w++;
						if(w == workclone.size())  w=0;
					}
				//	working[d][s] = working_day;
				} else if (s == 1 && noon_shift > 1) {
					for (i = 0; i < noon_shift; i++) {
						working[d][s] += "," + workclone.get(w);
						workclone.remove(w);
						w++;
						if(w == workclone.size())  w=0;
					}
				} else if (s == 2 && night_shift > 1) {
					for (i = 0; i < night_shift; i++) {
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
	          System.out.printf("%-50s\t", working[d][s]);
	        }
	        System.out.println();
	    } 
	}
	
	public static Object addToTable(Object[][] table, String name) {
		if (table[d][s] != null) {
			table[d][s] += "," + name;
		} else {
			table[d][s] = name;
		}
		return table;
	}
} 
