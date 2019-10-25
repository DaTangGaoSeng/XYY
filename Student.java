package Lv4;

public class Student {
    private int times;//被安排次数
    private String name;

    public void setName(String name) {
        this.name = "Student"+name;
    }

    public String getName() {
        return name;
    }
    public Student(String name){
        this.setName(name);
        this.times = 0;
    }
    public void add(){
        this.times++;
    }
    public boolean dayu2(){
        if(this.times>=2)
            return true;
        else
            return false;
    }
}
