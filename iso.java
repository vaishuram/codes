
import java.util.*;
class iso{
public static void main(String args[])
{string s1="abb';
string s2="cdd";
public boolean isIsomorphic(String s1, String s2) {
Map<Character, Integer> m1 = new HashMap<>();
Map<Character, Integer> m2 = new HashMap<>();
for(Integer i = 0; i < s1.length(); i++) {
if(m1.put(s1.charAt(i), i) != m2.put(s2.charAt(i), i)) {
return false;
  }
}
return true;
}
}
}
