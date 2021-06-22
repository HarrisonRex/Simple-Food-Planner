import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Start {
	
	private static ArrayList<Ingreadient> ingsIn = new ArrayList<Ingreadient>();
	
	public static void main(String[] args){
		loadIngreads();
		
		
		//makeNow = new ArrayList();
		//shopList = new ArrayList();
	}
	
	public static void loadIngreads() {
		try {
			File myObj = new File("ings.txt");
			Scanner sc = new Scanner(myObj);
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				addIng(data);
			}
			sc.close();
		} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
		}
	}
	
	public static void addIng(String line) {
		int[] comLocations = new int[3];
		String temp = line;
		int j = 0;
		
		for(int i = 0; i < 3 -1; i++) {
			while(temp.charAt(0)!=',') {
				temp = temp.substring(1);
				j++;
			}
			j++;
			temp = temp.substring(1);
			comLocations[i] = j;
		}
		
		boolean inStock = Boolean.parseBoolean(line.substring(0,comLocations[0]));
		String name = line.substring(comLocations[0],comLocations[1]-1);
		double amountStock = Double.parseDouble(line.substring(comLocations[1])); 
		
		ingsIn.add(new Ingreadient(inStock, name, amountStock));
	}
}