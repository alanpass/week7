import java.util.*;

class animal{
    String name;
    double height;
    int weight;
    int speed;
    
    static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }

    animal(String name,double height,int weight,int speed){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    void show(){
        System.out.println("姓名："+this.name);
        System.out.println("身高："+this.height);
        System.out.println("體重："+this.weight);
        System.out.println("速度："+this.speed);
    }

    double distance(int x,double y){
        return x*y*this.speed;
    }
    double distance(int x){
        return x*this.speed;
    }
}

class human extends animal{
    String gender;
    human(String name,double height,int weight,int speed,String gender){
        super(name, height, weight, speed);
        this.gender = gender;
    }
    void show(){
        super.show();
        System.out.println("性別："+gender);
    }
}

class snow extends human{
    String skill;
    snow(String name,double height,int weight,int speed,String gender,String skill){
        super(name, height, weight, speed, gender);
        this.skill = skill;
    }
    void show(){
        super.show();
        System.out.println("技能："+skill);
    }
    double distance(int x,double y){
        return x*y*2*this.speed;
    }
    double distance(int x){
        return x*2*this.speed;
    }
}

public class A1113359_0331 {
    public static void main(String[] argv){
        animal.showinfo();
        animal []animals = {new animal("雪寶",1.1,52,100),
        new animal("驢子",1.5,99,200)};

        human [] people = {new human("阿克", 1.9, 80, 150, "男"),
        new human("漢斯", 1.8, 78, 130, "男"),
        new human("安娜", 1.7, 48, 120, "女")};
        
        snow queen = new snow("愛沙", 1.7, 50, 120, "女", "Yes");
                
        
        for(animal a : animals){
            a.show();
            System.out.println();
        }
        for(human h : people){
            h.show();
            System.out.println();
        }
        queen.show();
        System.out.println();        

        Scanner sc = new Scanner(System.in);
        double dist;
        for (animal a : animals){
            System.out.println("請輸入"+a.name+"的奔跑時間(x)");
            int x = sc.nextInt();
            System.out.println("請輸入"+a.name+"的加速度(y)。若無請輸入0");
            double y = sc.nextDouble();
            if (y==0)
                dist = a.distance(x);
            else
                dist = a.distance(x,y);
            System.out.println(a.name+"的奔跑距離為"+dist+"\n");
        }   

        for(human h : people){
            System.out.println("請輸入"+h.name+"的奔跑時間(x)");
            int x = sc.nextInt();
            System.out.println("請輸入"+h.name+"的加速度(y)。若無請輸入0");
            double y = sc.nextDouble();
            
            if (y==0)
                dist = h.distance(x);
            else
                dist = h.distance(x,y);
            System.out.println(h.name+"的奔跑距離為"+dist+"\n");
        }

        System.out.println("請輸入"+queen.name+"的奔跑時間(x)");
        int x = sc.nextInt();
        System.out.println("請輸入"+queen.name+"的加速度(y)。若無請輸入0");
        double y = sc.nextDouble();
        
        if (y==0)
            dist = queen.distance(x);
        else
            dist = queen.distance(x,y);
        System.out.println(queen.name+"的奔跑距離為"+dist+"\n");
    }
}