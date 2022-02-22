package day02.homework04;

@FunctionalInterface
public interface CaseInterface<T,R> {
    R function(T t1, T t2);
}
