package com.employee.domain;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class EmployeeDTO {
	@ApiModelProperty(hidden=true)
	private Integer id;

	@ApiModelProperty(required = true, example="Jane", notes="max 14 characters", allowableValues = "range[1, 14]")
	private String firstName;

	@ApiModelProperty(required = true, example="Doe", notes="max 16 characters", allowableValues = "range[1, 16]")
	private String lastName;

	@ApiModelProperty(required = true, example="2017-01-24")
	private String hireDate;

	private List<SalaryDTO> salaries;

	private List<DeptEmplDTO> deptEmpls;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public List<SalaryDTO> getSalaries() {
		return salaries;
	}

	public void setSalaries(List<SalaryDTO> salaries) {
		this.salaries = salaries;
	}

	public List<DeptEmplDTO> getDeptEmpls() {
		return deptEmpls;
	}

	public void setDeptEmpls(List<DeptEmplDTO> deptEmpls) {
		this.deptEmpls = deptEmpls;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", hireDate=" + hireDate
				+ "]";
	}
}
