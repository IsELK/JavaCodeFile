package JavaStudyDemo.ObjectOrientedFoundation;

//此包Object Oriented Foundation属于《面向对象基础》



/*
public class Main   //类设计分析（学生类）
{
    public static void main(String[]args)
    {
        Student ps = new Student("P20200306114", "ELK.", 66.6f, 99.9f, 111.1f);   //声明一个多参数对象
        System.out.println("学号:"+ps.getStuno());
        System.out.println("姓名:"+ps.getName());
        System.out.println("数学成绩:"+ps.getMath());
        System.out.println("英语成绩:"+ps.getEnglish());
        System.out.println("计算机成绩:"+ps.getComputer());
        System.out.println("成绩总和为:"+ps.sum());
        System.out.println("平均成绩为:"+ps.avg());
        System.out.println("最高成绩为:"+ps.max());
        System.out.println("最低成绩为:"+ps.min());
    }
}

//题目:
//定义并测试一个名为Student的类,包括属性有“学号”、“姓名”,以及3门
//课梐数学”、“英诘”和“计算机”的成缋,包括的方法有计算3门课程的“总
//分”、“平均分"、“最高分”及“最低分”。

//程序分析思路:
//1、根据要求写出类所包含的属性;
//2、所有的属性都必须进行封装(private);
//3、封装之后的属性通过setter和getter置和取得;
//4、如果需要可以加入若干构造方法;
//5、再根据其他要求添加相应的方法;
//6、类中的所有方法都不要直接输出,而是交给被调用处输出。

class Student
{
    private String stuno;   //声明学号属性
    private String name;   //声明姓名属性
    private float math;   //声明数学成绩属性
    private float english;   //声明英语成绩属性
    private float computer;   //声明计算机成绩属性
    public Student(){}   //声明一个无参构造方法
    public Student(String s, String n, float m, float e, float c)   //声明一个多参数构造方法
    {
        this.setStuno(s);
        this.setName(n);
        this.setMath(m);
        this.setEnglish(e);
        this.setComputer(c);
    }
    public void setStuno(String s)
    {
        this.stuno = s;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public void setMath(float m)
    {
        this.math = m;
    }
    public void setEnglish(float e)
    {
        this.english = e;
    }
    public void setComputer(float c)
    {
        this.computer = c;
    }
    public String getStuno()
    {
        return stuno;
    }
    public String getName()
    {
        return name;
    }
    public float getMath()
    {
        return math;
    }
    public float getEnglish()
    {
        return english;
    }
    public float getComputer()
    {
        return computer;
    }
    public float sum()   //求成绩总和
    {
        return math + english + computer;
    }
    public float avg()   //求平均成绩
    {
        return sum() / 3;
    }
    public float max()   //求最高成绩
    {
        float max = math;   //假设数学是最高成绩
        max = max>english?max:english;
        max = max>computer?max:computer;
        return max;
    }
    public float min()   //求最低成绩
    {
        float min = math;   //加设数学是最低成绩
        min = min<english?min:english;
        min = min<computer?min:computer;
        return min;
    }
}
*/

/*
public class Main   //构造方法与匿名对象
{
    public static void main(String[]args)
    {
        PerSon ps = new PerSon();   //声明无参构造方法的对象
        ps.setName("ELK.");
        ps.setAge(19);
        ps.tell();
        PerSon pt = new PerSon("Tasty.");   //声明一个参数构造方法的对象
        pt.tell();
        PerSon pu = new PerSon("Bboy.", 66);   //声明两个参数构造方法的对象
        pu.tell();
        new PerSon("Bgirl.",99).tell();   //声明匿名对象
    }
}

class PerSon
{
    private String name;
    private int age;
    //以下三个构造方法为方法重载
    public PerSon(){}   //声明无参构造方法(不声明会自带,每个类至少有一个构造方法)
    public PerSon(String n)   //声明有一个参数的构造方法
    {
        this.setName(n);
    }
    public PerSon(String n, int a)   //声明有两个参数的构造方法
    {
        this.setName(n);
        this.setAge(a);
    }
    public void tell()
    {
        System.out.print(" 姓名:"+getName()+" 年龄:"+getAge()+"\n");
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public void setAge(int a)
    {
        if(a >= 0 && a <= 150)
        this.age = a;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
*/

/*
public class Main   //封装性
{
    public static void main(String[] args)
    {
        Person ps = new Person();   //声明且实例化对象
        ps.setName("ELK.");
        ps.setAge(19);
        ps.tell();
    }
}

class Person
{
    private String name;   //声明封装了的属性
    private int age;   //使用private来封装
    public void tell()   //输出
    {
        System.out.print(" 姓名:"+getName()+" 年龄:"+getAge());
    }
    public void setName(String s)   //使用setter来设置属性
    {
        name = s;
    }
    public void setAge(int a)       //可以在setter里面设置输入参数的规格
    {
        if(a >=0 && a <= 150)
        age = a;
    }
    public String getName()   //使用getter来获取属性
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
*/

/*
public class Main   //类与对象的进一步研究
{
    public static void main(String[]args)
    {
        Person ps = new Person();   //声明且实例化第一个对象
        Person pt = new Person();   //声明且实例化第二个对象
        ps.name = "ELK.";
        ps.age = 19;
        ps.tell();
        pt.name = "Tasty.";
        pt.age = 17;
        pt.tell();

        pt = ps;   //引用传递
        pt.tell();
    }
}

class Person
{
    String name;   //声明名字属性
    int age;   //声明年龄属性
    public void tell()   //输出方法
    {
        System.out.print(" 姓名:"+name+" 年龄:"+age);
    }
}
*///类与对象的进一步研究

/*
public class Main   //面向对象、类与对象的定义
{
    public static void main(String[] args)
    {
        Person ps = null;   //声明对象
        ps = new Person();   //实例化对象
        ps.name = "ELK.";
        ps.age = 19;
        ps.tell();
    }
}

class Person
{
    String name;   //声明名字属性
    int age;   //声明年龄属性
    public void tell()   //输出方法
    {
        System.out.print(" 姓名:"+name+" 年龄:"+age);
    }
}
*/

//这是结尾!!!