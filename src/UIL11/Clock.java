package UIL11;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Kenny on 02/09/2016.
 */
public class Clock
{
	private static String[] inArray;
	private static ArrayList<String> inList;
	public static void main(String[] args) throws Exception
	{
		Scanner fileReader = new Scanner(new File("input/11uild2/clock.dat"));
		ArrayList<String> tempInList = new ArrayList<>();
		fileReader.nextLine();
		while(fileReader.hasNext())
		{
			String nextLine = fileReader.nextLine();
			tempInList.add(nextLine);
		}
		inArray = tempInList.toArray(new String[1]);
		inList = tempInList;
		doProblem();
	}
	private static void doProblem(){
		//Start problem here
		inList.forEach((time) -> {
			int[] times = Arrays.stream(time.split(":")).mapToInt(Integer::parseInt).toArray();
			int timeMin = times[0] * 60 + times[1];
			System.out.println((720 - timeMin) / 60 + ":" + ((720 - timeMin) % 60 == 0 ? "00" : (720 - timeMin) % 60));
		});
	}
}
