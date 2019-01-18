package com.wbd.state_18;

public class LowState extends AbstractState {

	public LowState(AbstractState as) {
    this.sc=as.sc;
    this.stateName="不及格";
    this.score = as.score;
	}

	public LowState(ScoreContext sc) {
		
		this.sc=sc;
		this.stateName="不及格";
		this.score=0;

	}



	@Override
	public void checkState() {
		if(score>=90) {
			sc.setState(new HighState(this));
		}else if(score>=60) {
			sc.setState(new MiddleState(this));
		}
	}

}
