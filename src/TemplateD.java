import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kenny on 02/09/2016.
 */
public class TemplateD
{
	private static String[] inArray;
	private static ArrayList<String> inList;
	public static void main(String[] args) throws Exception
	{
		Scanner fileReader = new Scanner(new File("input/"));
		ArrayList<String> tempInList = new ArrayList<>();
		while(fileReader.hasNext())
		{
			String nextLine = fileReader.nextLine();
			tempInList.add(nextLine);
		}
		inArray = (String[])tempInList.toArray();
		inList = tempInList;
		doProblem();
	}
	private static void doProblem(){
		//Start problem here
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
