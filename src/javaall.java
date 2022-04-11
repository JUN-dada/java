import java.util.Scanner;
import java.util.SortedMap;
import java.util.Random;
import java.util.Scanner;

public class javaall {
    public static void main(String[] args) {
        /*
        System.out.println(0x88cc);
        System.out.println();
        System.out.println("hello java");
        System.out.println(true);
        System.out.println(false);
        */

        /*
        int y=8;
        int x=10;
        x=y+3;
        System.out.println(x);

        byte a=13;
        short b=543;
        long  c=3345;
        int d=1234;
        float e=2.23f;
        double f=8.33d;
        System.out.println(a+b+c+d+e+f);
    */


     /*
        int a1=1;
        int b1=2;

        int t;
        t=a1;
        a1 = b1;
        b1 = t;


        System.out.println(b1);
        System.out.println(a1);



        int a3=3;
        int a4=4;

        int a5;
         a5=a3;
         a3=a4;
         a4=a5;
        System.out.println(a4);
        System.out.println(a3);




        int b4=3;
        int b2=4;

        int b6;
        b6=b4;
        b4=b2;
        b2=b6;
        System.out.println(b4);
        System.out.println(b2);



        int g=1;
        int k=2;
        int p;

        k=g;
        g=k;
        k=p;
        System.out.println(g);
        System.out.println(k);
*/
    /*
        int a = 9;
        byte num = (byte) a;
        System.out.println(num);
     */

        /*
        byte a=4;
        byte b=5;
        byte c;
        c=(byte) (a+b);
        System.out.println(c);
        a+b会直接提升至int类型
         */

        /*作用域
        int x=4;
        int y;
        {
            y = 3;
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        }
        x=y;
        System.out.println("x="+x);
         */

        /*
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("和为"+a+b);
        System.out.println("差为"+(a-b));
        System.out.println("乘积为"+a*b);
        System.out.println("商为"+a/b);
        System.out.println("余数是"+a%b);
         */

       /*
        int a=4;
        int b=3;
        int c;
        c=++a+b--;   //++先算b前面的再算b++
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        */

        /*
        int a=4;
        int b=3;
        a+=b; //a+a+b;
        a-=b;  //a=a-b;
        a*=b;
        a/=b;
        System.out.println(a);
        System.out.println(b);
        */

        /*
    double c = Math.PI;
    System.out.println("请输入圆的半径");
    double a;
    Scanner scanner = new Scanner(System.in);
    a = scanner.nextDouble();
    a = c * (a * a);
    System.out.println("面积为" + a);
    a = 2 * c * a;
    System.out.println("周长为" + a);
         */
/*
   byte s=3;
   int x=5;
   s+=x;//强制转化
        System.out.println(s);
 */
        /*
        int x=1;
        int y=2;
        int z=0;
        boolean a;
        boolean b;
         a=x>=1 && y>=2; // 只有一个 ｜and &无论成立与否都要进行运算;
         b=x>1 | y>=1;
        System.out.println(a);
        System.out.println(b);
        */


        /*
     int x;
     Scanner scanner=new Scanner(System.in);
     x= scanner.nextInt();
     if (x%2==0)
     {
         System.out.println("偶数");
     }
     else
     {
         System.out.println("奇数");
     }
    */


        /*
        float grade;
        Scanner scanner=new Scanner(System.in);
        grade= scanner.nextFloat();
        if (grade>=70 && grade<=80)
        {
            System.out.println("nb");
        }

        else if (grade>=80 && grade<=90)
        {
            System.out.println("nbb");
        }

        else if (grade>=90)
        {
            System.out.println("nbbb");
        }

        else
        {
            System.out.println("bbbbb");
        }

         */


        /*
        int x,y;
        Scanner scanner=new Scanner(System.in);
        x= scanner.nextInt();
        y= scanner.nextInt();
        int i= x > y ? x : y  ;
        /*
        if (x>y)
        {
            System.out.println(x);
        }

        else
        {
            System.out.println(y);
        }

        System.out.println(i);
         */

        /*
        int a,b,c,d;
        Scanner scanner=new Scanner(System.in);
        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();
        d= scanner.nextInt();

        int e=a>b?a:c>d?a:c>d?a>10?b:2:d;
        System.out.println(e);
         */
        /*
        int x;
        Scanner scanner=new Scanner(System.in);
        x= scanner.nextInt();
        switch (x)
        {
            case 1:
                System.out.println("星期一");break;
            case 2:
                System.out.println("星期二");break;
            case 3:
                System.out.println("星期三");break;
            case 4:
                System.out.println("星期四");break;
            case 5:
                System.out.println("星期五");break;
            case 6:
                System.out.println("星期六");break;
            case 7:
                System.out.println("星期日");break;
        }
         */

        /*
        int x;
        Scanner scanner=new Scanner(System.in);
        x= scanner.nextInt();
        switch (x/10)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("爬开");break;
            case 6:
                System.out.println("及格");break;

            case 8:
                System.out.println("海星");break;

            case 9:
                System.out.println("优秀");break;
         */

        /*
        int [] x;
        x=new int[10];
        x[0]=4;
        float [] y=new float[10];
        y[0]=4.5f;
        boolean[] z =new boolean[3];
        z[0]=true;
        System.out.println(x[0]);
        System.out.println(y[0]);
        System.out.println(z[0]);
        System.out.println("x数组对长度是"+x.length+"最大索引为"+(x.length-1));
        //.length返回数组长度
         */

        /*
        int [] x=new int[]{1,2,34,4};
        int [] y=new int[]{3,4,5,67,78,6};
        int [] z=new int[]{1,2,3,4,344};
        System.out.println(x.length);
        System.out.println(y.length);
         */

        /*
     float [] a=new float[10];
     Scanner scanner = new Scanner(System.in);
        for (int e=0; e<10; e++)
        {
          a[e]=scanner.nextFloat();
        }
        for(int i=0;i<=9;i++)
        {
            System.out.println(a[i]);
        }
         */

        //猜数字游戏
        /*
        int x;
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        if (x==1)
        {
            System.out.println("猜对了");
        }
        else
        {
            System.out.println("猜错了");
        }
         */

        //int x [][]=new int[3][3];
        


       /*二维数组
        //int x [][]=new int[3][3];
        //x[0]=new int[]{1,2,3};
        //int [][] x={{1,2,3},{4,5,6},{7,8,9}};
        */

      /*
        int [][] arr=new int[3][];
         arr[0]=new int[]{81,99};
        arr[1]=new int[]{75,79,84};
        arr[2]=new int[]{54,60,86,80};
        int sum=0;
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            int groupsum=0;
            for(int j=0;j<arr[i].length;j++)
            {
            groupsum=groupsum+arr[i][j];
            count++;
            }
            System.out.println("第"+(i+1)+"组的总成绩为"+groupsum+"平均成绩为"+groupsum/arr[i].length);
            sum=groupsum+sum;
        }
        System.out.println(arr.length+"个小组的总成绩为"+sum+"平均成绩为"+sum/count);
       */

        System.out.println("随机点名器");
        String [] students=new String[5];
        //存储同学名字
        addStudnetName(students);
        //输出同学的名字
        printStudentName(students);
        //随机同学
        String callname=randomStudent(students);
        System.out.println("被点到的同学是"+callname);

    }

    //储存班级同学信息
    //通过键盘输入的方法输入每一位同学的信息
    public static void addStudnetName (String[] students)
    {
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<students.length;i++)
        {
            System.out.println("正在存储"+(i+1)+"个同学的名字");
            students[i]= scanner.next();
        }
    }
    //总揽已经存储的名字
    public static void printStudentName(String[] students)
    {
        for (int i=0;i<students.length;i++)
        {
            String name =students[i];
            System.out.println("第"+(i+1)+"个同学的名字是"+students[i]);
        }
    }
    public static String randomStudent(String[] students)
    {
        //根据数组长度获取随机的索引
        int index= new Random().nextInt(students.length);
        //通过随机数获得随机的名字
        String name = students[index];
        //返回随机的名字
        return name;
    }
}

