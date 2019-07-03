package cn.tcmp.entity;

import lombok.Data;

/**
 * product_list  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
/**
 * 产品表
 * */
public class Product_list{
	private int ProductID;
	private Product_classification_table ProductClassificationID;//产品分类ID
	private Item_sheet ItemID;//项目ID
	private String ProductCode;
	private String ProductName;
	private Product_investment ProductsToId;//产品投向ID
	private String InvestmentConsultant;
	private String Distributionchannel;
	private String structuretype;
	private String Contractprefix;
	private String ProductRiskLevel;
	private String SuitableforCustomerRiskLevel;
	private String ProductDescription;
	private String Remarks;
	private String Incometype;
	private String Incomedistributioncycle;
	private String ProfitDistributionDescription;
	private String Opencycle;
	private String OpenPeriodDescription;
	private String Closureperiod;
	private String Closedperiodunit;
	private String Isitredeemable;
	private String RedemptionRate;
	private String RedemptionRestriction;
	private String IsAdditionPermissible;
	private int OperationsManagerA;
	private int OperationsManagerB;



}
