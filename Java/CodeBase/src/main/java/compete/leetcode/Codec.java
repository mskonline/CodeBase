package compete.leetcode;


// Encode and Decode TinyURL
// Accepted

public class Codec {

	private java.util.Map<String, String> URLMap;
	private final String alphaNumerals = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private final int ALPHA_NUMERAL_LENGTH = alphaNumerals.length();
	private final int KEY_LENGTH = 6;

	public Codec() {
		URLMap = new java.util.TreeMap<String, String>();
	}

	// Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
    	String key = generateRandomKey();
    	URLMap.put(key, longUrl);

    	return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
    	return URLMap.get(shortUrl);
    }

    public String generateRandomKey(){
    	java.util.Random random = new java.util.Random();
    	StringBuffer keyBuffer = new StringBuffer();
    	char randomChar;

    	for(int i = 0; i < KEY_LENGTH; ++i){
    		randomChar = alphaNumerals.charAt(random.nextInt(ALPHA_NUMERAL_LENGTH));
    		keyBuffer.append(randomChar);
    	}

    	return keyBuffer.toString();
    }
}
