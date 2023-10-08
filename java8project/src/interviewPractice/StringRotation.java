package interviewPractice;

public class StringRotation {

    public static String rotateLeft(String input, int positions) {
        int length = input.length();
        int shift = positions % length;
        String rotated = input.substring(shift) + input.substring(0, shift);
        return rotated;
    }
    
    public static String rotateRight(String input, int positions) {
        int length = input.length();
        int shift = positions % length;
        String rotated = input.substring(length - shift) + input.substring(0, length - shift);
        return rotated;
    }

    
    public static void main(String[] args) {
        String original = "HelloWorld";
        int positions = 3;
        String leftRotatedString = rotateLeft(original, positions);
        System.out.println("Original String: " + original);
        System.out.println("Rotated String (Left): " + leftRotatedString);
        
        String rightRotatedString = rotateRight(original, positions);
        System.out.println("Original String: " + original);
        System.out.println("Rotated String (Right): " + rightRotatedString);
    }
}

