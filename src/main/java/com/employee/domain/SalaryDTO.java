package com.employee.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SalaryDTO {
	@ApiModelProperty(hidden=true)
	private Integer id;

	@ApiModelProperty(required = true)
	private Integer emplId;

	@ApiModelProperty(required = true)
	private Integer salary;

	@ApiModelProperty(required = true, example="2017-01-24")
	private String fromDate;

	@ApiModelProperty(required = false, example="2017-01-24")
	private String toDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEmplId() {
		return emplId;
	}

	public void setEmplId(Integer emplId) {
		this.emplId = emplId;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
}