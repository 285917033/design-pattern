package com.wbd.state_18;

public class HighState extends AbstractState {

	public HighState(AbstractState as) {
    this.sc=as.sc;
    this.stateName="ÓÅÐã";
    this.score = as.score;
	}



	@Override
	public void checkState() {
		
		if(score<60) {
			sc.setState(new LowState(this));
		}else if(score<90) {
			sc.setState(new MiddleState(this));
		}

	}

}
