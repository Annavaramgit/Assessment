import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstQuestion {

	public static void main(String[] args) {

		Integer[] sampleArray = { 1, 2, 3, 4, 5, 6, 7 };

		List<Integer> sampleList = Arrays.asList(sampleArray);

		Collections.shuffle(sampleList);

		sampleList.toArray(sampleArray);

		System.out.println(Arrays.toString(sampleArray));
	}
}