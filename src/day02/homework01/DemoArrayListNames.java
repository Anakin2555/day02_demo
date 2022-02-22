package day02.homework01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DemoArrayListNames {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");
        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

//        1. 第一个队伍只要名字为3个字的成员姓名；
        Stream<String> streamOne = one.stream().filter(s -> s.length() == 3);
//        2. 第一个队伍筛选之后只要前3个人；
        Stream<String> streamTwo = streamOne.limit(3);
//        3. 第二个队伍只要姓张的成员姓名；
        Stream<String> streamThree = two.stream().filter(s -> s.startsWith("张"));
//        4. 第二个队伍筛选之后不要前2个人；
        Stream<String> streamFour = streamThree.skip(2);
//        5. 将两个队伍合并为一个队伍；
        Stream<String> streamFive = Stream.concat(streamTwo, streamFour);
//        6. 根据姓名创建 Person 对象；
        Stream<Person> streamSix = streamFive.map(Person::new);
//        7. 打印整个队伍的Person对象信息。
        streamSix.forEach(System.out::println);





        //zyc 分支


        //zyc写的代码
        //zyc写的代码
        //zyc写的代码
        //zyc写的代码
        //zyc写的代码
        //zyc写的代码
    }
}