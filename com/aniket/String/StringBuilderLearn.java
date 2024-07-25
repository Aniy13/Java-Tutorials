package String;

public class StringBuilderLearn {
    public static void main(String[] args) {
        String name="aniket";
        String name2= "amcamc";
        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
//        for(int i=0;i<name.length();i++){
//            sb.deleteCharAt(i)
//        }
    }
}
