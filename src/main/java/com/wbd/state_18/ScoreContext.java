package com.wbd.state_18;

/**
 * 环境类
 * @author jwh
 *
 */
public class ScoreContext {
	
	//抽象状态类的引用
	private AbstractState state;

	public AbstractState getState() {
		return state;
	}

	public void setState(AbstractState state) {
		this.state = state;
	}

	public void add(int score) {
		state.addScore(score);
	}
	
	public ScoreContext() {
		
		state = new LowState(this);
	}
	
}
