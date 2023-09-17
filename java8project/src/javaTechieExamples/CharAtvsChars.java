package javaTechieExamples;

public class CharAtvsChars {
	public static void main(String arg[])
	{
		String input = "Hello World";
		
		//in java 7
		
		for (int i = 0; i < input.length(); i++) 
		{
		    System.out.println(input.charAt(i));
		}
		
		//in Java 8

		input.chars()
		        .mapToObj(i -> (char)i)
		        .forEach(System.out::println);
		
		/*why String.chars() Returns IntStream
		Compatibility: When Java was originally designed, it used a 16-bit char type to represent characters because it was based on the Unicode standard, which initially had a 16-bit encoding (UCS-2). However, as Unicode expanded to include more characters, a 16-bit encoding became insufficient.
		Backward Compatibility: To maintain backward compatibility with existing code, Java kept the char type as a 16-bit entity while introducing methods like String.chars() to work with code points beyond the char's range
			 */
			
		//Without method reference
			input.chars()
		    .forEach(i -> System.out.println((char)i));
	}

}
