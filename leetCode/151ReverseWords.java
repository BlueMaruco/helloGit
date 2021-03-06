public String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();
    for(int i=s.length()-1; i>=0; i--){
          if(s.charAt(i)==' ') continue;
          int start = i;
          while(i>=0 && s.charAt(i)!=' ') i--;
          sb.append(s.substring(i+1, start+1)).append(" ");
    }
    return sb.toString().trim();
}
