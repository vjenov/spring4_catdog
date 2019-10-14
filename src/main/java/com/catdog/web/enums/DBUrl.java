package com.catdog.web.enums;

public enum DBUrl {
	ORACLE_URL,
	MARIA_URL;
	
	@Override
	public String toString() {
		String url = "";
		switch (this) {
		case ORACLE_URL : url = "jdbc:oracle:thin:@localhost:1521:xe"; break;
	
		}
		return url;
	}
}
