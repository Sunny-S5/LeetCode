class CompressChar {
  // public int compress(char[] chars) {
  // int count=0;
  // for(int i=0;i<chars.length;i++){
  // for(int j=i+1;j<chars.length;j++){
  // if(chars[i]==chars[j]){
  // count++;
  // }else{
  // break;
  // }
  // }
  // }
  // return count;
  // }

  public int compress(char[] chars) {
    int i = 0, res = 0;
    while (i < chars.length) {
      int groupLength = 1;
      while (i + groupLength < chars.length && chars[i + groupLength] == chars[i]) {
        groupLength++;
      }
      chars[res++] = chars[i];
      if (groupLength > 1) {
        for (char c : Integer.toString(groupLength).toCharArray()) {
          chars[res++] = c;
        }
      }
      i += groupLength;
    }
    return res;
  }

  public static void main(String[] args) {
    CompressChar obj = new CompressChar();
    int count = 0;
    char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c' ,'c'};
    count = obj.compress(chars);
    System.out.println(count);
    System.out.println(chars);
  }
}