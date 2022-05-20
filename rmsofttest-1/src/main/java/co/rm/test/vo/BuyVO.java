package co.rm.test.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BuyVO {
	private String member_id;
	private String itemName;
	private String company;
	private int item_price;
	private Date item_buy_date;
	private int item_buy_num;
}
