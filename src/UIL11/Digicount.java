package UIL11;

import java.io.File;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.function.IntConsumer;

/**
 * Created by Kenny on 02/09/2016.
 */
public class Digicount
{
	private static boolean ARRAY = true;

	private static String[] inArray;
	private static ArrayList<String> inList;
	public static void main(String[] args) throws Exception
	{
		Scanner fileReader = new Scanner(new File("input/11uild2/digicount.dat"));
		ArrayList<String> tempInList = new ArrayList<>();
		while(fileReader.hasNext())
		{
			String nextLine = fileReader.nextLine();
			tempInList.add(nextLine);
		}
		if(ARRAY){
			inArray = tempInList.toArray(new String[1]);
		} else {
			inList = tempInList;
		}
		doProblem();
	}
	private static void doProblem(){
		//Start problem here
		String[] numArray = inArray[0].split(" ");
		int[][] outList = new int[numArray.length][10];
		for (int i = 0; i < numArray.length; i++)
		{
			for (int j = 1; j <= Integer.parseInt(numArray[i]); j++)
			{
				int finalI = i;
				String.valueOf(j).chars().forEach((integer) -> outList[finalI][integer - 48]++);
			}
		}
		ddOut(outList);
	}
	private static void ddOut(int[][] out){
		for (int i = 0; i < out.length; i++)
		{
			for (int j = 0; j < out[i].length; j++)
			{
				System.out.print(out[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
