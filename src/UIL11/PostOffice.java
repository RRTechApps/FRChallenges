package UIL11;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Kenny
 */
public class PostOffice
{
	private static boolean ARRAY = false;

	private static String[] inArray;
	private static ArrayList<String> inList;
	public static void main(String[] args) throws Exception
	{
		Scanner fileReader = new Scanner(new File("input/11uild2/postoffice.dat"));
		ArrayList<String> tempInList = new ArrayList<>();
		fileReader.nextLine();
		while(fileReader.hasNext())
		{
			String nextLine = fileReader.nextLine();
			tempInList.add(nextLine);
		}
		if(ARRAY){
			inArray = (String[])tempInList.toArray();
		} else {
			inList = tempInList;
		}
		doProblem();
	}
	private static void doProblem(){
		//Start problem here
		inList.stream().mapToDouble(value -> Arrays.stream(value.split(" ")).mapToDouble(Double::parseDouble).sum() + .4).forEach(value -> System.out.println(value >  5 ? "OVERWEIGHT" : "OK"));
	}
	private static void dOut(int[] out){
		for (int i = 0; i < out.length; i++)
		{
			System.out.print(out[i] + " ");
		}
	}
	private static void dOut(String[] out){
		for (int i = 0; i < out.length; i++)
		{
			System.out.print(out[i] + " ");
		}
	}
}
