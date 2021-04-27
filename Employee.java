package com.tyss.springCore.SpringCoreAnnotationBean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee 
{
	private int empno;
	private String ename;
	private Company company;

	

}
