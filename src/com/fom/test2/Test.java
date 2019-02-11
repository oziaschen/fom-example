package com.fom.test2;

import java.util.ArrayList;
import java.util.List;

import com.fom.context.Context;
import com.fom.context.Executor;

public class Test extends Context {
	
	private static final long serialVersionUID = 7593940468052384937L;

	@Override
	protected List<String> getUriList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("/a/b/c/test1.txt");
		list.add("/a/b/c/test2.txt");
		return list;
	}

	@Override
	protected Executor createExecutor(String sourceUri) throws Exception {
		
		return new Executor(sourceUri){

			@Override
			protected boolean exec() throws Exception {
				System.out.println("处理文件:" + sourceUri); 
				Thread.sleep(3000);
				return true;
			}
			
		};
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.start();
	}
}
