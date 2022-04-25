public class exercise2
{

    public static  void main(String[] args)
    {
        
        oneexercisephone oneexercisephone=new oneexercisephone("小米",9999,5,"5T",7.5);
        System.out.println("-----------------商品清单------------------");
        System.out.print("手机名称\t"+"价格\t"+"总数\t"+"配置\t"+"尺寸\t"+"\n");
        oneexercisephone.shuchu();
        oneexercisephone oneexercisephone2=new oneexercisephone("华为",9999,5,"5T",7.5);
        System.out.println();
        oneexercisephone2.shuchu();



        System.out.println("\n商品总数"+(oneexercisephone.getAllsum()+oneexercisephone2.getAllsum()));
    }

    }
class  oneexercisephone
{
    private String phonename;
    private   int price;   //价格
    private  int allsum; //总数
    private   String phoneConfig;  //配置
    private   double phonesize;


    oneexercisephone(String phonename, int price, int allsum, String phoneConfig, double phonesize)
    {
        this.phonename=phonename;
        this.price=price;
        this.allsum=allsum;
        this.phoneConfig=phoneConfig;
        this.phonesize=phonesize;
    }

    public String getPhonename() {
        return phonename;
    }

    public void setPhonename(String phonename) {
        this.phonename = phonename;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAllsum() {
        return allsum;
    }

    public void setAllsum(int allsum) {
        this.allsum = allsum;
    }

    public String getPhoneConfig() {
        return phoneConfig;
    }

    public void setPhoneConfig(String phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    public double getPhonesize() {
        return phonesize;
    }

    public void setPhonesize(double phonesize) {
        this.phonesize = phonesize;
    }

    public  void shuchu()
    {
        System.out.print(phonename+"     "+price+"       "+allsum+"      "+phoneConfig+"      "+phonesize);
    }


     class store
     {
         private oneexercisephone [] oneexercisephones;

         public oneexercisephone[] getOneexercisephones() {
             return oneexercisephones;
         }

         public void setOneexercisephones(oneexercisephone[] oneexercisephones) {
             this.oneexercisephones = oneexercisephones;
         }

         public store(oneexercisephone[] oneexercisephones) {
             this.oneexercisephones = oneexercisephones;
         }


         public void printPhones()
         {
             for (int i=0;i<oneexercisephones.length;i++)
             {
                 System.out.println("商品名称："+oneexercisephones[i].getPhonename()+"\t"+"商品价格："+oneexercisephones[i].getPrice()+"\t"+"商品总数："+oneexercisephones[i].getAllsum()+"\t"+"商品配置："+oneexercisephones[i].getPhoneConfig()+"\t"+"商品尺寸："+oneexercisephones[i].getPhonesize());
             }
         }

         public void printTable()
         {
             System.out.println("--------------清单列表--------------");
             this.printPhones();
             System.out.println("-----------------------------------------");
         }
     }

}
