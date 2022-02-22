package day02.homework03;

public class Test {
    static String doStr(StringDemo stringDemo,String s){
        return stringDemo.getValue(s);
    }

    public static void main(String[] args) {
        String s1=doStr(a->a.toUpperCase(),"test case");
        System.out.println(s1);

        System.out.println(doStr(a->a.substring(1,4),s1));
    }
}
