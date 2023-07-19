package dev.grafity.bos;

public class StringInterpolation {
    public static void main(String[] args) {
        String name="Keerthi";
        float exp = 2.5F;
        String msg = ":name is a %.1f years experienced java developer";
        String actMsg = String.format(msg,name,exp);
        System.out.println(actMsg);
        name="Sasi";
        exp = 4;
        System.out.println(String.format(msg,name,exp));
    }
}
