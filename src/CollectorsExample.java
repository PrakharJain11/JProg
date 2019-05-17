
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class CollectorsExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ram","Shyam","Shiv","Mahesh","Shiv");
		String result=  list.stream().collect(Collectors.joining(","));
		System.out.println("Joining Result: "+ result);
	}
} 