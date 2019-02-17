package com.fom.test;

import java.util.ArrayList;
import java.util.List;

import com.fom.context.Context;
import com.fom.context.Task;

public class TestTask extends Context {
	
	private static final long serialVersionUID = 7593940468052384937L;

	@Override
	protected Task createTask(String id) throws Exception {
		return new Task(id){
			@Override
			protected boolean exec() throws Exception {
				System.out.println("任务执行。。。"); 
				Thread.sleep(3000);
				return true;
			}
			
		};
	}

	@Override
	protected List<String> getTaskIdList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("test");
		return list;
	}
	
	public static void main(String[] args) {
		new TestTask().startup();
	}
}
