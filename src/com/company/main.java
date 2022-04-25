package com.company;

public class main
{
    public static void main(String[] args)
    {
    Students students=new Students(18,"张三","男");
    /*
    students.setAge(18);
    students.setName("张三");
    students.setGender("男");
    System.out.println(students.getGender()+students.getName()+students.getAge());
     */
    }
}

class Students
{
         private String name;
         private int age;
         private String gender;

        public void setAge(int age)
        {
            this.age = age;
        }

        public int getAge()
        {
            return age;
        }

        public void setName(String name)
        {
        this.name = name;
        }

         public String getName()
        {
        return name;
        }

        public void setGender(String gender)
        {
            this.gender =gender;
        }

        public String getGender()
        {
            return gender;
        }

        public void  speak()
        {
            System.out.println("我叫张三"+name+"今年"+age);
        }

        public void  thisspeak()
        {
            this.speak();
        }
        /*
        名字要和类名相同
        没有返回值的类型声明
        不能用return可以用return作为结束
        */
        Students( int age, String name, String grade)
        {
            this(18,"xxx");
            /*
            只能在构造方法里面通过this去调用其他方法
            构造方法中使用this调用其他构造方法，this只能在第一行且出现一次
            不能相互调用
             */
            this.age = age;
            this.name = name;
            this.gender = grade;
            System.out.println("无参的构造函数");
        }

        Students (int age, String name)
        {
            this.name = name;
            this.age = age;
        }

        Students()
        {
            System.out.println("无参数的构造函数");
        }


}


