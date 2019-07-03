package cn.tcmp.entity;
import lombok.Data;

import java.sql.Date;

/**
 * material_period  generated at 2019-06-28 08:07:37 by: eric
 */
@Data
/**
 * 材料时期表
 * */
public class Material_period{
	private int MaterialPeriodID;
	private String MaterialPeriodName;
	private Push_direction_table PushDirectionID;//推送方向ID
	private int IsNotPush;
	private String NoteDescription;
	private int OperatorID;//操作人ID
	private String OperatingTime;
	private String startTime,endTime;
}
