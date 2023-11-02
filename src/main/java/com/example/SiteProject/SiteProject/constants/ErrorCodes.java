package com.example.SiteProject.SiteProject.constants;

import lombok.Getter;

@Getter
public enum ErrorCodes {

	DATA_NOT_FOUND("DATA_NOT_FOUND", "Data not found");

	private final String code;
	private final String message;

	ErrorCodes(String code, String message) {
		this.code = code;
		this.message = message;
	}

}