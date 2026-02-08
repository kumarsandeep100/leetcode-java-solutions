import java.util.HashMap;

class P18{
  public int romanToInt(String s){
    HashMap<Character,Integer> map = new HashMap<>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);
    int l = s.length();
    int result = map.get(s.charAt(l-1));

    for(int i = 0;i<l-1;i++){
      if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){

        result = result - map.get(s.charAt(i));

      }
      else{
        result = result + map.get(s.charAt(i));
      }
    }

    return result;
  
 

    
  }

  public static void main(String[] args) {
    P18 p = new P18();
    int r = p.romanToInt("MCMXCIV");

    System.out.println(r);
  }
}