package com.employee.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class DeptEmplDTO {
	@ApiModelProperty(hidden=true)
	private Integer id;

	@ApiModelProperty(required = true)
	private Integer emplId;

	@ApiModelProperty(required = true)
	private Integer deptId;

	@ApiModelProperty(required = true, example="2017-01-24")
	private String fromDate;

	@ApiModelProperty(required = false, example="2017-01-24")
	private String toDate;

	private DepartmentDTO department;

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

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
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

	public DepartmentDTO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}
}