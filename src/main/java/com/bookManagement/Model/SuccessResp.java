package com.bookManagement.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessResp extends BaseResp {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("stat")
	private static final String STAT = "ok";

	@JsonProperty("data")
	@JsonInclude(Include.NON_NULL)
	private Object rsp;

	public SuccessResp() {

	}

	public SuccessResp(Object response) {
		this.setRsp(response);
	}

	private void setRsp(Object response) {
		rsp = response;
		
	}

}