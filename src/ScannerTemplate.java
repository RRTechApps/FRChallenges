import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kenny on 02/09/2016.
 */
public class ScannerTemplate
{
	public static void main(String[] args) throws Exception
	{
		Scanner fileReader = new Scanner("input/");
		ArrayList<String> input = new ArrayList<>();

		//ArrayList<ArrayList<String>> input = new ArrayList<>();
		//String[] input;
		//String[][] input;;
		while(fileReader.hasNext())
		{
			String nextLine = fileReader.nextLine();
			//String operations

			//input = nextLine.split("");
			input.add(nextLine);
		}
	}
	
}
