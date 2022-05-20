package co.rm.test.vo;

import java.util.Date;

import lombok.Data;

@Data
public class ItemVO {
	private String itemName;
	private String company;
	private int price;
	private Date register_date;
}
