package cn.tcmp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * distributiontransfer  generated at 2019-06-26 10:30:13 by: eric
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//分配转移表
public class Distributiontransfer{
	private Integer dtid;
	private Integer financialmana;
	private Integer whetherfinancialmana;
	private String newfinancialmananame;
	private Integer newwhetherfinancialmana;
	private String distrireason;
	private Integer clientid;

}
