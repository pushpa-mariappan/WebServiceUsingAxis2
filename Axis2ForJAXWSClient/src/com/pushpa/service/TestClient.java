package com.pushpa.service;

public class TestClient {

	public static void main(String args[])throws Exception{
		
		CalServiceStub stub = new CalServiceStub();
		
		CalServiceStub.Add param = new CalServiceStub.Add();
		
		param.setI(10);
		param.setJ(7);
		
		CalServiceStub.AddResponse res = stub.add(param);
		
		
		System.out.println(res.get_return());
		
		
		
	}
	
	
}
