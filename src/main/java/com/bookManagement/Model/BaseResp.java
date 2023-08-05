package com.bookManagement.Model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;

@Getter
@JsonPropertyOrder("{stat}")
@JsonRootName("rsp")
public class BaseResp implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("stat")
	private String stat = "ok";
	
	public BaseResp() {
		this.stat = "ok";
	}
}
