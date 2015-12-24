package com.facade.demo;

public class TeaCup {

	boolean teaBagIsSteeped;
	Water facadeWater;
	TeaBag facadeTeaBag;

	public TeaCup() {
		setTeaBagIsSteeped(false);
		System.out.println("�豭׼������");
	}

	public void setTeaBagIsSteeped(boolean isTeaBagSteeped) {
		teaBagIsSteeped = isTeaBagSteeped;
	}

	public boolean getTeaBagIsSteeped() {
		return teaBagIsSteeped;
	}

	public void addFacadeTeaBag(TeaBag facadeTeaBagIn) {
		facadeTeaBag = facadeTeaBagIn;
		System.out.println("��������}����");
	}

	public void addFacadeWater(Water facadeWaterIn) {
		facadeWater = facadeWaterIn;
		System.out.println("ˮ���뱭����");
	}

	public void steepTeaBag() {
		if ((facadeTeaBag != null)
				&& ((facadeWater != null) && (facadeWater.isWaterIsBoiling()))) {
			System.out.println("����͸��������");
			setTeaBagIsSteeped(true);
		} else {
			System.out.println("��û����͸��������");
			setTeaBagIsSteeped(false);
		}
	}

	public String toString() {
		if (this.getTeaBagIsSteeped()) {
			return ("һ��������Ũ�Ĳ�����!");
		} else {
			String tempString = new String("һ������");
			if (facadeWater != null) {
				if (facadeWater.isWaterIsBoiling()) {
					tempString = (tempString + "���з��ڵ�ˮ ");
				} else {
					tempString = (tempString + "���ж�ˮ ");
				}
			} else {
				tempString = (tempString + "û�з�ˮ ");
			}
			if (facadeTeaBag != null) {
				tempString = (tempString + "��һ�����");
			} else {
				tempString = (tempString + "û�в��");
			}
			return tempString;
		}
	}
}
