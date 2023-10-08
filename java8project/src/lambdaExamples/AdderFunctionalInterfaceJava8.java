package lambdaExamples;



public class AdderFunctionalInterfaceJava8 {
    public static void main(String[] args) {
        // Lambda function to add two numbers
        Adder adder = (a,b)->a+b;

        // Example usage of the lambda function
        int result = adder.add(5, 7);
        System.out.println("Result: " + result);  // Output: Result: 12
    }
}
