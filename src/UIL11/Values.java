package UIL11;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Kenny
 */
public class Values
{
	private static String[] inArray;
	private static ArrayList<String> inList;
	public static void main(String[] args) throws Exception
	{
		Scanner fileReader = new Scanner(new File("input/11uild2/values.dat "));
		ArrayList<String> tempInList = new ArrayList<>();
		fileReader.nextLine();
		while(fileReader.hasNext())
		{
			String nextLine = fileReader.nextLine();
			tempInList.add(nextLine);
		}
		inArray = tempInList.toArray(new String[0]);
		inList = tempInList;
		doProblem();
	}
	private static void doProblem(){
		//Start problem here
		PriorityQueue<String> outQ = new PriorityQueue<>((o1, o2) -> o1.chars().map(operand -> operand == 32 ? 0 : operand - 64).sum() - o2.chars().map(operand -> operand == 32 ? 0 : operand - 64).sum() == 0 ? o1.compareTo(o2) : o1.chars().map(operand -> operand == 32 ? 0 : operand - 64).sum() - o2.chars().map(operand -> operand == 32 ? 0 : operand - 64).sum());
		outQ.addAll(inList);
			while(outQ.peek() != null)
				System.out.println(outQ.peek().chars().map(operand -> operand == 32 ? 0 : operand - 64).sum() + " " + outQ.poll());
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
