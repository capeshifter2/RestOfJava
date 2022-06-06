import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/** gets frequency of words in a text file
 *
 * @author s-daroy
 *
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		Scanner bookIn = getBook(console);
		Map<String, Integer> wordMap = new TreeMap<String, Integer>();
		while (bookIn.hasNext()){
			String word = bookIn.next();
			word = formatWord(word);
			if (wordMap.containsKey(word)) {
				wordMap.put(word, wordMap.get(word) + 1);
				
			}
			else {
				wordMap.put(word, 1);
			}
		}
		System.out.println(wordMap.toString());
		bookIn.close();
		boolean stop = false;
		while (!stop) {
			System.out.print("Word: (q to quit) ");
			String word = console.nextLine();
			if (word.equals("q")) {
				stop = true;
			}
			else {
					System.out.println(word + " : " + wordMap.get(word));
			}
		}
		for (String word : wordMap.keySet()) {
			int value = wordMap.get(word);
			if (value >= 500) {
				System.out.println(word + ": " + value);
			}
		}
	}
	public static Scanner getBook(Scanner console) {
		try {
		System.out.println("Tell me where the book is, and nobody gets hurt.");
		File filepath = new File(console.nextLine());
		Scanner s = new Scanner(filepath);
		

		return s;
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return null;
		
	}
	public static String formatWord(String w) {
		w = w.toLowerCase();
		w = w.replace('\'', ' ');
		w = w.replace(';', ' ');
		w = w.replace('?', ' ');
		w = w.replace('(', ' ');
		w = w.replace(')', ' ');
		w = w.replace('.', ' ');
		w = w.replace(',', ' ');
		w = w.replace('!' , ' ');
		return w;
	}

}
