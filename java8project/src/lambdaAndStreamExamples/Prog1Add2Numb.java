package lambdaAndStreamExamples;
import java.util.function.BiFunction;

public class Prog1Add2Numb {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 3));
	}

}
