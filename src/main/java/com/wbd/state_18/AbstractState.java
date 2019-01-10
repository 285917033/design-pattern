package com.wbd.state_18;

/**
 * ����״̬��
 * @author jwh
 *
 */
public abstract class AbstractState {

	protected ScoreContext sc;
	
	//״̬��
	protected String stateName;
	
	protected int score;
	
	//��鵱ǰ״̬
	public abstract void checkState(); 
	
	public void addScore(int x) {
		score+=x;
		System.out.print("���ϣ�"+x+"�֣�\t��ǰ������"+score );
		checkState();
        System.out.println("�֣�\t��ǰ״̬��"+sc.getState().stateName);
	}
	
}
