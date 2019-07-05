package cn.tcmp.entity;
import lombok.Data;

import java.util.Date;
import java.sql.*;

/**
 * net_value_table  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
/**
 * 净值表
* */
public class Net_value_table{
	private int NetWorthID;
	private Product_list ProductID;//产品ID
	private Income_type_statement IncomeTypeID;//收益类型ID
	private String SetUpBatch;
	private String NetWorth;
	private String CumulativeNetWorth;
	private String ExtremelyProfitable;
	private String RateOfReturn;
	private Date ValuationDate;
	private Date DateOfPublication;
	private int OperatorID;//操作人ID
	private Timestamp OperatingDate;



}
