package assignment7;		//package declaration
import java.util.*;
class AlphabeticalOrder
{
	static void AlphaChar(String st)
	{
		int l = st.length();
		st=st.toUpperCase();		//converting letter in words to uppercase
		//sort letters
		for(int i = 65;i<=90;i++)
		{
			for(int j=0;j<l;j++)
			{
				char ch = st.charAt(j);
				if(i==ch)
					System.out.print((char)i+" ");		//print letters in ascending order
			}
		}
	}
}
public class Assignment7_2 extends AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);	// Accept input
        System.out.print("Enter String: ");
        String input = scanner.nextLine();	// Add a space at end of input String
        input = input + " ";		// Find number of words
        int numberOfWords = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                numberOfWords++;
            }
        }
	// Extract words and store in array
        String[] words = new String[numberOfWords];
        int startIndex = 0;
        int currentWord = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                String word = input.substring(startIndex, i);
                words[currentWord] = word;
                currentWord++;
                startIndex = i + 1;
            }
        }
        // Sort words
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        // Print words
	System.out.println("Sorted String");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
	System.out.println();
	System.out.println();
	System.out.println("Sorting characters in each word");
	for(int i=0;i<words.length;i++)
	{
		AlphaChar(words[i]);
		System.out.println();
	}
	}

}
