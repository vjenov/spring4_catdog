package com.company.web.command;

import javax.servlet.http.HttpServletRequest;

import com.company.web.enums.Actions;

public class Commander {
	public static Command order(HttpServletRequest request) {
		Command cmd = null;
		System.out.println(2);
		try {
			switch (Actions.valueOf(request.getParameter("action").toUpperCase())) {
			case CREATE: cmd = null; break;
			case LOGIN : cmd = null; break;
		
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return cmd;
	}
}
