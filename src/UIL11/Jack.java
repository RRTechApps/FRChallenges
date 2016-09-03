package UIL11;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Kenny
 */
public class Jack
{
	private static boolean ARRAY = false;

	private static String[] inArray;
	private static ArrayList<String> inList;
	public static void main(String[] args) throws Exception
	{
		Scanner fileReader = new Scanner(new File("input/11uild2/jack.dat"));
		ArrayList<String> tempInList = new ArrayList<>();
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
		Iterator<String> lines = inList.iterator();
		while(lines.hasNext()){
			lines.next();
			if(lines.hasNext())
				System.out.println(lines.next());
		}
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
