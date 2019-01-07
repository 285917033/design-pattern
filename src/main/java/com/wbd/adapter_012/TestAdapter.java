package com.wbd.adapter_012;

public class TestAdapter {

	public static void main(String[] args) {
		
		Adapter adapter = new Adapter(new Current());
		
		adapter.use18V();
		
		PS2 p = new Adapter2();
		p.isPS2();

	}

}
