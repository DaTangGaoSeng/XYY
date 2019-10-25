package Lv4;
//根据题意 每个时间段最多两人 每个人最多安排两次 下午要上课和搬桌子 有时间来完善
//保证每次时间表都不一样
//算是弄完了//
import java.util.ArrayList;
import java.util.Random;


public class Text {
    public static void main(String[]args) {
        Random random = new Random();
        Timetable []week = new Timetable[5];
        ArrayList<Student> peopleCan = new ArrayList<>(20);
        //生成五天对象
        for(int i = 0;i < 5;i++){
            week[i] = new Timetable(String.valueOf(i));
        }
        //实例化20个人，并放入数组列表里
        for(int i = 0;i < 20;i++){
            peopleCan.add(new Student(String.valueOf(i)));
        }
        //把人装到时间段里去
        for(int h = 0;h < 5;h++){
        for(int i = 0;i < 4;i++){
            int a = random.nextInt(2);
            for(int j = 0;j <= a;j++){
               int tem = random.nextInt(peopleCan.size());
               week[h].time[i][j] = peopleCan.get(tem);
               peopleCan.get(tem).add();
               if(peopleCan.get(tem).dayu2())
                   peopleCan.remove(tem);
            }
        } }
        //打印
        for(int h = 0;h < 5;h++) {
            for (int i = 0; i < 4; i++) {
                week[h].dayin(h+1,i+1);
                for (int j = 0; j < 2; j++) {

                    if (week[h].time[i][j] == null)
                        System.out.print("");
                    else
                        System.out.print(week[h].time[i][j].getName()+" ");
                }
                System.out.println("");
            }
        }
    }
}
