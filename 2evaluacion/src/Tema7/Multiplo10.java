package Tema7;

public class Multiplo10 {
	
	public static void main (String[] args) {
		int num[]=new int[50];
		
		for(int j=0; j<num.length; j++){
			num[j] = j+1;
			System.out.println(j + " ; "+ num[j]);
		}
		System.out.println("Los multiplos del 1 al 50 son: ");	
		/*for(int j=0; j<num.length; j++){
		
			if(num[j]%10==0){
				System.out.println(num[j]);
			}
			
		}*/

		for(int i : num){
			if (i%10==0){
				System.out.println(i);
			}
		}
}
}