package com.employee.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class DepartmentDTO {
	@ApiModelProperty(hidden=true)
	private Integer id;

	@ApiModelProperty(required = true, example="Engineering", notes="max 30 characters", allowableValues = "range[1, 30]")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
