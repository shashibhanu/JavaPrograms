package lambdaExamples;

@FunctionalInterface
interface Adder {
    int add(int a, int b);
}

public class AdderFunctionalInterface {
    public static void main(String[] args) {
        // Lambda function to add two numbers
        Adder adder = new Adder()
        {
            public int add(int a, int b)
            {
            return a+b;
            }
        };

        // Example usage of the lambda function
        int result = adder.add(5, 7);
        System.out.println("Result: " + result);  // Output: Result: 12
    }
}
