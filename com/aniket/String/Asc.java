package String;

public class Asc {
    public static void main(String[] args) {
        String s = "aniket";
        String t= "tekina";
        int[] char_counts = new int[26];
        for (int i=0;i<s.length();i++){
            System.out.print(char_counts[s.charAt(i)-'a']++ + " ");
        }
        for (int i=0;i<t.length();i++){
            System.out.print(char_counts[t.charAt(i)-'a']-- + " ");
        }
        for(int count: char_counts){
            if(count!=0) {
                System.out.println("false");
            }
            else{
                System.out.println("True");
            }
        }
       // System.out.println(validAnagram(s,t));

//        for(int i=0;i<s.length();i++){
//            System.out.print(s.charAt(i)-'a'+ " ");
//
//        }
//        System.out.println();
//
//        for(int i=0;i<t.length();i++){
//            System.out.print(t.charAt(i)-'0'+" ");
//        }
    }
    static Boolean validAnagram(String s, String t){
        if(s.length()!=t.length()) return false;
        int[] char_counts= new int[26];

        for(int i=0;i<s.length();i++){
            char_counts[s.charAt(i)-'a']++;
            char_counts[t.charAt(i)-'a']--;
        }
        for(int count : char_counts){
            if(count!=0) return false;
        }
        return true;
    }

}
