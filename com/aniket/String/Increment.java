package String;

public class Increment {
    public static void main(String[] args) {
        int x=7;
        x+=x++ + ++x;
        System.out.println(x);
    }
}
