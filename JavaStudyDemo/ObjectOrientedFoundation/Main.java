package JavaStudyDemo.ObjectOrientedFoundation;

//此包Object Oriented Foundation属于《面向对象基础》



/*
public class Main   //引用传递及其应用
{
    public static void main(String[]args)
    {
        //三道引用传递范例
        Demo d1 = new Demo();   //声明且实例化Demo对象
        d1.temp = 50;   //修改temp的内容
        System.out.println("fun1()方法调用之前:" + d1.temp);
        fun1(d1);   //调用fun1方法
        System.out.println("fun1()方法调用之后:" + d1.temp);

        String s = "Elk";
        System.out.println("fun2()方法调用之前:" + s);
        fun2(s);   //调用fun2方法
        System.out.println("fun2()方法调用之后:" + s);

        Demo d2 = new Demo();   //声明且实例化Demo对象
        d2.tmp = "Elk";   //修改temp的内容
        System.out.println("fun3()方法调用之前:" + d2.tmp);
        fun3(d2);   //调用fun3方法
        System.out.println("fun3()方法调用之后:" + d2.tmp);

        //接受本类引用
        Demo d3 = new Demo();   //声明且实例化Demo对象
        d3.setT(666);
        System.out.println("fun4()方法调用之前:" + d3.getT());
        d3.fun4(d3);   //调用fun4方法
        System.out.println("fun4()方法调用之后:" + d3.getT());

        //一对一关系
        Person per = new Person("ELK", 18);
        Book bk = new Book("Java EE", 199);
        per.setBook(bk);
        bk.setPerson(per);
        System.out.println("通过人找到书---> 姓名:"+per.getName()+" 年龄:"+per.getAge()+"; 书名:"+per.getBook().getTitle()+" 价格:"+per.getBook().getPrice());
        System.out.println("通过书找到人---> 书名:"+bk.getTitle()+" 价格:"+bk.getPrice()+"; 姓名:"+bk.getPerson().getName()+" 年龄:"+bk.getPerson().getAge());

        //进一步深入一对一关系
        Person cld = new Person("Tasty",17);
        Book b = new Book("C++", 666);
        cld.setBook(b);
        b.setPerson(cld);
        per.setChild(cld);
        System.out.println(per.getName()+"的孩子--->"+per.getChild().getName()+" 年龄:"+per.getChild().getAge()+"; 书名:"+per.getChild().getBook().getTitle()+" 价格:"+per.getChild().getBook().getPrice());
    }

    public static void fun3(Demo d2)   //该方法由主方法直接调用
    {
        d2.tmp = "kzy";
    }

    public static void fun2(String s)   //该方法由主方法直接调用
    {
        s = "kzy";
    }

    public static void fun1(Demo d1)   //该方法由主方法直接调用
    {
        d1.temp = 1000;   //修改temp值
    }
}

class Person   //定义Person类
{
    private String name;   //姓名
    private int age;   //年龄
    private Book book;   //一个人有一本书
    private Person child;   //一个人有一个孩子
    public Person(String name, int age)   //声明多参构造方法
    {
        this.setName(name);
        this.setAge(age);
    }
    //声明setter和getter方法来设置和访问类中的私有属性
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void setBook(Book book)
    {
        this.book = book;
    }
    public Book getBook()
    {
        return book;
    }
    public void setChild(Person child)
    {
        this.child = child;
    }
    public Person getChild()
    {
        return child;
    }
}

class Book   //定义Book类
{
    private String title;   //标题
    private float price;   //加个
    private Person person;   //一本书属于一个人
    public Book(String title, float price)   //声明多参构造方法
    {
        this.setTitle(title);
        this.setPrice(price);
    }
    //声明setter和getter方法来设置和访问类中的私有属性
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getTitle()
    {
        return title;
    }
    public void setPrice(float price)
    {
        this.price = price;
    }
    public float getPrice()
    {
        return price;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public Person getPerson()
    {
        return person;
    }
}

class Demo   //定义Demo类
{
    private int t = 100;   //声明t属性并封装
    int temp = 10;   //为了方便访问，此处不封装
    String tmp = "hello";   //为了方便访问，此处不封装
    public void fun4(Demo d)   //直接通过对象调用来访问类中的私有属性
    {
        this.t = 999;
    }
    public void setT(int t)   //用setter设置属性t
    {
        this.t = t;
    }
    public int getT()   //用getter方法访问属性t
    {
        return t;
    }
}
*/

/*
public class Main   //String类的常用方法
{
    public static void main(String[]args)
    {
        String s = "   Hello World!!!   ";   //定义一个字符串
        demo1(s);
        demo2(s);
        demo3(s);
        demo4(s);
        demo5(s);
        demo6(s);
        demo7(s);
        demo8(s);
        demo9(s);
        demo10(s);
        demo11(s);
        demo12(s);
    }

    public static void demo1(String s)   //字符串和字符串数组的相互转换功能
    {
        System.out.print("\n字符串和字符串数组的相互转换功能\n");
        char [] c = s.toCharArray();   //把字符串变成字符数组
        for(int i = 0; i < c.length; i++)   //遍历输出
        {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        String s1 = new String(c);   //把字符数组全部变为一个字符串
        System.out.println(s1);
        String s2 = new String(c, 0, 8);   //把字符数组从指定的位置以及位数变为字符串
        System.out.println(s2);
    }

    public static void demo2(String s)   //从字符串中取出指定位置的字符
    {
        System.out.print("\n从字符串中取出指定位置的字符\n");
        char c = s.charAt(7);    //取出字符串中的第4个字符
        System.out.println(c);
    }

    public static void demo3(String s)   //字符串和byte数组的相互转换功能
    {
        System.out.print("\n字符串和byte数组的相互转换功能\n");
        byte [] b = s.getBytes();   //把字符串变成byte数组
        String s1 = new String(b);   //把byte数组全部变为字符串
        String s2 = new String(b, 0, 8);   //把byte数组从指定位置以及位数变为字符串
    }

    public static void demo4(String s)   //取得一个字符串的长度
    {
        System.out.print("\n取得一个字符串的长度\n");
        int sl = s.length();   //用length取得字符串长度,记得要加()
        System.out.println(sl);
    }

    public static void demo5(String s)   //查找指定的字符串是否存在
    {
        System.out.print("\n查找指定的字符串是否存在\n");
        System.out.println(s.indexOf("o"));   //从头开始查找并返回位置
        System.out.println(s.indexOf("o",8));   //从指定位置开始查找并返回位置
        System.out.println(s.indexOf("k"));   //找不到则返回-1
    }

    public static void demo6(String s)   //去除左右两端空格
    {
        System.out.print("\n去除左右两端空格\n");
        System.out.println(s.trim());   //去掉字符串左右的空格并输出
    }

    public static void demo7(String s)   //字符串截取
    {
        System.out.print("\n字符串截取\n");
        System.out.println(s.substring(9));   //截取第9位开始后面的字符串
        System.out.println(s.substring(3,8));   //截取第3位到第8位的字符串
    }

    public static void demo8(String s)   //拆分字符串
    {
        System.out.print("\n拆分字符串\n");
        String st = s.trim();   //去除字符串两边的空格
        String [] sa = st.split(" ");   //按空格将字符串拆分成字符串数组
        for(int i = 0; i < sa.length; i++)
        {
            System.out.println(sa[i]);
        }
    }

    public static void demo9(String s)   //大小写转换
    {
        System.out.print("\n大小写转换\n");
        System.out.println(s.toUpperCase());   //全部转成大写
        System.out.println(s.toLowerCase());   //全部转成小写
    }

    public static void demo10(String s)   //判断是否以指定字符串开头或结尾
    {
        System.out.print("\n判断是否以指定字符串开头或结尾\n");
        String st = s.trim();
        System.out.println(st.startsWith("Hello"));   //判断字符串是否以"Hello"开头
        System.out.println(st.endsWith("World!!!"));   //判断字符串是否以"world!!!"结尾
    }

    public static void demo11(String s)   //不区分大小写的比较
    {
        System.out.print("\n不区分大小写的比较\n");
        System.out.println(s.equals("   hello world!!!   "));   //区分大小写的比较
        System.out.println(s.equalsIgnoreCase("   hello world!!!   "));   //不区分大小写的的比较
    }

    public static void demo12(String s)   //字符串替换功能
    {
        System.out.print("\n字符串替换功能\n");
        String sr = s.replaceAll("l","x");
        System.out.println(sr);
    }
}
*/

/*
public class Main   //String类
{
    public static void main(String[]args)
    {
        Damo1();
        Damo2();
    }

    public static void Damo1()
    {
        String damo1 = "ELK.";   //直接赋值
        System.out.println("姓名:"+damo1);
        String damo2 = new String("ELK.");   //通过new来赋值
        System.out.println("姓名:"+damo2);
        String damo3 = damo2;   //引用传递
        System.out.println("damo1 == damo2 -->"+(damo1 == damo2));
        System.out.println("damo1 == damo3 -->"+(damo1 == damo3));
        System.out.println("damo2 == damo3 -->"+(damo2 == damo3));
        System.out.println("damo2 equals damo3 -->"+(damo1.equals(damo2)));
        System.out.println("damo2 equals damo3 -->"+(damo1.equals(damo3)));
        System.out.println("damo2 equals damo3 -->"+(damo2.equals(damo3)));
        //结论: String有两种比较方式
        //种是使用“==”完成,比较的是地址值
        //另一种是使用“equals”方法完成,比较的是具体的内容,开发中比较常用
    }

    public static void Damo2()
    {
        System.out.println("hello".equals("hello"));
        //一个字符串就是String的匿名对象
        String damo1 = "hello";   //直接赋值
        String damo2 = "hello";   //直接赋值
        String damo3 = "hello";   //直接赋值
        System.out.println("damo1 == damo2 -->"+(damo1 == damo2));
        System.out.println("damo1 == damo3 -->"+(damo1 == damo3));
        System.out.println("damo2 == damo3 -->"+(damo2 == damo3));
        String damo4 = new String("hello");   //使用new赋值
        //使用直接赋值的方式只需要一个实例化对象即可,
        //而使用new String()的方式则意味着要开辟两个内存对象。
        //开发中最好使用直接赋值的方式完成。
        damo4 = damo4 + " world!!!";
        System.out.println(damo4);
        //字符串的内容一旦声明则不可改变
        //实际上字符串内容的改变,改变的是内存地址的引用关系。
        //所以,在开发中应该避免如下的使用操作
        String damo5 = "ELK.";
        for(int i = 0; i < 100; i++)
        {
            damo5 = damo5 + i;
        }
        System.out.println(damo5);
        //但是这样的操作,要断开连接引用100次才可以完成。
        // 这样的操作性能很低,应该避免使用。
    }
}
*/

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