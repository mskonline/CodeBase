package problems.hackerrank.strings;

public class SuperReducedString {

	public static void main(String[] args) {
		System.out.println(super_reduced_string("aa"));
	}

	static String super_reduced_string(String s){
        // Complete this function
		if(s.isEmpty())
			return "Empty String";

		StringBuilder str = new StringBuilder();

        for(int i = 0; i < s.length();){
            if((i + 1) < s.length() && s.charAt(i) == s.charAt(i + 1)){
            	i = i + 2;
            } else {
            	if(i < s.length())
                	str.append(s.charAt(i));
            	++i;
            }
        }

        if(s.equalsIgnoreCase(str.toString()))
        	return s;
        else
        	return super_reduced_string(str.toString());
    }

}
