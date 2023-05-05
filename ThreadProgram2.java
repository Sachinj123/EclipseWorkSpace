package com.cdac.thread;

import java.lang.Thread.State;

public class ThreadProgram2 {

	public static void main(String[] args) {
		
		Thread thread = new Thread();
		
		String name = thread.getName();
		System.out.println("Name of The Thread: "+name);
		
		int number = thread.getPriority();
		System.out.println("Priority of the Thread: "+number);
		
		State state = thread.getState();
		System.out.println("State of the Thread: "+state);
		
		long id = thread.getId();
		System.out.println("Id:"+id);
		
		String groupName = thread.getThreadGroup().getName();
		System.out.println("Group Name:"+groupName);

	}

}
