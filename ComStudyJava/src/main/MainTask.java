package main;

import java.util.ArrayList;

public class MainTask {
	
	//public static int a[]= {12,23,2,66,34,57,89,90,78,89,99,100};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {12,23,2,66,34,57,89,90,78,89,99,100};
	
	

    FindNumber fn=new FindNumber();
    System.out.println("ƽ���֣�"+fn.ave(a));
    System.out.println("���ֵ��"+fn.max_num(a));
    System.out.println("��Сֵ��"+fn.min_num(a));
    System.out.println("��ֵ"+fn.max(a));
    System.out.println("�����ʣ�"+fn.ji_number(a));
    System.out.println("�����ʣ�"+fn.sup_num(a));
    
    
    
	}

}
