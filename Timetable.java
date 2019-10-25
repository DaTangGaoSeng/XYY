package Lv4;


public class Timetable {

    private String name ;
    public Student time[][] = new Student[4][2];//用private不会搞了
    public Timetable(String name){
        this.name = "星期"+name;
    }
   /* private ArrayList<Student> time_1;
    private ArrayList<Student> time_2;
    private ArrayList<Student> time_3;
    private ArrayList<Student> time_4;//每一天由四个时间段，每个时间段装一或者两个人；

    public void setTime_1(Student e) {
        this.time_1.add(e);
    }

    public void setTime_2(Student e) {
        this.time_2.add(e);
    }
    public void setTime_3(Student e) {
        this.time_3.add(e);
    }
    public void setTime_4(Student e) {
        this.time_4.add(e);
    }*/
   public void setTime(Student e,int i ,int j) {
        this.time[i][j] = e;
    }
   /* public Student getTime(int i ,int j){
       return time[i][j];
    }*/
   public void dayin(int i, int j){
       System.out.printf("星期%d第%d时间段:",i,j);
   }
}
