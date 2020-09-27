package no.hvl.dat100.lab5.tabeller;
import java.util.Scanner;
public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		for (int i = 0; i<tabell.length;i++) {
		System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String name = "[";
		for (int i = 0; i<tabell.length;i++) {
			name = name + tabell[i];
			if (i+1<tabell.length) name = name + ",";
			}
		name = name + "]";
		return name;
		
	}

	// c)
	public static int summer1(int[] tabell) {
		int sum= 0; 
		for(int tall: tabell) {
			sum = sum + tall;
		}
		return sum; 
	}
	
	public static int summer2(int[] tabell) {
		int sum = 0; 
		for (int i=0; i<tabell.length; i++)
			sum=sum+tabell[i];
		return sum; 
	}

	public static int summer3(int[] tabell) {
		int sum = 0; 
		int i =0;
		while(i<tabell.length) {
			sum=sum+tabell[i];
			i++;
		}
	
		return sum; 
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		

		for(int verdi : tabell) {
			if (tall==verdi)
				return true;
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i=0; i<tabell.length; i++) {
			if(tall==tabell[i])
				return i;
			
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[]tab2=new int[tabell.length];
		int j = 0;
		for(int i = tabell.length -1;0<=i;i--) {
			
			tab2[j]=tabell[i];
			j++;
		}
		return tab2;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for(int i = 0; i<tabell.length -1; i++) {
			if(tabell[i]>tabell[i+1]){
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[]tab3=new int[(tabell1.length + tabell2.length)];
		
		int i = 0; 
		for(int tall : tabell1) {
			tab3[i] = tall; 
			i++;
		}
		for(int tall : tabell2) {
			tab3[i] = tall; 
			i++;
		}
		return tab3; 		
	}
}
