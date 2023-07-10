import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public classimport java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment7_2 {
    public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in);
    String num=sc.next();
    sc.close();
System.out.println(isStrobogrammatic(num));
    } 
    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        int l = 0, r = num.length() - 1;
        while (l <= r) {
            if (!map.containsKey(num.charAt(l))) return false;
            if (map.get(num.charAt(l)) != num.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}{
    public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in);
    String num=sc.next();
    sc.close();
System.out.println(isStrobogrammatic(num));
    } 
    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        int l = 0, r = num.length() - 1;
        while (l <= r) {
            if (!map.containsKey(num.charAt(l))) return false;
            if (map.get(num.charAt(l)) != num.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
