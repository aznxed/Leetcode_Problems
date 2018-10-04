public class solution {
    public int lengthOfLastWord(String s) {
        String b = s.trim(); 
	    int len = b.length();
	    int lastSpace = -1;
	    
	    for(int i = 0; i < len; i++){
	        if(b.charAt(i) == ' '){
	            lastSpace = i;
	        }
	    }
	    
	    if(lastSpace == -1){
	        return b.length();
	    }
	    
	    String sub = b.substring(lastSpace, len-1);
	    return sub.length();
    }
}