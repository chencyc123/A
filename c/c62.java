package c;

import java.util.Scanner;

/**
  * �Ի����˶���ϵͳ
 * @author CYC
 *
 */
public class c62{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //�������壺һ�鶩����Ϣ
        String[] names=new String[4];//������
        String[] dishMegs=new String[4];//������Ʒ��Ϣ
        int[] times=new int[4];//�Ͳ�ʱ��
        String[] addresses=new String[4];//�Ͳ͵�ַ
        int[] states=new int[4];//����״̬  0����Ԥ��  1�������
        double[] sumPrices=new double[4];//�ܽ��

        //��ʼ��2��������Ϣ	�ܽ��û����50���Ͳͷ�6
        names[0]="����";//��������
        dishMegs[0]="������˿ 1��";//���Ͳ�Ʒ����Ϣ
        times[0]=12;//����ʱ��
        addresses[0]="���·209��";//���͵�ַ
        states[0]=1;//����״̬�� 0����Ԥ��  1�������
        sumPrices[0]=24.00; //�ܽ��


        names[1]="����";//��������
        dishMegs[1]="���մ��� 2��";//���Ͳ�Ʒ����Ϣ
        times[1]=12;//����ʱ��
        addresses[1]="���·209��";//���͵�ַ
        states[1]=0;//����״̬�� 0����Ԥ��  1�������
        sumPrices[1]=76.00; //�ܽ��


        //�������壬һ���Ʒ��Ϣ
        String[] dishNames= {"���մ���","������˿","ʱ���߲�"};//��Ʒ����
        double[] prices= {38.00,18.00,10.00};//��Ʒ�۸�
        int[] praiseNums=new int[3];//����

        Scanner input=new Scanner(System.in);
        //ѭ����do-while��
        int num=-1;//��¼�û����������
        do {
            //��ʾ���˵�
            System.out.println("**********************************************************");
            System.out.println("1.��Ҫ����");
            System.out.println("2.�鿴�ʹ�");
            System.out.println("3.ǩ�ն���");
            System.out.println("4.ɾ������");
            System.out.println("5.��Ҫ����");
            System.out.println("6.�˳�ϵͳ");
            System.out.println("***********************************************************");

            //��ʾ�û����빦�ܱ�ţ���ִ����Ӧ����
            System.out.print("������");
            int choose=input.nextInt();//��¼�û�ѡ��Ĺ��ܱ��


            boolean isAdd=false;//true����¼�ҵ�һ��Ϊ�յ�λ�ã����Բ���   false��û���ҵ�

            //�����û�����Ĺ��ܱ�ţ�ִ����Ӧ����
            switch(choose) {
                case 1:
                    //1.��Ҫ����
                    System.out.println("********��Ҫ����********");

                    //����Ҫ�����λ��
                    for (int i = 0; i <names.length; i++) {
                        //����ҵ�Ϊ�յ�λ�ã���¼����
                        if(names[i]==null) {
                            //��¼�ҵ�һ��Ϊ�յ�λ��
                            isAdd=true;

                            //ִ�в������
                            //a.��ʾ���пι�ѡ��Ĳ�Ʒ��Ϣ
                            System.out.println("���\t��Ʒ��\t����\t������");
                            for(int j=0;j<dishNames.length;j++) {
                                String price=prices[j]+"Ԫ";
                                String praise=praiseNums[j]+"��";
                                System.out.println((j+1)+"\t"+dishNames[j]+"\t"+price+"\t"+praise);
                            }

                            //������ѡ���Ʒ/����Լ�����
                            System.out.print("��ѡ�񶩲�Ʒ��ţ�");
                            int chooseDish=input.nextInt();
                            System.out.print("��ѡ�������ķ�����");
                            int number=input.nextInt();
                            String dishMeg=dishNames[chooseDish-1]+" "+number+"��";


                            //b.���붩��������
                            System.out.print("�����붩����������");
                            String name=input.next();

                            //c.�����Ͳ�ʱ��
                            System.out.print("�������Ͳ�ʱ�䣨10~20�����Ͳͣ�");
                            int time=input.nextInt();
                            //�������ˣ��ظ�����
                            while(time<10||time>20) {
                                System.out.print("�Բ���������������������10~20֮���������");
                                time=input.nextInt();
                            }

                            //d.�����Ͳ͵�ַ
                            System.out.print("�������Ͳ͵�ַ��");
                            String address=input.next();

                            //����ͷ�
                            double sumPrice=prices[chooseDish-1]*number;

                            //�Ͳͷѣ����ͷѴﵽ50Ԫʱ����6Ԫ�Ͳͷ�
                            double deliCharge=sumPrice>=50?0.0:6.0;

                            //��ʾ������Ϣ
                            System.out.println("�����ɹ���");
                            System.out.println("���Ķ����ǣ�"+dishMeg);
                            System.out.println("�����ˣ�"+name);
                            System.out.println("�Ͳ�ʱ�䣺"+time+"��");
                            System.out.println("�Ͳ͵�ַ��"+address);
                            System.out.println("�ͷ�"+sumPrice+",�Ͳͷѣ�"+deliCharge+"Ԫ");
                            System.out.println("�ܽ�"+(sumPrice+deliCharge)+"Ԫ");

                            //��������
                            names[i]=name;
                            dishMegs[i]=dishMeg;
                            times[i]=time;
                            addresses[i]=address;
                            sumPrices[i]=sumPrice+deliCharge;

                            break;
                        }
                    }


                    //���û���ҵ�Ϊ�յ�λ�ã�����ʾ��Ϣ
                    if(!isAdd) {
                        System.out.println("�Բ������Ĳʹ�������");
                    }

                    break;
                case 2:
                    //2.�鿴�ʹ�
                    System.out.println("************�鿴�ʹ�************");
                    System.out.println("���\t������\t������Ʒ��Ϣ\t\t�Ͳ�ʱ��\t��Ʒ��ַ\t\t�ܽ��\t\t״̬");

                    //��������
                    for(int i=0;i<names.length;i++) {
                        if(names[i]!=null) {
                            String time=times[i]+"��";//ʱ��
                            String sumPrice=sumPrices[i]+"Ԫ";//�ܽ��
                            String state=states[i]==0?"��Ԥ��":"�����";//״̬
                            System.out.println((i+1)+"\t\t"+names[i]+"\t"+dishMegs[i]+"\t\t"+time+"\t\t"+addresses[i]+"\t\t"+sumPrice+"\t\t"+state);
                        }
                    }

                    break;
                case 3:
                    //3.ǩ�ն���
                    System.out.println("*************ǩ�ն���************");
                    //Ҫ���û�����һ��ǩ�յĶ������
                    System.out.print("������Ҫǩ�յĶ�����ţ�");
                    int signOrderId=input.nextInt();
                    boolean isFind=false;//��¼�Ƿ��ҵ�����������  true:���ҵ�  false��û���ҵ�
                    //�����ⶩ����ѭ��������
                    for(int i=0;i<names.length;i++) {
                        //1���ҵ���״̬������ɣ���ǩ����ϣ�����ʾ������ǩ��
                        if(names[i]!=null&& states[i]==1&& signOrderId==i+1) {
                            System.out.println("�Բ�����ѡ��Ķ����Ѿ����ǩ�գ������ٴ�ǩ�գ�");
                            isFind=true;
                            break;
                        }
                        //2�ҵ���״̬����Ԥ����û�����ǩ�գ�������ǩ��
                        else if(names[i]!=null&& states[i]==0&& signOrderId==i+1){
                            states[i]=1;//״ֵ̬�ĳ������״̬
                            System.out.println("����ǩ�ճɹ���");
                            isFind=true;
                            break;
                        }
                    }


                    //�����жϣ����û���ҵ�������������ȥ��ʾû���ҵ�
                    //3.û�ҵ�����ʾ��Ϣû���ҵ�
                    if(!isFind) {
                        System.out.println("�Բ��𣬴ζ��������ڣ�");
                    }


                    break;
                case 4:
                    //4.ɾ������
                    //����Ӵ��ɾ���Ķ�����ţ���1��ʼ��
                    System.out.println("**********ɾ������**********");
                    System.out.print("������Ҫɾ���Ķ�����ţ�");
                    int delId=input.nextInt();

                    int delIndex=-1;//��¼ɾ���������±�
                    boolean isDelFind=false;//��¼�Ƿ��ҵ��������� true���ҵ�  false��û�ҵ�
                    //ѭ��������������
                    for(int i=0;i<names.length;i++){
                        //�ҵ��˶�������ǩ�գ�ִ��ɾ���������ȼ�¼Ҫɾ���Ķ�����ţ�

                        if(names[i]!=null&& states[i]==1 && delId==i+1){
                            delIndex=i;
                            isDelFind=true;
                            break;
                        }
                        //�ҵ��˶�������δǩ�գ���ʾ��Ϣ
                        else if(names[i]!=null&& states[i]==0 && delId==i+1){
                            System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ����");
                            isDelFind=true;
                            break;
                        }
                    }

                    //δ�ҵ��˶�������ʾ��Ϣ
                    if(!isDelFind){
                        System.out.println("�Բ��𣬴������������ڣ�");
                    }

                    //ִ��ɾ������
                    if(delIndex!=-1){
                        //ɾ��������ѭ����λ��
                        //��Ҫɾ����Ԫ�غ���һ����ʼ�����������һ��Ԫ��������ǰ�ƶ�һλ
                        for(int i=delIndex+1;i<=names.length-1;i++){
                            names[i-1]=names[i];
                            dishMegs[i-1]=dishMegs[i];
                            times[i-1]=times[i];
                            addresses[i-1]=addresses[i];
                            states[i-1]=states[i];

                        }
                        //���һλ���
                        names[names.length-1]=null;
                        dishMegs[names.length-1]=null;
                        times[names.length-1]=0;
                        addresses[names.length-1]=null;
                        states[names.length-1]=0;

                        System.out.println("����ɾ���ɹ���");

                    }
                    break;
                case 5:
                	 
                    //5.��Ҫ����
                    System.out.println("*************��Ҫ����************");
                    //1����ʾ�����޵Ĳ�Ʒ�б�
                    System.out.println("���\t��Ʒ��\t\t����\t\t������");
                    for (int j=0;j<dishNames .length;j++) {
                    	if(!dishNames[j]<0) {
                        String  price=prices[j]+"Ԫ";
//                        String  praise=praiseNums[j]+"��";//��û������ֱ����ʾ����

                        String  praise=praiseNums[j]>0?praiseNums[j]+"��":" ";//û��������ʾ����
                        System.out.println((j+1)+"\t\t"+dishNames[j]+"\t\t"+price+"\t\t"+praise);
                    	}
                    }
                    
                   
                    //2������Ҫ���޵Ĳ�Ʒ���
                    System.out.print("������Ҫ���޵Ĳ�Ʒ��ţ�");
                    int dishId=input.nextInt();
                    
                   

                
                    
                   

                    //4��ʾ������
                    System.out.println("���޳ɹ���");
                    System.out.println(dishNames[dishId-1]+" "+praiseNums [dishId-1]+"��");
                    break;
                case 6:
                    //6.�˳�ϵͳ
                    break;
                default:
                    break;
            }


            //���û�����Ĺ��ܱ��Ϊ1~5֮�������ʱ���˳�ѭ�����������ʾ����0����
            if(choose<1||choose>5) {
                break;
            }else{
                //��ʾ����0����
                System.out.print("����0���أ�");
                num=input.nextInt();
            }


        }while(num==0);
        System.out.println("ллʹ�ã���ӭ�´ι��٣�");

    }

}
