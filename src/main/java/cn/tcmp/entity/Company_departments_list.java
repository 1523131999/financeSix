package cn.tcmp.entity;

import lombok.Data;

/**
 * company_departments_list  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Company_departments_list{
	private int DepartmentID;
	private Channel_list CompanyID;//公司ID||渠道ID
	private String Departmentname;
	private String DepartmentalContacts;
	private String IntroductionofDepartmentalContacts;
	private String DepartmentalIntroduction;



}
