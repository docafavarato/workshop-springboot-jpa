package com.favarato.course.entities.enums;

public enum UserType {
	STANDART (1),
	PREMIUM (2);
	
	private int code;
	
	private UserType(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public static UserType valueOf(int code) {
		for (UserType value : UserType.values()) {
			if (value.getCode() == code) {
				return value;
			}
		} throw new IllegalArgumentException("Invalid UserType code");
	}
}
