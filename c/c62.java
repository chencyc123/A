package c;

import java.util.Scanner;

/**
  * 吃货联盟订餐系统
 * @author CYC
 *
 */
public class c62{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //数据主体：一组订单信息
        String[] names=new String[4];//订餐人
        String[] dishMegs=new String[4];//所订餐品信息
        int[] times=new int[4];//送餐时间
        String[] addresses=new String[4];//送餐地址
        int[] states=new int[4];//订单状态  0：已预订  1：已完成
        double[] sumPrices=new double[4];//总金额

        //初始化2条订单信息	总金额没超过50加送餐费6
        names[0]="张晴";//订餐名字
        dishMegs[0]="鱼香肉丝 1份";//订餐产品名信息
        times[0]=12;//订餐时间
        addresses[0]="天成路209号";//订餐地址
        states[0]=1;//订单状态： 0；已预订  1：已完成
        sumPrices[0]=24.00; //总金额


        names[1]="张晴";//订餐名字
        dishMegs[1]="红烧带鱼 2份";//订餐产品名信息
        times[1]=12;//订餐时间
        addresses[1]="天成路209号";//订餐地址
        states[1]=0;//订单状态： 0；已预订  1：已完成
        sumPrices[1]=76.00; //总金额


        //数据主体，一组餐品信息
        String[] dishNames= {"红烧带鱼","鱼香肉丝","时令蔬菜"};//餐品名字
        double[] prices= {38.00,18.00,10.00};//餐品价格
        int[] praiseNums=new int[3];//点赞

        Scanner input=new Scanner(System.in);
        //循环（do-while）
        int num=-1;//记录用户输入的数字
        do {
            //显示主菜单
            System.out.println("**********************************************************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("***********************************************************");

            //提示用户输入功能编号，并执行相应功能
            System.out.print("请先择：");
            int choose=input.nextInt();//记录用户选择的功能编号


            boolean isAdd=false;//true：记录找到一个为空的位置，可以插入   false：没有找到

            //根据用户输入的功能编号，执行相应功能
            switch(choose) {
                case 1:
                    //1.我要订餐
                    System.out.println("********我要订餐********");

                    //查找要插入的位置
                    for (int i = 0; i <names.length; i++) {
                        //如果找到为空的位置，记录下来
                        if(names[i]==null) {
                            //记录找到一个为空的位置
                            isAdd=true;

                            //执行插入操作
                            //a.显示所有课供选择的餐品信息
                            System.out.println("序号\t餐品名\t单价\t点赞数");
                            for(int j=0;j<dishNames.length;j++) {
                                String price=prices[j]+"元";
                                String praise=praiseNums[j]+"赞";
                                System.out.println((j+1)+"\t"+dishNames[j]+"\t"+price+"\t"+praise);
                            }

                            //输入所选择餐品/编号以及份数
                            System.out.print("请选择订餐品序号：");
                            int chooseDish=input.nextInt();
                            System.out.print("请选择所订的份数：");
                            int number=input.nextInt();
                            String dishMeg=dishNames[chooseDish-1]+" "+number+"份";


                            //b.输入订餐人姓名
                            System.out.print("请输入订餐人姓名：");
                            String name=input.next();

                            //c.输入送餐时间
                            System.out.print("请输入送餐时间（10~20整点送餐）");
                            int time=input.nextInt();
                            //如果输错了，重复输入
                            while(time<10||time>20) {
                                System.out.print("对不起，您的输入有误，请输入10~20之间的整数：");
                                time=input.nextInt();
                            }

                            //d.输入送餐地址
                            System.out.print("请输入送餐地址：");
                            String address=input.next();

                            //计算餐费
                            double sumPrice=prices[chooseDish-1]*number;

                            //送餐费，当餐费达到50元时，免6元送餐费
                            double deliCharge=sumPrice>=50?0.0:6.0;

                            //显示订单信息
                            System.out.println("订单成功！");
                            System.out.println("您的订单是："+dishMeg);
                            System.out.println("订餐人："+name);
                            System.out.println("送餐时间："+time+"点");
                            System.out.println("送餐地址："+address);
                            System.out.println("餐费"+sumPrice+",送餐费："+deliCharge+"元");
                            System.out.println("总金额："+(sumPrice+deliCharge)+"元");

                            //保存数据
                            names[i]=name;
                            dishMegs[i]=dishMeg;
                            times[i]=time;
                            addresses[i]=address;
                            sumPrices[i]=sumPrice+deliCharge;

                            break;
                        }
                    }


                    //如果没有找到为空的位置，则提示信息
                    if(!isAdd) {
                        System.out.println("对不起，您的餐袋已满！");
                    }

                    break;
                case 2:
                    //2.查看餐袋
                    System.out.println("************查看餐袋************");
                    System.out.println("序号\t订餐人\t所订餐品信息\t\t送餐时间\t餐品地址\t\t总金额\t\t状态");

                    //遍历数组
                    for(int i=0;i<names.length;i++) {
                        if(names[i]!=null) {
                            String time=times[i]+"点";//时间
                            String sumPrice=sumPrices[i]+"元";//总金额
                            String state=states[i]==0?"已预订":"已完成";//状态
                            System.out.println((i+1)+"\t\t"+names[i]+"\t"+dishMegs[i]+"\t\t"+time+"\t\t"+addresses[i]+"\t\t"+sumPrice+"\t\t"+state);
                        }
                    }

                    break;
                case 3:
                    //3.签收订单
                    System.out.println("*************签收订单************");
                    //要求用户输入一个签收的订单序号
                    System.out.print("请输入要签收的订单序号：");
                    int signOrderId=input.nextInt();
                    boolean isFind=false;//记录是否找到了这条订单  true:已找到  false：没有找到
                    //查找这订单（循环遍历）
                    for(int i=0;i<names.length;i++) {
                        //1、找到，状态是已完成（已签收完毕）：提示不能再签收
                        if(names[i]!=null&& states[i]==1&& signOrderId==i+1) {
                            System.out.println("对不起，您选择的订单已经完成签收，不能再次签收！");
                            isFind=true;
                            break;
                        }
                        //2找到，状态是已预订（没有完成签收）：可以签收
                        else if(names[i]!=null&& states[i]==0&& signOrderId==i+1){
                            states[i]=1;//状态值改成已完成状态
                            System.out.println("订单签收成功！");
                            isFind=true;
                            break;
                        }
                    }


                    //条件判断：如果没有找到这条订单，才去提示没有找到
                    //3.没找到，提示信息没有找到
                    if(!isFind) {
                        System.out.println("对不起，次订单不存在！");
                    }


                    break;
                case 4:
                    //4.删除订单
                    //输入哟啊删除的订单序号（从1开始）
                    System.out.println("**********删除订单**********");
                    System.out.print("请输入要删除的订单序号：");
                    int delId=input.nextInt();

                    int delIndex=-1;//记录删除订单的下标
                    boolean isDelFind=false;//记录是否找到此条订单 true：找到  false：没找到
                    //循环查找这条订单
                    for(int i=0;i<names.length;i++){
                        //找到此订单，已签收：执行删除操作（先记录要删除的订单序号）

                        if(names[i]!=null&& states[i]==1 && delId==i+1){
                            delIndex=i;
                            isDelFind=true;
                            break;
                        }
                        //找到此订单，且未签收：提示信息
                        else if(names[i]!=null&& states[i]==0 && delId==i+1){
                            System.out.println("您选择的订单未签收，不能删除！");
                            isDelFind=true;
                            break;
                        }
                    }

                    //未找到此订单：提示信息
                    if(!isDelFind){
                        System.out.println("对不起，此条订单不存在！");
                    }

                    //执行删除操作
                    if(delIndex!=-1){
                        //删除操作（循环移位）
                        //从要删除的元素后面一个开始，到数组最后一个元素依次向前移动一位
                        for(int i=delIndex+1;i<=names.length-1;i++){
                            names[i-1]=names[i];
                            dishMegs[i-1]=dishMegs[i];
                            times[i-1]=times[i];
                            addresses[i-1]=addresses[i];
                            states[i-1]=states[i];

                        }
                        //最后一位清空
                        names[names.length-1]=null;
                        dishMegs[names.length-1]=null;
                        times[names.length-1]=0;
                        addresses[names.length-1]=null;
                        states[names.length-1]=0;

                        System.out.println("订单删除成功！");

                    }
                    break;
                case 5:
                	 
                    //5.我要点赞
                    System.out.println("*************我要点赞************");
                    //1、显示供点赞的餐品列表
                    System.out.println("序号\t产品名\t\t单价\t\t点赞数");
                    for (int j=0;j<dishNames .length;j++) {
                    	if(!dishNames[j]<0) {
                        String  price=prices[j]+"元";
//                        String  praise=praiseNums[j]+"赞";//有没有赞数直接显示赞数

                        String  praise=praiseNums[j]>0?praiseNums[j]+"赞":" ";//没有赞数显示隐藏
                        System.out.println((j+1)+"\t\t"+dishNames[j]+"\t\t"+price+"\t\t"+praise);
                    	}
                    }
                    
                   
                    //2、输入要点赞的餐品序号
                    System.out.print("请输入要点赞的餐品序号：");
                    int dishId=input.nextInt();
                    
                   

                
                    
                   

                    //4显示点赞数
                    System.out.println("点赞成功！");
                    System.out.println(dishNames[dishId-1]+" "+praiseNums [dishId-1]+"赞");
                    break;
                case 6:
                    //6.退出系统
                    break;
                default:
                    break;
            }


            //当用户输入的功能编号为1~5之外的数字时，退出循环，否则会提示输入0返回
            if(choose<1||choose>5) {
                break;
            }else{
                //提示输入0返回
                System.out.print("输入0返回：");
                num=input.nextInt();
            }


        }while(num==0);
        System.out.println("谢谢使用，欢迎下次光临！");

    }

}
