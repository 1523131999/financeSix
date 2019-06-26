package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * remarks  generated at 2019-06-26 10:30:13 by: eric
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//备注表
public class Remarks{
	private Integer remarksid;
	private String remarkstype;
	private Integer clientid;
	private String remarkstext;
	private Date remarkstime;
	private String registrar;


}
