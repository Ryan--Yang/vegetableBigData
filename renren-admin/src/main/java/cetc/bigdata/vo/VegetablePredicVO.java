package cetc.bigdata.vo;

import io.renren.modules.sys.entity.SysVegetableEntity;

/**
 * 前台使用蔬菜信息VO实体
 * @author ryanyang
 *
 */
public class VegetablePredicVO extends SysVegetableEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5078959155468425585L;

	public VegetablePredicVO() {
		super();
	}
	
	public VegetablePredicVO(double price, String time) {
		
		this.setAvePrice(price);
		this.setTime(time);
	}
	
}
