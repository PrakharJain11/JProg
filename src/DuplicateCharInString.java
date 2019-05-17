import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharInString {
	
	public static char[] DuplicateChar(String str)
	{
		char[] ch = str.toCharArray(); 
		return ch;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Long> ch ="The quick brown fox jumped over the lazy dog."
        .chars()
        .mapToObj(i -> (char) i)
        .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
	}

}
