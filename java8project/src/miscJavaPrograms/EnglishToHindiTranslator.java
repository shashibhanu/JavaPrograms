package miscJavaPrograms;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class EnglishToHindiTranslator {
	static Map<String, String> phoneticMap = new HashMap<String, String>();
    static Map<String, String> maatraMap = new HashMap<String, String>();

    static {
        phoneticMap.put("ma","\u092E");
        phoneticMap.put("ta","\u0924");
        phoneticMap.put("t","\u0924\u094D");
        phoneticMap.put("ra","\u0930");
        maatraMap.put("a","\u093E");
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String engWord = "maatra";
        engWord = engWord.replaceAll("ma",phoneticMap.get("ma") );
        engWord = engWord.replaceAll("t",phoneticMap.get("t") );
        engWord = engWord.replaceAll("ra",phoneticMap.get("ra") );
        engWord = engWord.replaceAll("a",maatraMap.get("a") );

        System.out.println(new String(engWord.getBytes("UTF-8")));
    }
}
