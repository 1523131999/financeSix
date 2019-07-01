package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * blacklist  generated at 2019-06-26 10:30:13 by: eric
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//黑名单
public class Blacklist{
	private Integer blackid;
	private String blackremarks;
	private Date newaddblackdate;
	private Date newrevokeblackdate;
	private String addingpeople;
	//修改为客户
	private Client client;

}
