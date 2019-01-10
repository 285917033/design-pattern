package com.wbd.state_18;

/**
 * 抽象状态类
 * @author jwh
 *
 */
public abstract class AbstractState {

	protected ScoreContext sc;
	
	//状态名
	protected String stateName;
	
	protected int score;
	
	//检查当前状态
	public abstract void checkState(); 
	
	public void addScore(int x) {
		score+=x;
		System.out.print("加上："+x+"分，\t当前分数："+score );
		checkState();
        System.out.println("分，\t当前状态："+sc.getState().stateName);
	}
	
}
