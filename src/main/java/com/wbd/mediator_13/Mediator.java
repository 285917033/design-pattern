package com.wbd.mediator_13;

/**
 * �н���ģʽ
 * @author jwh
 *
 */
public class Mediator {
	
	private Man man;
	
	private Woman  woman;

	public void setMan(Man man) {
		this.man = man;
	}

	public void setWoman(Woman woman) {
		this.woman = woman;
	}
	
	
	public void getPartner(Person person) {
		
		if(person instanceof Man) {
			
			this.setMan((Man)person);
		}else {
			this.setWoman((Woman)person);
		}
		
		
		if(man==null ||woman==null) {
			System.out.println("�Ҳ���gay");
		}else {
			
			if(man.getCondition()==woman.getCondition()) {
				System.out.println("�ŵ�����");
			}else {
				
				System.out.println("��ƥ��");
			}
		}
	}

}
