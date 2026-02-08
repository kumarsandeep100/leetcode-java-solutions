import java.util.Arrays;

public class P14 {

  public String longestCommonPrefix(String[] strs){
   Arrays.sort(strs);

   int count = 0;
   int l = strs[0].length();
   int lI = strs.length;

   for(int i = 0;i<l;i++){

    char ch = strs[0].charAt(i);
    char ch1 = strs[lI-1].charAt(i);
    if(ch==ch1){
      count++;
    }
    else{
      break;
    }
    
   }

   if(count==0){
    return "";
   }
   else{
    String s = strs[0].substring(0,count);
    return s;
   }
  }

  public static void main(String[] args) {
    String[] strs = {"flower", "flow","fly","fline","mala"};
    P14 p = new P14();
    String s = p.longestCommonPrefix(strs);
    System.out.println(s);
  }
  
}
