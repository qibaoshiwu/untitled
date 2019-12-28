package com.company;

public class ShuiXianHuaTest {
	
	public static void main(String[] agrs) {
		

		//1��д��1000�������е�ˮ�ɻ���
		//2����¼�ж��ٸ�ˮ�ɻ���
		//3���������ˮ�ɻ����ĺ�
		//ˮ�ɻ�=ÿ��λ����������
		
		for(int i =1;i < 1000;i++) {
			
			//��������İ�λ�ϵ���
			int bai = i / 100;
			
			//���������ʮλ�ϵ���
			int shi = i % 100 /10;
			
			//��������ĸ�λ�ϵ���
			int ge = i % 10;
			
			if(i == bai*bai*bai+shi*shi*shi+ge*ge*ge) {
				
				System.out.println(i);
			}
		}
	}
}
