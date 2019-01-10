package com.wbd.state_18;

public class MiddleState extends AbstractState {

	public MiddleState(AbstractState as) {
    this.sc=as.sc;
    this.stateName="ÖÐµÈ";
    this.score = as.score;
	}



	@Override
	public void checkState() {
		
		if(score<60) {
			sc.setState(new LowState(this));
		}else if(score>=90) {
			sc.setState(new HighState(this));
		}

	}

}
