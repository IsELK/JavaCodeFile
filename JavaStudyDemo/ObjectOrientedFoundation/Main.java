package JavaStudyDemo.ObjectOrientedFoundation;

//此包Object Oriented Foundation属于《面向对象基础》



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
*///构造方法与匿名对象

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
*///封装性

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
*///面向对象、类与对象的定义

//这是结尾!!!