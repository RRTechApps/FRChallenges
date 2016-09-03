import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kenny on 02/09/2016.
 */
public class TemplateDD
{
	private static boolean ARRAY = false;

	private static String[][] inArray;
	private static ArrayList<ArrayList<String>> inList;
	public static void main(String[] args) throws Exception
	{
		Scanner fileReader = new Scanner("input/");
		ArrayList<ArrayList<String>> tempInList = new ArrayList<>();
		int line = 0;
		while(fileReader.hasNext())
		{
			String nextLine = fileReader.nextLine();
			tempInList.add(new ArrayList<>());
			String[] splitIn = nextLine.split("");
			for (int i = 0; i < splitIn.length; i++)
			{
				tempInList.get(line).add(splitIn[i]);
			}
			line++;
		}
		if(ARRAY){
			inArray = (String[][])tempInList.toArray();
		} else {
			inList = tempInList;
		}
	}
	private static void doProblem(){
		//Start problem here
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
	private static void ddOut(String[][] out){
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
