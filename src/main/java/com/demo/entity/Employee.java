package com.demo.entity;

public class Employee {
	
	

		private int empId;
		private String empName;
		private String empDept;
		private String empAdd;
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpDept() {
			return empDept;
		}
		public void setEmpDept(String empDept) {
			this.empDept = empDept;
		}
		public String getEmpAdd() {
			return empAdd;
		}
		public void setEmpAdd(String empAdd) {
			this.empAdd = empAdd;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empAdd=" + empAdd
					+ "]";
		}
		
		
	}


