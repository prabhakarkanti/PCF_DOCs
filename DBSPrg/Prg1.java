import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Prg1{
public static String Prob1Function(int size) {
		Scanner in = new Scanner(System.in);
		String Winner = null;
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		String temp = null;
		String[] num = { "joe", "mon", "joe", "mon", "rach", "rach", "rach", "phoe", "phoe", "phoe" };

		for (int i = 0; i < num.length; i++) {
			temp = num[i];
			if (map.containsKey(temp)) {
				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1); 
}
		}

		int maxVotes = Collections.max(map.values());

		List listOfMax = map.entrySet().stream().filter(entry -> entry.getValue() == maxVotes).map(Map.Entry::getKey)
				.collect(Collectors.toList());

		String ssds = (String) listOfMax.get(listOfMax.size() - 1);

		return ssds;
	} 

public static void main(String[] args) {
		String Win = Prob1Function(3);
		System.out.println(Win);
	} 

}