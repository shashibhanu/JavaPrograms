package miscJavaPrograms;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class EnglishToHindiTranslatorMyName {
	static Map<String, String> phoneticMap = new HashMap<String, String>();
    static Map<String, String> maatraMap = new HashMap<String, String>();

    static {
        phoneticMap.put("sha","\u0936");
        phoneticMap.put("sh","\u0936");
        phoneticMap.put("i","\u093f");
        phoneticMap.put("bh","\u092d");
        phoneticMap.put("a","\u093e");
        phoneticMap.put("n","\u0928");
        phoneticMap.put("u","\u0941");
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String engWord = "shashi bhanu";
        engWord = engWord.replaceAll("sha",phoneticMap.get("sha") );
        engWord = engWord.replaceAll("sh",phoneticMap.get("sh") );
        engWord = engWord.replaceAll("i",phoneticMap.get("i") );
        engWord = engWord.replaceAll("bh",phoneticMap.get("bh") );
        engWord = engWord.replaceAll("a",phoneticMap.get("a") );
        engWord = engWord.replaceAll("n",phoneticMap.get("n") );
        engWord = engWord.replaceAll("u",phoneticMap.get("u") );

        System.out.println(new String(engWord.getBytes("UTF-8")));
    }
}
