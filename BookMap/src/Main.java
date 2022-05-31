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
	}
	public static Scanner getBook(Scanner console) {
		try {
		System.out.println("Tell me where the book is, and nobody gets hurt.");
		File filepath = new File(console.nextLine());
		Scanner s = new Scanner(filepath);
		
		console.close();
		return s;
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return null;
		
	}
	public static String formatWord(String w) {
		w = w.toLowerCase();
		w.replace('\'', ' ');
		w.replace(';', ' ');
		w.replace('?', ' ');
		w.replace('(', ' ');
		w.replace(')', ' ');
		w.replace('.', ' ');
		w.replace(',', ' ');
		w.replace('!' , ' ');
		return w;
	}

}
