public class exerciseone
{
    public static void main(String[] args)
    {
        //小米手机
        String MiphoneName="某米12 pro plus max ultra 皇帝版";
        double MiphomeSize=6.7;
        double Miprice=8848;
        String MipConfig="soc 田鸡200000，64G运存，2Trom";
        int MiphoneCount=5;
        //花为
        String HWphoneName="某为mate40 pro plus max ultra 皇帝版";
        double HWphomeSize=6.8;
        double HWprice=88488;
        String HWpConfig="soc 麒麟90000，64G运存，2Trom";
        int HWphoneCount=10;
        //果子
        String ApplephoneName="某果mate40 pro plus max ultra 皇帝版";
        double ApplephomeSize=6.8;
        double Appleprice=88488;
        String ApplepConfig="soc M10 ultra，64T运存，2PBrom";
        int ApplephoneCount=10;

        System.out.println("-----------库存清单--------------");
        System.out.println("品牌 尺寸 配置 库存数");
        System.out.println(MiphoneName+MiphomeSize+MipConfig+MiphoneCount);
        System.out.println(HWphoneName+HWphomeSize+HWpConfig+HWphoneCount);
        System.out.println(ApplephoneName+ApplephomeSize+ApplepConfig+ApplephoneCount);
        int totalCount=HWphoneCount+ApplephoneCount+MiphoneCount;
        Double totalPrice=HWphoneCount*HWphomeSize+ApplephoneCount*ApplephomeSize+MiphoneCount*MiphomeSize;
        System.out.println("库存总数"+totalCount);
        System.out.println("总金额"+totalPrice);
    }


}
