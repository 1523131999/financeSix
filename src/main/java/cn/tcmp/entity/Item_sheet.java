package cn.tcmp.entity;
import lombok.Data;

import java.util.Date;

/**
 * item_sheet  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
/**
 * 项目表
 * */
public class Item_sheet{
	private int ItemID;
	private String Entryname;
	private Item_type_table ItemtypeID;//项目类型ID
	private String Englishname;
	private String Projectcode;
	private int Projectsizelowercase;
	private String Projectsizecapitalization;
	private int Projectduration;
	private String TermUnit;
	private Date Dateofestablishment;
	private Date MaturityDate;
	private String Financers;
	private Product_classification_table ProductclassificationID;//产品分类ID
	private Channel_list ChanneltableID;//渠道表ID
	private String SourcedockerA;//来源方对接人a
	private String SourcedockerB;//来源方对接人b
	private String SourcedockerC;//来源方对接人c
	private int ProductManagerA;//产品经理A
	private int ProductManagerB;//产品经理B
	private String Custodyaccount;
	private String Custodianbank;
	private String Custodialhouseholdname;
	private String RaisingAccount;
	private String Collectinghouseholdnames;
	private String RaisingBank;
	private String Notes;
	private String RaiseCurrency;
	private String InvestmentCurrency;
	private Integer Manager;
	private Investment_direction_table InvestmentDirectionID;//投资方向ID
	private Integer IsNotStructure;
	private Distribution_of_income IncomeDistributionID;//收益分配方式ID
	private Frequency_of_income_distribution IncomeDistributionFrequencyID;//收益分配频度ID
	private Asset_management_report amrID;//资产管理报告频度ID
	private String ProjectLocation;//项目所在地




}
