package Testing;

public class Test {
    public static void main (String[] args){
        int x=5;
        int y=6;
        ++x;
        ++y;
        System.out.println(x++);
        x++;
        System.out.println(y++);
        y++;
        System.out.println(++x);
        x=y++;
        y=--x;
        System.out.println(x);
        System.out.println(++y);
        System.out.println(y);
        y=x--;
        System.out.println(x--);
        System.out.println(y);
        System.out.println(y--);
        x=++y;
        System.out.println(x);
        System.out.println(--x);
        ++x;
        System.out.println(y);
        System.out.println(--y);
    }
}
