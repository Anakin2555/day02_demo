package day02.homework04;

public class Test {
    static Long calculate(CaseInterface<Long,Long> caseInterface,Long x, Long y){
        return  caseInterface.function(x,y);
    }

    public static void main(String[] args) {
        System.out.println("33+22="+calculate((x,y) -> x+y , 33L,22L));
        System.out.println("33*22="+calculate((x,y) -> x*y , 33L,22L));

    }
}
